package com.mazuryk.spring.core.threading;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

@Configuration
@ComponentScan("com.mazuryk.spring.core.threading")
public class TaskExecutorConfiguration {
    @Bean
    public SyncTaskExecutor syncTaskExecutor(){
        return new SyncTaskExecutor();
    }

    @Bean
    public SimpleAsyncTaskExecutor simpleAsyncTaskExecutor(){
        return new SimpleAsyncTaskExecutor();
    }

    @Bean
    public TaskExecutorAdapter taskExecutorAdapter(){
        return new TaskExecutorAdapter(Executors.newFixedThreadPool(3));
    }
}
