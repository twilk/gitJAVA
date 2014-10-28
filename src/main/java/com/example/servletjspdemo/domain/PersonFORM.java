package com.example.servletjspdemo.domain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/personFORM")
public class PersonFORM extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.println("<html><body>"
				+ "<h2>Person FORM</h2><br>"
				+ "<form action=/servletjspdemo/PersonFORMdata>"
				+ "imie:<br/>  <input type=\"tekst\" name=\"imie\"/> <br/> "
				+ "nazwisko:<br/>  <input type=\"tekst\" name=\"nazwisko\"/> <br/>"
				+ "plec: <br/>"
				+ "<input type=\"radio\" name=\"plec\" value=\"M\" /> M <br/>"
				+ "<input type=\"radio\" name=\"plec\" value=\"K\" /> K <br/>"
				+ "Hobby:<br/>"
				+ "<input type=\"checkbox\" name=\"hobby\" value=\"informatyka\" id=\"pole1\" />"
				+ "<label for=\"pole1\">informatyka</label><br/>"
				+ "<input type=\"checkbox\" name=\"hobby\" value=\"gornictwo\" id=\"pole2\" />"
				+ "<label for=\"pole2\">gornictwo</label><br/>"
				+ "<input type=\"checkbox\" name=\"hobby\" value=\"znaczki pocztowe\" id=\"pole3\" />"
				+ "<label for=\"pole3\">znaczki pocztowe</label><br/>"
				+ "Opis:<br/>"
				+ " <textarea name=\"opis\" rows=\"4\" cols=\"50\">"
				+ "Napisz cos o sobie</textarea> <br/>"
				+ "Wyksztalcenie:<br/>"
				+ " <select name=\"wyksztalcenie\">"
				+ "<option value=\"podstawowe\">podstawowe</option>"
				+ "<option value=\"gimnazjalne\">gimnazjalne</option>"
				+ "<option value=\"srednie\">srednie</option>"
				+ "<option value=\"wyzsze\">wyzsze</option>"
				+ "</select> <br/>"
				+ "Prawo jazdy:<br/>"
				+ " <select multiple name=\"prawko\">"
				+ "<option value=\"A\">A</option>"
				+ "<option value=\"B\">B</option>"
				+ "<option value=\"C\">C</option>"
				+ "<option value=\"D\">D</option>"
				+ "<option value=\"E\">E</option>"
				+ "</select> <br/>"
				+ "<input type=\"submit\" value=\"Wyslij!\">"
				+ "</form>"
				+ "</body></html>");
		writer.close();
	}

}
