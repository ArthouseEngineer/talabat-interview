package com.talabat.talabatinterview;

import com.talabat.talabatinterview.configuration.HttpProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(HttpProperties.class)
@SpringBootApplication
public class TalabatInterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalabatInterviewApplication.class, args);
    }

}
