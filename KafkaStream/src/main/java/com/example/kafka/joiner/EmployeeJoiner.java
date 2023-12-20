package com.example.kafka.joiner;

import com.example.kafka.schema.AddressDetails;
import com.example.kafka.schema.OuterJoinDetails;
import com.example.kafka.schema.PersonDetails;
import org.apache.kafka.streams.kstream.ValueJoiner;

public class EmployeeJoiner implements ValueJoiner<PersonDetails, AddressDetails, OuterJoinDetails> {

    @Override
    public OuterJoinDetails apply(PersonDetails personDetails,AddressDetails addressDetails){


          return OuterJoinDetails.newBuilder()
                .setEmpId(personDetails.getEmpId())
                .setFirstName(personDetails.getFirstName())
                .setLastName(personDetails.getLastName())
                .setAge(personDetails.getAge())
                .setSex(personDetails.getSex())
                .setHouseName(addressDetails.getHouseName())
                .setCity(addressDetails.getCity())
                .setCountry(addressDetails.getCountry())
                .setDistrict(addressDetails.getDistrict())
                .setPostCode(addressDetails.getPostCode())
                .setState(addressDetails.getState())
                .setStreetName(addressDetails.getStreetName())
                .build();

    }
}
