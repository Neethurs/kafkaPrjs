package com.example.demo.controller;


import com.example.demo.schema.AddressDetails;
import com.example.demo.schema.PersonDetails;
import com.example.demo.schema.VehicleDetails;
import com.example.demo.service.EmpProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class kafkaController {

    @Autowired
    private EmpProducer producer;

    @PostMapping("/publish")
    public void publish(@RequestBody PersonDetails model){
        System.out.println("controller intiation"+model);
        producer.sendPerson(model);
        System.out.println("Message sent to the person topic");
    }
    @PostMapping("/publishAddress")
    public void publishAddress(@RequestBody AddressDetails model){
        System.out.println("controller intiation"+model);
        producer.sendAddress(model);
        System.out.println("Message sent to the address topic");
    }
    @PostMapping("/publishVehicle")
    public void publishVehicle(@RequestBody VehicleDetails model){
        System.out.println("controller intiation"+model);
        producer.sendVehicle(model);
        System.out.println("Message sent to the vehicle topic");
    }
}
