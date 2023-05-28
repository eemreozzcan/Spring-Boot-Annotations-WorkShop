package com.java.lessons.annotations.propertsource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

@PropertySource({
        "classpath:mail.properties",
        "classpath:message.properties"
})
public class SpringConfig
{


}
