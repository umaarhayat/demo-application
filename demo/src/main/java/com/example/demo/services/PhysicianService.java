package com.example.demo.services;

import com.example.demo.Dto.PhysicianDto;
import com.example.demo.Entity.Clinics;
import com.example.demo.Entity.Hospital;
import com.example.demo.Entity.Physician;
import com.example.demo.repository.ClinicsRepo;
import com.example.demo.repository.HospitalRepo;
import com.example.demo.repository.PhysicianRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class PhysicianService {
    @Autowired
    private PhysicianRepo physicianRepo;
    @Autowired
    private HospitalRepo hospitalRepo;
    @Autowired
    private ClinicsRepo clinicsRepo;



    public List<Physician> getAllPhysician(){
      return  physicianRepo.findAll();
    }


    // add physician
    public PhysicianDto addPhysician(PhysicianDto physicianDto) {
        Physician physician = new Physician();
        physician.setCountry(physicianDto.getCountry());
        physician.setCity(physicianDto.getCity());
        physician.setPhysicianPassword(physicianDto.getPhysicianPassword());
        physician.setPhysicianEmail(physicianDto.getPhysicianEmail());
        Hospital hospital = hospitalRepo.findById(physicianDto.getPhysician_id()).get();
        physician.setHospital(hospital);
        Clinics clinics = clinicsRepo.findById(physicianDto.getClinics_id()).get();
        physician.setClinics(clinics);
         physicianRepo.save(physician);


        return physicianDto;
    }

    public Physician savePhysician(Physician physician){
        return physicianRepo.save(physician);
    }


    // active physician
    public List<PhysicianDto> activePhysician() {
        List<Physician> physicians = physicianRepo.findAll();
        List<PhysicianDto> physicianList = new ArrayList<>();
        for (Physician physician : physicians) {
            if (physician.isActive() && physician.getHospital()!=null) {
                PhysicianDto physicianDto = new PhysicianDto();
                physicianDto.setCity(physician.getCity());
                physicianDto.setCountry(physician.getCountry());
                physicianDto.setPhysicianEmail(physician.getPhysicianEmail());
                physicianDto.setPhysicianFirstName(physician.getPhysicianFirstName());
                physicianDto.setPhysicianLastName(physician.getPhysicianLastName());
                physicianDto.setActive(physician.isActive());
                physicianDto.setDeletd(physician.isDeleted());
                physicianDto.setPhysician_id(physician.getId());
                physicianDto.setCreatedDate(physician.getCreatedDate());
                physicianDto.setHospitalName(physician.getHospital().getHospitalName());
                physicianDto.setClinics_id(physician.getClinics().getId());

                physicianList.add(physicianDto);
            }
        }
        return physicianList;
    }

    public List<PhysicianDto> getAllPhysicianEmails() {

        List<Physician> physicians = physicianRepo.findAll();
        List<PhysicianDto> physicianDtoList= new ArrayList<>();
        for (Physician physician : physicians) {
            if (physician.isActive() ) {
                PhysicianDto physicianDto = new PhysicianDto();
                physicianDto.setPhysicianEmail(physician.getPhysicianEmail());
                physicianDto.setActive(physician.isActive());
                    physicianDtoList.add(physicianDto);
            }
        }
            return physicianDtoList;

    }

    public List<String> getPhysicianEmails() {
        List<Physician> physicians = physicianRepo.findAll();
        List<String> list= new ArrayList<>();
        for (Physician physician : physicians) {
            if (physician.isActive() ) {
               String physicianEmail = physician.getPhysicianEmail();
                list.add(physicianEmail);
            }
        }
        return list;

    }
    public String getPhysicianName(int physician_id){
        Physician physician = physicianRepo.findById(physician_id).get();
        String physicianName = physician.getPhysicianFirstName();
        return  physicianName;
    }

// update physician

    public Physician updatePhysician(int id, String pass) {
        Physician physician = physicianRepo.findById(id).get();
        physician.setPhysicianPassword(pass);
        physicianRepo.save(physician);
        return physician;
    }
    // updateFindByNameAndPassword

    public Physician updatePhysicianByName(String physicianFirstName, String physicianPassword) {
        Physician physician = physicianRepo.findByName(physicianFirstName);
        physician.setPhysicianPassword(physicianPassword);
        physicianRepo.save(physician);
        return physician;
    }
    // get physician country
    public List<Physician> physicianByCountry(String country ) {
        List<Physician> physician = physicianRepo.findByCountry(country);
        return  physician;
    }
    // get physician country and city
    public List<PhysicianDto> physicianByCountryAndCity(String country,String city  ) {
        List<Physician> physician = physicianRepo.findByCountryAndCity(country, city);
        List<PhysicianDto> physicianDtoList = new ArrayList<>();
        for (Physician physician1 : physician) {
            if (physician1.isActive()) {
                PhysicianDto physicianDto = new PhysicianDto();
                physicianDto.setPhysicianFirstName(physician1.getPhysicianFirstName());
                physicianDtoList.add(physicianDto);
            }
        }
            return physicianDtoList;

    }



    // hard deleted physician id
    public void hardDeleteById(int id){
        physicianRepo.deleteById(id);
    }
    // soft deleted physician

    public void softDelete(int id){
        Physician physician=physicianRepo.findById(id).get();
        physician.setDeleted(true);
        physicianRepo.save(physician);
    }
    //
    public List<Physician> findByActiveAndDelete(boolean active , int id) {
        List<Physician> physicians = physicianRepo.findByActiveAndDelete(active,id);
        for (Physician physician : physicians) {
            if (physician.isActive() || !physician.isDeleted()) {

            }
        }
     return physicians;
    }


}




