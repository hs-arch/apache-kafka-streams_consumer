package com.hamidCode.apachekafka_streams_consumer.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void cabLocation(String location){
        System.out.println("Current location : " + location);
    }
}
