package com.example.demo.services;

import com.example.demo.Dto.HospitalDto;
import com.example.demo.Entity.Hospital;
import com.example.demo.repository.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalService {
    @Autowired
    private HospitalRepo hospitalRepo;

    public List<HospitalDto> getHospital(){
        List<Hospital> hospitals = hospitalRepo.findAll();
        List<HospitalDto> hospitalDtoList= new ArrayList<>();
        for (Hospital hospital:hospitals){
            HospitalDto hospitalDto= new HospitalDto();
            hospitalDto.setId(hospital.getId());
            hospitalDto.setAddress(hospital.getAddress());
            hospitalDto.setHospitalName(hospital.getHospitalName());
                hospitalDtoList.add(hospitalDto);
            }
        return hospitalDtoList;
    }

}
