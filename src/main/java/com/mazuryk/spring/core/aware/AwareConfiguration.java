package com.mazuryk.spring.core.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

public class AwareConfiguration {

    //This 2 Beans are for Person class to see a BeanNameAware
    //@Bean
    public Person john(){
        return new Person();
    }

    //@Bean
    public Person doe(){
        return new Person();
    }

    //This one is for Action class to see a BeanFactoryAware
    //@Bean
    public Action action(){
        return new Action();
    }

    //This one is for Album class to see a ApplicationContextAware
    //@Bean
    public Album album(){
        return new Album();
    }

    //This one is for Welcome class to see a MessageSourceAware
    //@Bean
    public Welcome welcome(){
        return new Welcome();
    }

    //@Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("welcome");
        return messageSource;
    }

    //This one is for CustomResourceLoader class to see a ResourceLoaderAware
    // But unfortunately this can't be loaded because it use an old version try-catch error
    //@Bean
    public CustomResourceLoader customResourceLoader(){
        return new CustomResourceLoader();
    }
}
