package com.example.pulsarproducerapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.pulsar.annotation.PulsarListener;
import org.springframework.stereotype.Component;

@Component
public class BasicConsumerComponent {

    private final Logger log = LoggerFactory.getLogger(BasicConsumerComponent.class);

    @PulsarListener(subscriptionName = "BasicConsumer", topics = "persistent://my-tenant/my-namespace/string_result")
    void listen(String message) {
        log.info("Incoming message: {}", message);
    }
}
