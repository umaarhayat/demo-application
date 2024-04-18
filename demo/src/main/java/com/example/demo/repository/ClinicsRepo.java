package com.example.demo.repository;

import com.example.demo.Entity.Clinics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicsRepo extends JpaRepository<Clinics,Integer> {
}
