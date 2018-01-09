package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.schema.client.ConfluentSchemaRegistryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Bjørn Hjelle, Acando on 23.11.2017.
 */
@Configuration
public class SchemaRegistryConfiguration {

    @Bean
    public ConfluentSchemaRegistryClient schemaRegistryClient(
            @Value("${spring.cloud.stream.kafka.binder.schema.registry.url}") String endpoint){
        ConfluentSchemaRegistryClient client = new ConfluentSchemaRegistryClient();
        client.setEndpoint(endpoint);
        return client;
    }

}
