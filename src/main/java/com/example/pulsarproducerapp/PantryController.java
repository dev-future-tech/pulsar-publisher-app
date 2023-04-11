package com.example.pulsarproducerapp;

import org.apache.pulsar.client.api.MessageId;
import org.apache.pulsar.client.api.PulsarClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.pulsar.core.PulsarTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pantry")
public class PantryController {

    private final Logger log = LoggerFactory.getLogger(PantryController.class);
    private final PulsarTemplate<String> template;

    public PantryController(PulsarTemplate<String> _client) {
        this.template = _client;
    }

    @PostMapping
    public ResponseEntity<Void> createPantryMessage(String message) {
        try {
            MessageId msgId = this.template.newMessage(message).withTopic("persistent://my-tenant/my-namespace/trolley").send();
            log.info("Message id is {}", msgId);
        } catch(PulsarClientException pce) {
            log.error("Error sending message");
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok().build();
    }
}
