package com.telusko.quizapp.config;

import com.telusko.quizapp.schema.PersonDetails;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public ConsumerFactory<String, PersonDetails> consumerFactory(KafkaProperties kafkaProperties) {
        return new DefaultKafkaConsumerFactory<>(kafkaProperties.buildConsumerProperties());
    }

    @Bean
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, PersonDetails>> kafkaListenerContainerFactory(KafkaProperties kafkaProperties) {
        ConcurrentKafkaListenerContainerFactory<String, PersonDetails> factory = new ConcurrentKafkaListenerContainerFactory<String, PersonDetails>();
        factory.setConsumerFactory(consumerFactory(kafkaProperties));
        return factory;
    }








   /* @Bean
    public NewTopic topicEx(){
        return TopicBuilder.name("PersonDetails")
                .build();
    }*/

}
