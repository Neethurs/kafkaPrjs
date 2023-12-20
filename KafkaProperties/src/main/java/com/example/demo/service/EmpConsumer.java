package com.example.demo.service;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.stereotype.Service;
import com.example.demo.schema.PersonDetails;
import java.util.Arrays;
import java.util.Properties;

@Service
public class EmpConsumer {

      public void consumePerson(ConsumerRecord<String, PersonDetails> record){

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", "test");
        //props.put("enable.auto.commit", "true");
        //props.put("auto.commit.interval.ms", "1000");
        //props.put("session.timeout.ms", "30000");
        props.put("key.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer",
                "org.springframework.kafka.support.serializer.JsonDeserializer");
        props.put("schema.registry.url", "https://localhost/8081/");
        KafkaConsumer<String, PersonDetails> consumer = new KafkaConsumer<String, PersonDetails>(props);
        consumer.subscribe(Arrays.asList("PersonTopic"));
        while (true) {
            ConsumerRecords<String, PersonDetails> records = consumer.poll(100);
            for (ConsumerRecord<String, PersonDetails> consumerRecord : records)
                System.out.printf("offset = %d, key = %s, value = %s", consumerRecord.offset(), consumerRecord.key(), consumerRecord.value());

        }

    }

}
