package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.CustomerRegistration;

public class CustomerLoginDao {

	

	public static boolean customerLoginDao(String ssn_id, String password) throws SQLException {

		boolean status = false;
		ResultSet rs=null;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			System.out.println("successful");
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			con = DriverManager.getConnection("jdbc:derby:C:\\Users\\sahan\\MyDB;create=true");
			if (con != null) {

				String sql = "select ssn_id, password from CustomerRegistration where ssn_id = ? and password = ? ";

				pst = con.prepareStatement(sql);

				pst.setString(1, ssn_id);
				pst.setString(2, password);

				rs = pst.executeQuery();
				status = rs.next();

				while (rs.next()) {
					status = true;
				}

				return status;

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return status;

	}

}
