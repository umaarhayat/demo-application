package com.example.demo.controller;

import com.example.demo.Dto.PhysicianDto;
import com.example.demo.Entity.Hospital;
import com.example.demo.Entity.Physician;
import com.example.demo.repository.HospitalRepo;
import com.example.demo.services.PhysicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/Physician")
public class PhysicianController {

    @Autowired
    private  PhysicianService physicianService;

    @Autowired
    private HospitalRepo hospitalRepo;

    @GetMapping("all")
    public  List<Physician> getAllPhysician(){

        return physicianService.getAllPhysician();
    }


    // add details the physician
    @PostMapping(value = "/save")
    public PhysicianDto addPhysicain(@RequestBody PhysicianDto physicianDto) {
        return physicianService.addPhysician(physicianDto);
    }
    @PostMapping("/addphysician")
    public Physician savePhysician(@RequestBody Physician physician){
       return physicianService.savePhysician(physician);

    }

    // get active physician

    @GetMapping("/activephysicain")
    public List<PhysicianDto> activePhysicain() {
        return physicianService.activePhysician();
    }
    @GetMapping("/allemails")
    public List<PhysicianDto> getAllPhysicianEmails()
    {
        return physicianService.getAllPhysicianEmails();
    }

    @GetMapping("/emails")
    public List<String> getPhysicianEmails() {
        return physicianService.getPhysicianEmails();
    }
    @GetMapping("/getphysicianname")
    public String getPhyicianName(@RequestParam int physician_id){
     String physicainName =  physicianService.getPhysicianName(physician_id);
        return physicainName;
    }


    // update physician
    @PostMapping("/update")
    public Physician updatePhysician(@RequestParam String physicianFirstName, @RequestParam String physicianPassword) {
        return physicianService.updatePhysicianByName(physicianFirstName, physicianPassword);
    }
    // get physicain country
    @PostMapping("/country")
    public List<Physician> physicianByCountry(@RequestParam String country) {
        return physicianService.physicianByCountry(country);
    }
    // get physicain country and city
    @PostMapping("/countrycity")
    public List<PhysicianDto> physicianByCountryAndCity(@RequestParam String country ,@RequestParam String city) {
        return physicianService.physicianByCountryAndCity(country,city);
    }
    //hard delete physician id
    @DeleteMapping("/{id}")
    public void hardDeleteOPhysician(@PathVariable int id){
        physicianService.hardDeleteById(id);

    }
    @DeleteMapping("/softdelete")
    public void softDelete(@RequestParam Integer id){
        physicianService.softDelete(id);
    }
    @DeleteMapping("/activedelete")
    public List<Physician> findByActiveAndDelete(@RequestParam boolean active ,@RequestParam int id) {
        return physicianService.findByActiveAndDelete(active,id);
    }


}


