package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.CustomerRegistration;

public class CustomerRegistrationDao {

	public static int customerRegistrationDao(CustomerRegistration c) throws SQLException {
		int check = 0;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			System.out.println("successful");
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			con = DriverManager.getConnection("jdbc:derby:C:\\Users\\sahan\\MyDB;create=true");
			if(con!=null) {

			String sql = "insert into CustomerRegistration(ssn_id, firstName, lastName, email, password, confirmPassword, address, contactNumber) values(?,?,?,?,?,?,?,?)";

			pst = con.prepareStatement(sql);
			
			pst.setString(1, c.getSsn_id());
			pst.setString(2, c.getFirstName());
			pst.setString(3, c.getLastName());
			pst.setString(4, c.getEmail());
			pst.setString(5, c.getPassword());
			pst.setString(6, c.getConfirmPassword());
			pst.setString(7, c.getAddress());
			pst.setString(8, c.getContactNumber());

			
			System.out.println(pst);
			
			check = pst.executeUpdate();

			System.out.println(check);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return check;
		
		
	}
}
