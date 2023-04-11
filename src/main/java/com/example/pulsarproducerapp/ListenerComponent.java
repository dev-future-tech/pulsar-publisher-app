package com.example.pulsarproducerapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.pulsar.annotation.PulsarListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerComponent {

    private final Logger log = LoggerFactory.getLogger(ListenerComponent.class);

    @PulsarListener(subscriptionName = "spring-app", topics = {"persistent://my-tenant/my-namespace/alerts"})
    void listen(String message) {
        log.info("Message received {}", message);
    }
}
