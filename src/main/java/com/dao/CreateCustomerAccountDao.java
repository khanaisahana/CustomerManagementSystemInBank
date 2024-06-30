package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.CreateCustomerAccount;
import com.model.CustomerRegistration;

public class CreateCustomerAccountDao {

	public static int createCustomerAccountDao(CreateCustomerAccount c) throws SQLException {
		int check = 0;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			System.out.println("successful");
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			con = DriverManager.getConnection("jdbc:derby:C:\\Users\\sahan\\MyDB;create=true");
			if(con!=null) {

			String sql = "insert into CreateCustomerAccount(customer_id, name, accountNo, ifscCode, amount, aadhaarNo, panNo, dob, gender, maritalStatus, email, address, contactNo) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

			pst = con.prepareStatement(sql);
			
			
			
			pst.setString(1, c.getCustomer_id());
			pst.setString(2, c.getName());
			pst.setString(3, c.getAccountNo());
			pst.setString(4, c.getIfscCode());
			pst.setLong(5, c.getAmount());
			pst.setString(6, c.getAadharNo());
			pst.setString(7, c.getPanNo());
			pst.setString(8, c.getDob());
			pst.setString(9, c.getGender());
			pst.setString(10, c.getMaritalStatus());
			pst.setString(11, c.getEmail());
			pst.setString(12, c.getAddress());
			pst.setString(13, c.getContactNo());
			

			
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
