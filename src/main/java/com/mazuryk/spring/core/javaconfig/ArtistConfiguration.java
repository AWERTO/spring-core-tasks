package com.mazuryk.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfiguration {

    @Bean
    public Artist the_best_artist(){
        return new Artist("Vlad","Mazuryk");
    }
    @Bean(name = "the_second_artist")
    public Artist the_common_artist(){
        return new Artist("Petya","Vasyuk");
    }
}
