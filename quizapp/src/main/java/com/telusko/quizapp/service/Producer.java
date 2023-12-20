package com.telusko.quizapp.service;

import com.telusko.quizapp.models.Person;
import com.telusko.quizapp.schema.AddressDetails;
import com.telusko.quizapp.schema.PersonDetails;
import com.telusko.quizapp.schema.VehicleDetails;
import org.glassfish.jersey.internal.guava.ListenableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

import org.springframework.util.concurrent.ListenableFutureCallback;

import static org.slf4j.LoggerFactory.*;

@Service
public class Producer {

    @Value("${avro.topic.name}")
     String topicName;

    @Value("TopicAddressDetails")
    String topic;

    @Value("TopicVehicleDetails")
    String topic1;
    private static final Logger LOGGER = getLogger(Producer.class);

  //  private KafkaTemplate<String, Person> kafkaTemplate;
  /*public Producer(KafkaTemplate<String, Person> kafkaTemplate) {
      this.kafkaTemplate = kafkaTemplate;
  }*/

    @Autowired
    private KafkaTemplate<String, PersonDetails> personDetailsKafkaTemplate;

    @Autowired
    private KafkaTemplate<String, VehicleDetails> vehicleDetailsKafkaTemplate;

    @Autowired
    private KafkaTemplate<String, AddressDetails> addressDetailsKafkaTemplate;
    public void sendMessage(PersonDetails personData){
        LOGGER.info(String.format("Message sent to person %s", personData.toString()));
        personDetailsKafkaTemplate.send(topicName,personData);

    }
    public void sendVehicleDetails(VehicleDetails vehicleDetails){
        LOGGER.info(String.format("Message sent to vehicle %s", vehicleDetails.toString()));
        vehicleDetailsKafkaTemplate.send(topic1,vehicleDetails);

    }
    public void sendAddressDetails(AddressDetails addressDetails){
        LOGGER.info(String.format("Message sent to address %s", addressDetails.toString()));
        addressDetailsKafkaTemplate.send(topic,addressDetails);

    }


   /* @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> template) {
        return args -> {
            template.send("topic1", "test");
        };
    }*/
}

