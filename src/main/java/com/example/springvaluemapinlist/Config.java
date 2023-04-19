package com.example.springvaluemapinlist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
public class Config {

    @Bean
    public Map<String, List<String>> fixedNE(@Value("#{${myMapYml}}") Map<String, List<String >> myMapYml) {
        return myMapYml;
    }

}
