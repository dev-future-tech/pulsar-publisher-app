package com.example.pulsarproducerapp;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OnboardingManager {

    private final Logger log = LoggerFactory.getLogger(OnboardingManager.class);

    private final PulsarClient client;

    @Autowired
    public OnboardingManager(PulsarClient client) {
        this.client = client;
    }

    public boolean provisionEngineer(long engineerId) {
        // Get the engineer resources from the database
        Engineer eng = new Engineer();

        List<ProjectResource> resources = getEngineerResources(engineerId);

        List<EngineeringResource> reqResources = resources.stream().map(res -> {
            EngineeringResource resource = EngineeringResource.newBuilder()
                    .setResourceType(ResourceType.valueOf(res.getResourceType().name()))
                    .setResourceName(res.getResourceName())
                    .setApproved(res.isApproved())
                    .build();
            return resource;
        }).toList();

        //Construct the message
        EngineerResourceRequest request = EngineerResourceRequest.newBuilder()
                .setEngineerId(engineerId)
                .setRole(eng.getEngineeringRole())
                .setResources(reqResources)
                .build();


        String TOPIC = "provision-postgres-jdbc-sink-topic";
        try (Producer<EngineerResourceRequest> producer = client.newProducer(Schema.AVRO(EngineerResourceRequest.class)).topic(TOPIC).create()) {
            producer.newMessage()
                    .key(UUID.randomUUID().toString())
                    .value(request)
                    .sendAsync();
            return true;
        } catch(PulsarClientException pce) {
            log.error("Error sending message", pce);
        }
        //
        return false;
    }

    private List<ProjectResource> getEngineerResources(long engineerId) {
        ProjectResource resource = new ProjectResource();
        return List.of(resource);
    }
}
