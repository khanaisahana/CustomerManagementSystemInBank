package com.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.CustomerRegistration;

public class CustomerDao {

	public List<CustomerRegistration> getAllCustomers() throws ClassNotFoundException {

		ResultSet rs = null;
		Connection con = null;
		

        

		List<CustomerRegistration> customers = new ArrayList<>();
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			con = DriverManager.getConnection("jdbc:derby:C:\\Users\\sahan\\MyDB;create=true");

			if (con != null) {

				Statement stmt = con.createStatement();

				rs = stmt.executeQuery("select * from CustomerRegistration");

				while (rs.next()) {
					
					CustomerRegistration customer = new CustomerRegistration();
					
					
					
					customer.setSsn_id((String)rs.getObject("ssn_id"));
					customer.setFirstName((String)rs.getObject("firstName"));
					customer.setLastName((String)rs.getObject("lastName"));
					customer.setEmail((String)rs.getObject("email"));
					customer.setPassword((String)rs.getObject("password"));
					customer.setConfirmPassword((String)rs.getObject("confirmPassword"));
					customer.setAddress((String)rs.getObject("address"));
					customer.setContactNumber((String)rs.getObject("contactNumber"));
					
					
					customers.add(customer);
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}
}
