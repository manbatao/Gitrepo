package com.xunyang.config;


import com.xunyang.model.Student;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource(value = "classpath:applicationContext.xml")
//@PropertySource(value = "classpath:application.properties")
//@ComponentScan(basePackages = "com.xunyang.model")
public class MyConfig {

    @Bean
    public Student myStudent(){
        return new Student("fancy",12);
    }
}
