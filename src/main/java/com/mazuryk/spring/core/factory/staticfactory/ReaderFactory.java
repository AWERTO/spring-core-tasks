package com.mazuryk.spring.core.factory.staticfactory;

import java.util.Map;

public class ReaderFactory {
    //we can use switch-case method to initialize our readerType like this:
//    public static Reader getReader(ReaderType readerType){
//        switch (readerType){
////            case DB_READER: return new DBReader();
////            case FILE_READER: return new FileReader();
////            case SOCKET_READER: return new SocketReader();
////            default: throw new IllegalArgumentException("Invalid reader type");
////        }
        //but in another way, we can do like this:
        private Map<ReaderType, Reader> readers = null;

    public void setReaders(Map<ReaderType, Reader> readers) {
        this.readers = readers;
    }

    public Reader createReader(ReaderType readerType){
        if(readers.containsKey(readerType)){
            return readers.get(readerType);
        }
        throw new IllegalArgumentException("Invalid reader type.");
}
}
