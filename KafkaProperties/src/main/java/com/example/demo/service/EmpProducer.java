package com.example.demo.service;


import com.example.demo.schema.AddressDetails;
import com.example.demo.schema.PersonDetails;
import com.example.demo.schema.VehicleDetails;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

@Service
public class EmpProducer {
     private static final Logger log = LoggerFactory.getLogger(EmpProducer.class);

   public static  void sendPerson(PersonDetails personDetails){


        System.out.println("producer startinggg");

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", StringSerializer.class.getName());
        props.put("value.serializer", "org.springframework.kafka.support.serializer.JsonSerializer");
        props.put("schema.registry.url", "https://localhost:8081");
        KafkaProducer<String,PersonDetails> producer=new KafkaProducer<>(props);
        ProducerRecord<String,PersonDetails> record = new ProducerRecord<>("PersonTopic",String.valueOf(personDetails.getEmpId()),personDetails);
        System.out.println("producer intiation");
        try {
             producer.send(record, new Callback() {
                  @Override
                  public void onCompletion(RecordMetadata recordMetadata, Exception exception) {
                       if (exception == null) {
                            System.out.println("personal details send successfully");
                          //  log.info(String.valueOf(record));
                       } else {
                            System.out.println("Error while sending personal details");
                       }
                  }
             }).get();
        } catch (ExecutionException | InterruptedException e) {
             throw new RuntimeException(e);
        }

        producer.flush();
        producer.close();


    }
    public static  void sendAddress(AddressDetails addressDetails){

          System.out.println("producer startinggg");

          Properties props = new Properties();
          props.put("bootstrap.servers", "localhost:9092");
          props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
          props.put("value.serializer", "org.springframework.kafka.support.serializer.JsonSerializer");
          props.put("schema.registry.url", "https://localhost:8081");
          KafkaProducer<String,AddressDetails> producer=new KafkaProducer<>(props);
          ProducerRecord<String,AddressDetails> record = new ProducerRecord<>("AddressTopic",String.valueOf(addressDetails.getEmpId()),addressDetails);
          System.out.println("producer intiation");
          try {
               producer.send(record, new Callback() {
                    @Override
                    public void onCompletion(RecordMetadata recordMetadata, Exception exception) {
                         if (exception == null) {
                              System.out.println("Address details send successfully");
                              //  log.info(String.valueOf(record));
                         } else {
                              System.out.println("Error while sending address details");
                         }
                    }
               }).get();
          } catch (ExecutionException | InterruptedException e) {
               throw new RuntimeException(e);
          }
          producer.flush();
          producer.close();
     }

     public static  void sendVehicle(VehicleDetails vehicleDetails){

          System.out.println("producer startinggg");

          Properties props = new Properties();
          props.put("bootstrap.servers", "localhost:9092");
          props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
          props.put("value.serializer", "org.springframework.kafka.support.serializer.JsonSerializer");
          props.put("schema.registry.url", "https://localhost:8081");
          KafkaProducer<String,VehicleDetails> producer=new KafkaProducer<>(props);
          ProducerRecord<String,VehicleDetails> record = new ProducerRecord<>("VehicleTopic",String.valueOf(vehicleDetails.getEmpId()),vehicleDetails);
          System.out.println("producer intiation");
          try {
               producer.send(record, new Callback() {
                    @Override
                    public void onCompletion(RecordMetadata recordMetadata, Exception exception) {
                         if (exception == null) {
                              System.out.println("vehicle details send successfully");
                              //  log.info(String.valueOf(record));
                         } else {
                              System.out.println("Error while sending vehicle details");
                         }
                    }
               }).get();
          } catch (ExecutionException | InterruptedException e) {
               throw new RuntimeException(e);
          }
          producer.flush();
          producer.close();
     }
}
