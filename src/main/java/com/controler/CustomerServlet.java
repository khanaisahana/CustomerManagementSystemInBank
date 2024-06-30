package com.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerBalanceDao;
import com.dao.CustomerDao;
import com.model.CustomerRegistration;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {

	private CustomerDao customerDao;

	public void init() {
		customerDao = new CustomerDao();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><head><link rel=\"stylesheet\" href=\"style.css\"></head><body><div class=\"container\">");  
        out.println("<h1>Customer List</h1>");  
        out.println("<table border=1 width=100%");  
        out.println("<tr><th>ssn_id</th><th>firstName</th><th>lastName</th><th>email</th><th>password</th><th>confirmPassword</th><th>address</th><th>contactNumber</th></tr>");
		List<CustomerRegistration> customers = null;
		try {
			customers = customerDao.getAllCustomers();
			for(int i=0;i<customers.size();i++) {
				
				 out.println("<tr><td>" + customers.get(i).getSsn_id() + "</td><td>" + customers.get(i).getFirstName() + "</td><td>" + customers.get(i).getLastName() + "</td><td>"+ customers.get(i).getEmail() + "</td><td>" + customers.get(i).getPassword() + "</td><td>" + customers.get(i).getConfirmPassword() + "</td><td>" + customers.get(i).getAddress() + "</td><td>" + customers.get(i).getContactNumber() + "</td></tr>");   
				
			}
			out.println("</table>");  
            out.println("</div></body></html>"); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		request.setAttribute("customers", customers);
//		
//		RequestDispatcher dispatcher=request.getRequestDispatcher("/customerList.jsp");
//		dispatcher.forward(request, response);
	}
}
