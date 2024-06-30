package com.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.CustomerBalanceDao;

/**
 * Servlet implementation class CustomerBalanceServlet
 */
@WebServlet("/CustomerBalanceServlet")
public class CustomerBalanceServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	 
    private CustomerBalanceDao balanceDao;

    public void init() {
    	balanceDao = new CustomerBalanceDao();
    }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String accountNo = request.getParameter("accountNo");
	
	PrintWriter out=response.getWriter();
	
    try {
		int res = CustomerBalanceDao.customerBalanceDao(accountNo);
		
		out.println("<html><head><link rel=\"stylesheet\" href=\"style.css\"></head><body><div class=\"container\">");  
        out.println("<h1>Balance amount is</h1>");  
       
		out.println("<h1>"+res +"</h1>");
//		if (res) {
//            response.sendRedirect("home.html");
//        } else {
//            HttpSession session = request.getSession();
//        }
		 out.println("</div></body></html>"); 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}  
    
	
}
