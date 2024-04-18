package com.example.demo.controller;

import com.example.demo.Dto.HospitalDto;
import com.example.demo.Entity.Hospital;
import com.example.demo.services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/all")
    public List<HospitalDto> getHospital(){
        return hospitalService.getHospital();
    }
}
