package com.example.servletjspdemo.domain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/personFORM")
public class PersonFORM extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if(request.getSession().getAttribute("mojaOsoba") == null){
			request.getSession().setAttribute("mojaOsoba",new Osoba());	
			writer.print("<br/>test<br/>");
		}	
		
		Osoba osoba = (Osoba) request.getSession().getAttribute("mojaOsoba");
		writer.print("<html><body>");
		writer.print( "<h2>Person FORM</h2><br>");
		

		
		writer.print("<form action=/servletjspdemo/PersonFORMdata>");
		writer.print( "imie:<br/>  <input type=\"tekst\" name=\"imie\""+ osoba.getImie() +" <br/> ");
		writer.print( "nazwisko:<br/>  <input type=\"tekst\" name=\"nazwisko\"/> <br/>");
		writer.print( "plec: <br/>");
		writer.print( "<input type=\"radio\" name=\"plec\" value=\"M\" /> M <br/>");
		writer.print( "<input type=\"radio\" name=\"plec\" value=\"K\" /> K <br/>");
		writer.print( "Hobby:<br/>");
		writer.print( "<input type=\"checkbox\" name=\"hobby\" value=\"informatyka\" id=\"pole1\" />");
		writer.print( "<label for=\"pole1\">informatyka</label><br/>");
		writer.print( "<input type=\"checkbox\" name=\"hobby\" value=\"gornictwo\" id=\"pole2\" />");
		writer.print( "<label for=\"pole2\">gornictwo</label><br/>");
		writer.print( "<input type=\"checkbox\" name=\"hobby\" value=\"znaczki pocztowe\" id=\"pole3\" />");
		writer.print( "<label for=\"pole3\">znaczki pocztowe</label><br/>");
		writer.print( "Opis:<br/>");
		writer.print( " <textarea name=\"opis\" rows=\"4\" cols=\"50\">");
		writer.print( "Napisz cos o sobie</textarea> <br/>");
		writer.print( "Wyksztalcenie:<br/>");
		writer.print( " <select name=\"wyksztalcenie\">");
		writer.print( "<option value=\"podstawowe\">podstawowe</option>");
		writer.print( "<option value=\"gimnazjalne\">gimnazjalne</option>");
		writer.print( "<option value=\"srednie\">srednie</option>");
		writer.print( "<option value=\"wyzsze\">wyzsze</option>");
		writer.print( "</select> <br/>");
		writer.print( "Prawo jazdy:<br/>");
		writer.print( " <select multiple name=\"prawko\">");
		writer.print( "<option value=\"A\">A</option>");
		writer.print( "<option value=\"B\">B</option>");
		writer.print( "<option value=\"C\">C</option>");
		writer.print( "<option value=\"D\">D</option>");
		writer.print( "<option value=\"E\">E</option>");
		writer.print( "</select> <br/>");
		writer.print( "<input type=\"submit\" value=\"Wyslij!\">");
		writer.print( "</form>");
		writer.print( "</body></html>");
			
		writer.close();
	}

}
