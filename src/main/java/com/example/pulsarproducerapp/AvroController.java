package com.example.pulsarproducerapp;

import com.example.model.TestMessage;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;
import org.apache.pulsar.client.api.schema.SchemaBuilder;
import org.apache.pulsar.client.api.schema.SchemaDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.pulsar.core.PulsarTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/avro")
public class AvroController {

    private final PulsarTemplate<TestMessage> template;
    private final Logger log = LoggerFactory.getLogger(AvroController.class);


    @Autowired
    public AvroController(PulsarTemplate<TestMessage> template) {
        this.template = template;
    }

    @PostMapping()
    public ResponseEntity<Void> sendMessage(@RequestParam("msg") String msg) {
        var testMessage = TestMessage.newBuilder().setMessageId(UUID.randomUUID().toString()).setMessage(msg).build();

        Schema<TestMessage> messageSchema = Schema.AVRO(SchemaDefinition.<TestMessage>builder()
                .withPojo(TestMessage.class)
                .withAlwaysAllowNull(true)
                .build());

        try {
            this.template.send("persistent://public/test-namespace/hello-pulsar", testMessage, messageSchema);
            log.info("Message sent");
        } catch(PulsarClientException pce) {
            log.error("Error sending message", pce);
        }
        return ResponseEntity.accepted().build();
    }
}
