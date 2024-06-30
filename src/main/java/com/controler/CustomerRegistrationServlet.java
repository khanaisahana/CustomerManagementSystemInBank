package com.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerRegistrationDao;
import com.model.CustomerRegistration;

/**
 * Servlet implementation class CustomerRegistrationServlet
 */
@WebServlet("/CustomerRegistrationServlet")
public class CustomerRegistrationServlet extends HttpServlet {
	
	private CustomerRegistrationDao customerRegistrationDao;
	
	public void init() {
		customerRegistrationDao = new CustomerRegistrationDao();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String ssn_id = request.getParameter("ssn_id");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String address = request.getParameter("address");
		String contactNumber = request.getParameter("contactNumber");
		
		System.out.println("check"+ssn_id);
		CustomerRegistration c = new CustomerRegistration();
		c.setSsn_id(ssn_id);
		c.setFirstName(firstName);
		c.setLastName(lastName);
		c.setEmail(email);
		c.setPassword(password);
		c.setConfirmPassword(confirmPassword);
		c.setAddress(address);
		c.setContactNumber(contactNumber);
		
		System.out.println(c.getSsn_id());

        try {
             CustomerRegistrationDao.customerRegistrationDao(c);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("login.html");
	}

}
