package com.example.demo.Entity;
import javax.persistence.*;

@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private  int id;
    @Column(name ="hospital_Name")
    private  String hospitalName;
    @Column(name ="hospitalAddress")
    private  String address;


    public Hospital()
    {
    }
    public Hospital(int id, String hospitalName, String address ) {
        this.id = id;
        this.hospitalName = hospitalName;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getHospitalName() {
        return hospitalName;
    }
    public  String getPhysician(){
        return getPhysician();
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
