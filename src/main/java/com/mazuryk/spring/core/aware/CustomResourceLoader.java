package com.mazuryk.spring.core.aware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomResourceLoader implements ResourceLoaderAware {
    public void setResourceLoader(ResourceLoader resourceLoader) {
        Resource example = resourceLoader.getResource("file://C:/Users/User/Desktop/example.txt");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(example.getInputStream()))){
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException ioe){
            throw new RuntimeException(ioe.getMessage());
        }
    }
}
