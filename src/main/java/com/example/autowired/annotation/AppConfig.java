package com.example.autowired.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.autowired.annotation")
public class AppConfig {
}

//in order to don't use xml file completely we can use annotations and for that we need a base config class