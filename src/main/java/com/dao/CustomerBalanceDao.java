package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerBalanceDao {

	public static int customerBalanceDao(String accountNo) throws SQLException {

		int balance=0;
		ResultSet rs=null;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		
		try {
			System.out.println("successful");
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			con = DriverManager.getConnection("jdbc:derby:C:\\Users\\sahan\\MyDB;create=true");
			
			if (con != null) {

				String sql = "select amount from CreateCustomerAccount where accountNo = ?";

				pst = con.prepareStatement(sql);

				pst.setString(1, accountNo);
				

				rs = pst.executeQuery();
				

				if(rs.next()) {
					
					balance=rs.getInt("amount");
					
				}

				return balance;

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return balance;
		

	}

}
