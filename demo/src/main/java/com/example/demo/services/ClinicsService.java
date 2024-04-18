package com.example.demo.services;

import com.example.demo.repository.ClinicsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClinicsService {

    @Autowired
    private ClinicsRepo clinicsRepo;

}
