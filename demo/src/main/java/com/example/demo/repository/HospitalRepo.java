package com.example.demo.repository;

import com.example.demo.Entity.Hospital;
import org.omg.CORBA.ObjectHelper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.Future;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital,Integer> {


    }

