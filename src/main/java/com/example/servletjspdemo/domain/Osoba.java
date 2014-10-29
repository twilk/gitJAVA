package com.example.servletjspdemo.domain;

public class Osoba {

	private String imie = "nieznane";
	private String nazwisko = "nieznane";
	private String plec = "nieznane";
	private String hobby = "nieznane";
	private String opis = "nieznane";
	private String wyksztalcenie = "nieznane";
	private String prawko = "nieznane";
	
	
	public Osoba() {
		super();
	}
	
	public Osoba(String imie, String nazwisko, String plec, String hobby, String opis, String wyksztalcenie, String prawko) {
		super();

		this.imie = imie;
		this.nazwisko = nazwisko;
		this.plec = plec;
		this.hobby = hobby;
		this.opis = opis;
		this.wyksztalcenie = wyksztalcenie;
		this.prawko = prawko;
		
	}

	public String getImie() {
		return imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public String getPlec() {
		return plec;
	}
	public String getHobby() {
		return hobby;
	}
	public String getOpis() {
		return opis;
	}
	public String getWyksztalcenie() {
		return wyksztalcenie;
	}
	public String getPrawko() {
		return prawko;
	}
	
	public void setImie(String imie) {
		this.imie= imie;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko=nazwisko;
	}
	public void setPlec(String plec) {
		this.plec= plec;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public void setWyksztalcenie(String wyksztalcenie) {
		this.wyksztalcenie= wyksztalcenie;
	}
	public void setPrawko(String prawko) {
		this.prawko= prawko;
	}
	
}
