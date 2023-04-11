package com.example.pulsarproducerapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.pulsar.annotation.PulsarListener;
import org.springframework.stereotype.Component;

@Component
public class PantryConsumer {

    private final Logger log = LoggerFactory.getLogger(PantryConsumer.class);

    @PulsarListener(subscriptionName = "basic-listener", topics = {"persistent://my-tenant/my-namespace/trolley"})
    public void listenForItems(String item) {
        log.info("Item received: {}", item);
    }
}
