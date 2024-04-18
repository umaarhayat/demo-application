package com.example.demo.repository;

import com.example.demo.Entity.Physician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface PhysicianRepo extends JpaRepository<Physician,Integer> {

   @Query("SELECT p FROM Physician p WHERE p.physicianEmail = :physicianFirstName")
   Physician findByName(String physicianFirstName);

   @Query("SELECT p FROM Physician p WHERE p.country= :country")
   List<Physician> findByCountry(String country);

  @Query("SELECT p FROM Physician p WHERE p.country = ?1 and p.city = ?2")
   List<Physician> findByCountryAndCity(@Param ("country")String country , @Param("city") String city);
    @Query("SELECT p FROM Physician p WHERE p.isActive= ?1 and p.deleted  = ?2")
  List<Physician> findByActiveAndDelete(@Param("active") boolean active , @Param("delete") int delete );

}
