package com.example.pulsarproducerapp;

import org.apache.pulsar.client.api.MessageId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.pulsar.core.PulsarTemplate;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/producer")
public class ProducerController {

    private final Logger log = LoggerFactory.getLogger(ProducerController.class);

    private final PulsarTemplate<String> template;
    public ProducerController(PulsarTemplate<String> _template) {
        this.template = _template;
    }

    @PutMapping
    public ResponseEntity<Void> createMessage(@RequestParam("message") String message) {

        try {
            log.debug("Sending message: {}...", message);
            MessageId msgId = this.template
                    .newMessage(message)
                    .withMessageCustomizer(mb -> mb.key("my-key"))
                    .withTopic("persistent://test/test-namespace/test_topic").send();
            log.debug("Message sent! Id is: {}", msgId.toString());

            return ResponseEntity.accepted().header("X-Message-Id", msgId.toString()).build();

        } catch(Exception e) {
            log.error("Error sending message to topic", e);
            return ResponseEntity.badRequest().build();
        }

    }
}
