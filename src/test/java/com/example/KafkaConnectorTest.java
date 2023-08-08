package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.test.EmbeddedKafkaBroker;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest
@DirtiesContext
@EmbeddedKafka(
        partitions = 1,
        topics = "events")
class KafkaConnectorTest {

    @Autowired
    private EmbeddedKafkaBroker kafkaEmbedded;

    @Test
    void testConnector() {
        System.out.println("error");
    }

    @Configuration
    static class KafkaConnectorTestConfiguration {

    }

}
