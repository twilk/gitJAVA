package com.example.servletjspdemo.domain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/PersonFORMdata")
public class PersonFORModbierz extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		if(request.getSession().getAttribute("mojaOsoba") == null){
			request.getSession().setAttribute("mojaOsoba",new Osoba());	
			//writer.print("<br/>test<br/>");
		}	
		
		Osoba osoba = (Osoba) request.getSession().getAttribute("mojaOsoba");
		
		
		
		String podaneImie = "";
		for (String imie : request.getParameterValues("imie")) {
			podaneImie += imie + " ";
		}
		String podaneNazwisko = "";
		for (String nazwisko : request.getParameterValues("nazwisko")) {
			podaneNazwisko += nazwisko + " ";
		}
		String podanaPlec = "";
		for (String plec : request.getParameterValues("plec")) {
			podanaPlec += plec + " ";
		}

		String podaneHobby = "";
		for (String hobby : request.getParameterValues("hobby")) {
			podaneHobby += hobby + " ";
		}

		String podanyOpis = "";
		for (String opis : request.getParameterValues("opis")) {
			podanyOpis += opis + " ";
		}
		String podaneWyksztalcenie = "";
		for (String wyksztalcenie : request.getParameterValues("wyksztalcenie")) {
			podaneWyksztalcenie += wyksztalcenie + " ";
		}
		String podanePrawko = "";
		for (String prawko : request.getParameterValues("prawko")) {
			podanePrawko += prawko + " ";
		}
	
		out.println("<html><body><h2>Twoje dane</h2>" +
				"<p>Imie: " + podaneImie + "<br />" +
				"<p>Nazwisko: " + podaneNazwisko + "<br />" +
				"<p>Plec: " + podanaPlec + "<br />" +
				"<p>Hobby: " + podaneHobby + "<br />" +
				"<p>Opis: " + podanyOpis + "<br />" +
				"<p>Wyksztalcenie: " + podaneWyksztalcenie + "<br />" +
				"<p>Prawo jazdy: " + podanePrawko + "<br />" +
				"</body></html>");
		out.close();
	}

}
