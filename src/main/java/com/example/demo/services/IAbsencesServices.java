package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Absence;
@Service
public interface IAbsencesServices {
      public Absence createAbsence(Absence abs);
      public List<Absence> getAbsence ();
      public Absence getby(int id);
      //public List<Absence> getAbsetud(int cin);
      
}
