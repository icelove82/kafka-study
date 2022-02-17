package com.ymh.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "NEWS",
            groupId = "COM.YUN"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + " >>>");
    }
}
