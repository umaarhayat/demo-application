package com.example.demo.controller;

import com.example.demo.services.ClinicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ClinicsController {

    @Autowired
    private ClinicsService clinicsService;


}
