package com.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CreateCustomerAccountDao;
import com.dao.CustomerRegistrationDao;
import com.model.CreateCustomerAccount;
import com.model.CustomerRegistration;

/**
 * Servlet implementation class CreateCustomerAccountServlet
 */
@WebServlet("/CreateCustomerAccountServlet")
public class CreateCustomerAccountServlet extends HttpServlet {
	
    private CreateCustomerAccountDao createCustomerAccountDao;
	
	public void init() {
		createCustomerAccountDao = new CreateCustomerAccountDao();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String ssn_id = request.getParameter("customer_id");
		String name = request.getParameter("name");
		String accountNo = request.getParameter("accountNo");
		String ifscCode = request.getParameter("ifscCode");
		int amount = Integer.parseInt(request.getParameter("amount"));
		String aadharNo = request.getParameter("aadharNo");
		String panNo = request.getParameter("panNo");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String maritalStatus = request.getParameter("maritalStatus");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String contactNo = request.getParameter("contactNo");
		
		
		CreateCustomerAccount c = new CreateCustomerAccount();
		c.setCustomer_id(ssn_id);
		c.setName(name);
		c.setAccountNo(accountNo);
		c.setIfscCode(ifscCode);
		c.setAmount(amount);
		c.setAadharNo(aadharNo);
		c.setPanNo(panNo);
		c.setDob(dob);
		c.setGender(gender);
		c.setMaritalStatus(maritalStatus);
		c.setEmail(email);
		c.setAddress(address);
		c.setContactNo(contactNo);
		
		

        try {
        	CreateCustomerAccountDao.createCustomerAccountDao(c);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("home.html");
	}

}
