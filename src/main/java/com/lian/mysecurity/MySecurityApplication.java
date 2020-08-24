package com.lian.mysecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MySecurityApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(MySecurityApplication.class, args);
    }

}
