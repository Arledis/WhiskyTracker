package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping
    public List<Distillery> getAllDistilleries(){
        return distilleryRepository.findAll();
    }

    @GetMapping(value = "/region/{region}")
    public List<Distillery> findAllDistilleryByRegion(String region){
        return distilleryRepository.findAllDistilleryByRegion(region);
    }

    @GetMapping(value = "/age/{age}")
    public List<Distillery> findWhiskiesAgeTwelve(int age){
        return distilleryRepository.findWhiskiesAgeTwelve(age);
    }


}
