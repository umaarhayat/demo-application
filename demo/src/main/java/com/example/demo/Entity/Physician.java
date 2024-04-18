package com.example.demo.Entity;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "physician")
public class Physician {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "physician_id")
    private  int id;
    @Column(name = "physician_first_name")
    private String physicianFirstName;
    @Column(name = "physician_last_name")
    private String physicianLastName;
    @Column(name = "physician_email")
    private String physicianEmail;
    @Column(name = "physician_password")
    private String physicianPassword;
    @Column(name = "IS_ACTIVE")
    private boolean isActive;
    @Column(name = "IS_Deleted")
    private boolean deleted;
    @Column(name = "country")
    private  String country;
    @Column(name = "city")
    private String  city;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "created_date")
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "clinic_id")
    private Clinics clinics;

    @OneToOne(cascade = CascadeType.ALL)
    private  Hospital hospital;

    public Physician() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getPhysicianFirstName() {
        return physicianFirstName;
    }

    public void setPhysicianFirstName(String physicianFirstName) {
        this.physicianFirstName = physicianFirstName;
    }

    public String getPhysicianLastName()
    {
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

    public void setPhysicianPassword(String physicianPassword)
    {
        this.physicianPassword = physicianPassword;
    }
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        country=country;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        city=city;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Physician(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Clinics getClinics() {
        return clinics;
    }

    public void setClinics(Clinics clinics) {
        this.clinics = clinics;
    }
}
