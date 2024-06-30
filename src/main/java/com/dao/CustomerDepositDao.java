package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDepositDao {

	public static boolean customerDepositDao(String accountNo, String amount) throws SQLException {

		boolean status = false;
		int check=0;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			System.out.println("successful");
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			con = DriverManager.getConnection("jdbc:derby:C:\\Users\\sahan\\MyDB;create=true");
			if (con != null) {

				String sql = "update CreateCustomerAccount set amount=amount+?  where accountNo = ?";

				pst = con.prepareStatement(sql);
				
				pst.setString(1, amount);
				pst.setString(2, accountNo);

				check = pst.executeUpdate();
				
				System.out.println(check);
				
				if(check==1) {
					status=true;
				}
				System.out.println(status);
				
				return status;

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

		System.out.println(status);
		
		return status;
	}
}
