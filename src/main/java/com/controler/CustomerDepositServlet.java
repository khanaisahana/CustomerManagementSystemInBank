package com.controler;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDepositDao;



/**
 * Servlet implementation class CustomerDepositServlet
 */
@WebServlet("/CustomerDepositServlet")
public class CustomerDepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 
    private CustomerDepositDao depositDao;

    public void init() {
    	depositDao = new CustomerDepositDao();
    }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String accountNo = request.getParameter("accountNo");
    String amount = request.getParameter("amount");
    

    System.out.println(accountNo +" "+ amount);
    
    try {
		boolean res = CustomerDepositDao.customerDepositDao(accountNo, amount);
		
		System.out.println(res);
		
		if (res) {
            response.sendRedirect("balance.html");
        } else {
            HttpSession session = request.getSession();
        }
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
