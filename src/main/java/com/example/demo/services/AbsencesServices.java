package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Absence;
import com.example.demo.repository.AbsencesRepository;
@Service
public class AbsencesServices  implements IAbsencesServices{

	@Autowired
	AbsencesRepository repo ;

	

	
	public Absence createAbsence(Absence abs) {
		// TODO Auto-generated method stub
		return repo.save(abs);
	}
	public List<Absence> getAbsence() {
		return repo.findAll();
	}




	
	public Absence getby(int id) {
		
		return repo.findById(id).orElse(null) ;
	}





	
	//public List<Absence> getAbsetud(int cin) {
	//	return repo.getAbsenceByCinUsingTPQL(cin);
	//}
	





	
	
	
		
	
	
	
	
	

}
