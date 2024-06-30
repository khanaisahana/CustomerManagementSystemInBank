package com.controler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerLoginDao;
import com.model.CustomerRegistration;

/**
 * Servlet implementation class CustomerLoginServlet
 */
@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 
	    private CustomerLoginDao loginDao;

	    public void init() {
	        loginDao = new CustomerLoginDao();
	    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("ssn_id");
        String password = request.getParameter("password");
        

        try {
			boolean res = CustomerLoginDao.customerLoginDao(username,password);
			
			if (res) {
                response.sendRedirect("home.html");
            } else {
                HttpSession session = request.getSession();
            }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
            
        
	}

}
