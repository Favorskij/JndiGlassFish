package com.jndiglassfish.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.jndiglassfish.controller")
public class Config implements WebMvcConfigurer{

}
