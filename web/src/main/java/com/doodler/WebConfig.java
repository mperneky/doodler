package com.doodler;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

/**
 * Created by Yimbo on 2018.12.04..
 */
@Configuration
@ComponentScan({"com.doodler.controller"})
public class WebConfig {
//    @Bean
//    public SimpleUrlHandlerMapping sampleServletMapping() {
//        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
//
//        Properties urlProperties = new Properties();
//        urlProperties.put("/index", "index");
//        urlProperties.put("/public/doodle", "doodle");
//
//        mapping.setMappings(urlProperties);
//
//        return mapping;
//    }
}
