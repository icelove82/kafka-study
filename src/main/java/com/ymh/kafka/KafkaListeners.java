package com.ymh.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "NEWS",
            groupId = "COM.YUN",
            containerFactory = "messageFactory" /* for listener object msg, no need string msg case */
    )
    void listener(Message data) {
        System.out.println("Listener received: " + data + " >>>");
    }
}
