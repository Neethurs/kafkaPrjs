package com.example.kafka.service;

import com.example.kafka.joiner.EmployeeJoiner;
import com.example.kafka.schema.AddressDetails;
import com.example.kafka.schema.OuterJoinDetails;
import com.example.kafka.schema.PersonDetails;
import com.example.kafka.schema.VehicleDetails;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.*;
import org.springframework.kafka.support.serializer.JsonSerde;
import org.springframework.stereotype.Service;
import org.apache.kafka.streams.StreamsBuilder;


import java.time.Duration;
import java.util.Properties;

@Service
public class producer  {


    public static void main(String[] args) {

        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "my-stream-processing-application");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        Serde<PersonDetails> personDetailsSerde = new SpecificAvroSerde<>();
        Serde<AddressDetails> addressDetailsSerde = new SpecificAvroSerde<>();
        Serde<VehicleDetails> vehicleDetailsSerde = new SpecificAvroSerde<>();
        Serde<OuterJoinDetails> outerJoinDetailsSerde = new SpecificAvroSerde<>();

        StreamsBuilder builder = new StreamsBuilder();

        KStream<String, PersonDetails> personDetailsKStream = builder.stream("PersonDetails", Consumed.with(Serdes.String(), personDetailsSerde));
        KStream<String, AddressDetails> addressDetailsKStream = builder.stream("AddressDetails", Consumed.with(Serdes.String(), addressDetailsSerde));
        KStream<String, VehicleDetails> vehicleDetailsKStream = builder.stream("VehicleDetails", Consumed.with(Serdes.String(), vehicleDetailsSerde));


        //printing person stream result
        personDetailsKStream.peek((key, PersonDetails)-> System.out.println("key "+key + "value" +PersonDetails));


        //outer join
        KStream<String, OuterJoinDetails> joinedStream = personDetailsKStream.
                outerJoin(addressDetailsKStream,new EmployeeJoiner(),
                        JoinWindows.of(Duration.ofSeconds(10)), StreamJoined.with(Serdes.String(),
                                personDetailsSerde,addressDetailsSerde));
        joinedStream.peek((key,OuterJoinDetails) -> System.out.println("Key " +key+ "value " +OuterJoinDetails.toString()));

        //innerjoin
      //  joinedStream.join(vehicleDetailsKStream,new EmployeeJoiner(),JoinWindows.of(Duration.ofSeconds(10)), StreamJoined.with(Serdes.String(),outerJoinDetailsSerde,vehicleDetailsSerde)).to;

        Topology topology= builder.build();
        KafkaStreams streams = new KafkaStreams(topology,props);
        streams.start();

    }
}
