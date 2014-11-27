package com.vtx.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by seokangchun on 14. 11. 27..
 */
@Configuration
@ComponentScan(basePackages = "com.vtx.repositories")
public class DomainConfiguration {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        System.setProperty("org.jboss.logging.provider", "slf4j");
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setFileEncoding("UTF-8");
        return propertySourcesPlaceholderConfigurer;
    }
}
