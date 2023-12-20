package com.telusko.quizapp.service;

import com.telusko.quizapp.models.Person;
import com.telusko.quizapp.schema.AddressDetails;
import com.telusko.quizapp.schema.PersonDetails;
import com.telusko.quizapp.schema.VehicleDetails;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Service
public class Consumer {

  //  private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "${avro.topic.name}",containerFactory = "kafkaListenerContainerFactory")
    public void consumePerson(ConsumerRecord<String, PersonDetails> record){

        String key= record.key();
        PersonDetails data = record.value();
;        //LOGGER.info(String.format("Message received -> %s", person.toString()));
        System.out.println("Avro person message received for key : "+key+ " value : "+data.toString());
    }
    @KafkaListener(topics = "TopicAddressDetails",containerFactory = "kafkaListenerContainerFactory")
    public void consumeAddress(ConsumerRecord<String, AddressDetails> record){

        String key= record.key();
        AddressDetails data = record.value();
        System.out.println("Avro address  message received for key : "+key+ " value : "+data.toString());
    }

    @KafkaListener(topics = "PersonDetails",containerFactory = "kafkaListenerContainerFactory")
    public void consumeVehicle(ConsumerRecord<String, VehicleDetails> record){

        String key= record.key();
        VehicleDetails data = record.value();
        System.out.println("Avro vehicle message received for key : "+key+ " value : "+data.toString());
    }
}
