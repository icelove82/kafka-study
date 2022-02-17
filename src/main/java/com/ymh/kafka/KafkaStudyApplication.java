package com.ymh.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDateTime;

@SpringBootApplication
public class KafkaStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaStudyApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, Message> kafkaTemplate) {
        return args -> {
            for (int i = 0; i < 100; i++) {
                kafkaTemplate.send("NEWS", new Message("hello kafka :)" + i, LocalDateTime.now()));
            }
        };
    }

}
