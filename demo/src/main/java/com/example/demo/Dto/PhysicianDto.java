package com.example.demo.Dto;

import com.example.demo.Entity.Hospital;
import com.example.demo.Entity.Physician;

import java.util.Date;

public class PhysicianDto {
    private Integer physician_id;
    private Integer clinics_id;
    private String hospitalName;
    private String physicianFirstName;
    private String physicianLastName;
    private String physicianEmail;
    private String physicianPassword;
    private String country;
    private String  city;
    private boolean isActive;
    private  boolean isDeletd;
    private Date createdDate;



    public String getPhysicianFirstName() {
        return physicianFirstName;
    }

    public void setPhysicianFirstName(String physicianFirstName) {
        this.physicianFirstName = physicianFirstName;
    }

    public String getPhysicianLastName(Physician physician) {
        return physicianLastName;
    }

    public void setPhysicianLastName(String physicianLastName) {
        this.physicianLastName = physicianLastName;
    }

    public String getPhysicianEmail() {
        return physicianEmail;
    }

    public void setPhysicianEmail(String physicianEmail) {
        this.physicianEmail = physicianEmail;
    }

    public String getPhysicianPassword() {
        return physicianPassword;
    }

    public void setPhysicianPassword(String physicianPassword) {
        this.physicianPassword = physicianPassword;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPhysician_id() {
        return physician_id;
    }

    public void setPhysician_id(Integer physician_id) {
        this.physician_id = physician_id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isDeletd() {
        return isDeletd;
    }

    public void setDeletd(boolean deletd) {
        isDeletd = deletd;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setHospital(Hospital hospital) {
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Integer getClinics_id() {
        return clinics_id;
    }

    public void setClinics_id(Integer clinics_id) {
        this.clinics_id = clinics_id;
    }
}
