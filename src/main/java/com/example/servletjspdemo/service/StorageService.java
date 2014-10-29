package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Osoba;

public class StorageService {
	
	private List<Osoba> db = new ArrayList<Osoba>();
	
	public void add(Osoba person){
		Osoba newPerson = new Osoba(person.getFirstName(), person.getYob());
		db.add(newPerson);
	}
	
	public List<Osoba> getAllPersons(){
		return db;
	}

}
