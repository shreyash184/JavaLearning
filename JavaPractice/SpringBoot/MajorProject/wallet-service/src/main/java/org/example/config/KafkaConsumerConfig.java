package org.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {
    private static Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerConfig.class);

    @KafkaListener(topics = "USER_CREATED", groupId = "walletapp")
    public void consumerFromUserCreatedTopic(Object payload){
        LOGGER.info("Getting payload from kafka: {}", payload);
    }
}
