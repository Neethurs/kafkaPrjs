package com.telusko.quizapp.controller;

import com.telusko.quizapp.models.Address;
import com.telusko.quizapp.models.Person;
import com.telusko.quizapp.models.Vehicle;
import com.telusko.quizapp.schema.AddressDetails;
import com.telusko.quizapp.schema.PersonDetails;
import com.telusko.quizapp.schema.VehicleDetails;
import com.telusko.quizapp.service.Producer;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController

public class KafkaController {

    @Autowired
    private Producer producer;

    @PostMapping("/publish")
    public void publish(@RequestBody Person model){
        PersonDetails personDetails = PersonDetails.newBuilder().build();
        personDetails.setEmpId(model.getEmpId());
        personDetails.setFirstName(model.getFirstName());
        personDetails.setLastName(model.getLastName());
        personDetails.setAge(model.getAge());
        personDetails.setSex(model.getSex());
        producer.sendMessage(personDetails);
       System.out.println("Message sent to the person topic");
    }
   @PostMapping("/showVehicle")
    public void showVehicle(@RequestBody Vehicle model){

       VehicleDetails vehicleDetails = VehicleDetails.newBuilder().build();
       vehicleDetails.setEmpId(model.getEmpId());
       vehicleDetails.setVehicleNo(model.getVehicleNo());
       vehicleDetails.setVehicleName(model.getVehicleName());
       vehicleDetails.setInsurance(model.getInsurance());
       vehicleDetails.setManufacturingYear(model.getManufacturingYear());
       producer.sendVehicleDetails(vehicleDetails);
       System.out.println("Message sent to the vehicle topic");

    }

    @PostMapping("/showAddress")
    public void showAddress(@RequestBody Address model){

        AddressDetails addressDetails = AddressDetails.newBuilder().build();
        addressDetails.setEmpId(model.getEmpId());
        addressDetails.setHouseName(model.getHouseName());
        addressDetails.setCity(model.getCity());
        addressDetails.setCountry(model.getCountry());
        addressDetails.setDistrict(model.getDistrict());
        addressDetails.setPostCode(model.getPostCode());
        addressDetails.setState(model.getState());
        addressDetails.setStreetName(model.getStreetName());
        producer.sendAddressDetails(addressDetails);
        System.out.println("Message sent to the address topic");



    }
}
