package com.example.pulsarproducerapp;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;
import org.apache.pulsar.client.api.schema.SchemaDefinition;
import org.apache.pulsar.client.impl.schema.AvroSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/avro/producer")
public class AvroProducerController {
    private final Logger log = LoggerFactory.getLogger(AvroProducerController.class);
    private final String TOPIC = "pulsar-postgres-jdbc-sink-topic";

    @PostMapping
    public ResponseEntity<Void> createAvroMessage(int id, String value) {
        final String pulsarServiceUrl = "pulsar://localhost:6650";

        log.info("{}", new String(AvroSchema.of(Test.class).getSchemaInfo().getSchema()));

        try (PulsarClient client = PulsarClient.builder().serviceUrl(pulsarServiceUrl).build()) {
            Schema<Test> messageSchema = Schema.AVRO(
                    SchemaDefinition.<Test>builder()
                            .withPojo(Test.class)
                            .withAlwaysAllowNull(true)
                            .build()
            );
            try (Producer<Test> producer = client.newProducer(messageSchema).topic(TOPIC).create()) {
                final int numMessages = 5;
                for (int i = 0; i< numMessages; i++) {
                    final String orderId = String.format("order-%d", i);
                    final String messageStr = String.format("Message %d", i);
                    final Test message = new Test();
                    message.setId(i);
                    message.setName(messageStr);
                    producer.newMessage()
                            .key(orderId)
                            .value(message)
                            .sendAsync();
                }
                producer.flush();

                String logMessage = String.format("Successfully produced %d messages to a topic called %s%n",
                        numMessages, TOPIC);
                log.info(logMessage);
            }
        } catch (PulsarClientException e) {
            log.error("Failed to produce avro messages to pulsar", e);
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.accepted().build();
    }
}
