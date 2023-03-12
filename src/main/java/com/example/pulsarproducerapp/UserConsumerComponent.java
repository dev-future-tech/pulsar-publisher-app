package com.example.pulsarproducerapp;

import org.apache.pulsar.common.schema.SchemaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.pulsar.annotation.PulsarListener;
import org.springframework.stereotype.Component;

@Component
public class UserConsumerComponent {

    private final Logger log = LoggerFactory.getLogger(UserConsumerComponent.class);

    @PulsarListener(subscriptionName = "UserConsumer", topics = "persistent://public/default/users")
    void listen(User user) {
        log.info("Received user: {}, {} of age {}", user.getLastname(), user.getFirstname(), user.getAge());
    }
}
