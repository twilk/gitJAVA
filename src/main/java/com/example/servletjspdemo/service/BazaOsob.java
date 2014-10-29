package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Osoba;

public class BazaOsob {
	
	private List<Osoba> db = new ArrayList<Osoba>();
	
	public void add(Osoba osoba){
		Osoba nowaOsoba = new Osoba(osoba.getImie(), osoba.getNazwisko(),osoba.getPlec(), osoba.getHobby(), osoba.getOpis(), osoba.getWyksztalcenie(),osoba.getPrawko());
		db.add(nowaOsoba);
	}
	
	public List<Osoba> getWszystkieOsoby(){
		return db;
	}

}
