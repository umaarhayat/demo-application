package com.example.demo.Entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clinics")
public class Clinics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "clinics_id")
    private int id;
    @Column(name = "clinics_Name")
    private  String ClinicsName;
    @Column(name = "clinics_Address")
    private String  ClinicsAddress;

    @OneToMany(mappedBy = "clinics")
    private List<Physician> physician;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClinicsName() {
        return ClinicsName;
    }

    public void setClinicsName(String clinicsName) {
        ClinicsName = clinicsName;
    }

    public String getClinicsAddress() {
        return ClinicsAddress;
    }

    public void setClinicsAddress(String clinicsAddress) {
        ClinicsAddress = clinicsAddress;
    }

    public List<Physician> getPhysician() {
        return physician;
    }

    public void setPhysician(List<Physician> physician) {
        this.physician = physician;
    }
}
