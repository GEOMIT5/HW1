package by.tr.conspect.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import by.tr.conspect.bean.User;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected static String NewUserName;
	protected static String NewUserPWD;
    private String user;
    private String pass;
    
    public void init() {

        ServletContext context = getServletContext();
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }
	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		User user = new User();
		
		user.setYearBirthday(1990);

		NewUserName = request.getParameter("NewUserName");
		NewUserPWD = request.getParameter("NewUserPWD");
		
		request.setAttribute("NewUserName", user);
		request.setAttribute("NewUserPWD", user);
		
	   
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		requestDispatcher.forward(request, response);
		

	}

}
