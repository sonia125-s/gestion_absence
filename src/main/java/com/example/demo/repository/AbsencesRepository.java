package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Absence;
@Repository
public interface AbsencesRepository extends JpaRepository<Absence,Integer> {


	//@Query("select a from Absence a where a. =: c")
//public List<Absence> getAbsenceByCinUsingTPQL(@Param("c") int cin);

}
