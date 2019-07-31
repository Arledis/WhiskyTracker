package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

//    List<Whisky> findWhiskyByYear(int age);

    List<Whisky> findWhiskyByDistilleryAndAge(String distillery, int age);

    List<Whisky> findAllWhiskyByRegion(String region);
}
