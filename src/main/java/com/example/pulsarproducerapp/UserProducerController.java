package com.example.pulsarproducerapp;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.impl.schema.JSONSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.pulsar.core.PulsarTemplate;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserProducerController {

    private final Logger log = LoggerFactory.getLogger(UserProducerController.class);

    private final PulsarTemplate<User> template;
    private final PulsarClient client;
    public UserProducerController(PulsarTemplate<User> _template,
                                  PulsarClient _client) {
        this.template = _template;
        this.client = _client;
    }

    @PutMapping
    public ResponseEntity<Void> sendUser(@RequestParam("firstname") String firstname,
                                         @RequestParam("lastname") String lastname, @RequestParam("age") Integer age) {
        var user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        Producer<User> producer = null;

        try {
            producer = client.newProducer(JSONSchema.of(User.class))
                    .topic("persistent://my-tenant/my-namespace/test_topic")
                    .create();

            producer.send(user);
        } catch(PulsarClientException e) {
            log.error("Error creating schema for User.class", e);
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.accepted().build();
    }
}
