package com.controler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.deleteDao;



/**
 * Servlet implementation class deleteServlet
 */
@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 
    private deleteDao d;

    public void init() {
    	d = new deleteDao();
    }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String ssn_id = request.getParameter("ssn_id");
    
    
    try {
		int res = d.deleteCutomerRecord(ssn_id);
		
		System.out.println(res);
		
		if (res==1) {
            response.sendRedirect("CustomerServlet");
        } else {
            HttpSession session = request.getSession();
        }
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
