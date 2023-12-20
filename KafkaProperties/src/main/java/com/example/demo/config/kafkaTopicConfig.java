package com.example.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

    @Bean
    public NewTopic topicEmployee(){
        return TopicBuilder.name("PersonTopic")
                .build();
    }

    @Bean
    public NewTopic topicAddress(){
        return TopicBuilder.name("AddressTopic")
                .build();
    }

    @Bean
    public NewTopic topicVehicle(){
        return TopicBuilder.name("VehicleTopic")
                .build();
    }
}
