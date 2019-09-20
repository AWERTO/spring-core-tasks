package com.mazuryk.spring.core.factory.staticfactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ReaderConfiguration {
//    In this example we have used a method in ReaderFactory called getReader and use switch-case method
//    @Bean
//    public Reader fileReader(){
//        return ReaderFactory.getReader(ReaderType.FILE_READER);
//    }
//
//    @Bean
//    public Reader socketReader(){
//        return ReaderFactory.getReader(ReaderType.SOCKET_READER);
//    }
//
//    @Bean
//    public Reader dbReader(){
//        return ReaderFactory.getReader(ReaderType.DB_READER);
//    }


//    In this example we would use this...
    @Bean
    public ReaderFactory readerFactory(){
        Map<ReaderType, Reader> readers = new LinkedHashMap();
        readers.put(ReaderType.FILE_READER, new FileReader());
        readers.put(ReaderType.SOCKET_READER, new SocketReader());
        readers.put(ReaderType.DB_READER, new DBReader());

        ReaderFactory readerFactory = new ReaderFactory();
        readerFactory.setReaders(readers);
        return readerFactory;
    }

    @Bean
    public Reader fileReader(){
        return readerFactory().createReader(ReaderType.FILE_READER);
    }

    @Bean
    public Reader socketReader(){
        return readerFactory().createReader(ReaderType.SOCKET_READER);
    }

    @Bean
    public Reader dbReader(){
        return readerFactory().createReader(ReaderType.DB_READER);
    }

}
