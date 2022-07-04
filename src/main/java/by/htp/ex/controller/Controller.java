package by.htp.ex.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("command").equals("registration")) {
			registration (request, response);
		} else if(request.getParameter("command").equals("authorization")) {
			authorization (request, response);
		}
	}
		
	private void registration(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.getWriter().print("User Name: " + request.getParameter("name") + "<br/>");
		response.getWriter().print("User Surname: " + request.getParameter("surname") + "<br/>");
		response.getWriter().print("Date of Birth: " + request.getParameter("date") + "<br/>");
		response.getWriter().print("Login: " + request.getParameter("login") + "<br/>");
		response.getWriter().print("Password: " + request.getParameter("password") + "<br/>");
	}
	
	private void authorization(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.getWriter().print("Login: " + request.getParameter("login") + "<br/>");
		response.getWriter().print("Password: " + request.getParameter("password") + "<br/>");
	}	
		
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doGet(request, response);
	}
}