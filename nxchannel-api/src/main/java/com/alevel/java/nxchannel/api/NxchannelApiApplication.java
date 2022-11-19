package com.alevel.java.nxchannel.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NxchannelApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NxchannelApiApplication.class, args);
    }

}
