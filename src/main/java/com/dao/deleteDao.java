package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteDao {

	public static int deleteCutomerRecord(String ssn_id) throws SQLException {
		int check = 0;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			con = DriverManager.getConnection("jdbc:derby:C:\\Users\\sahan\\MyDB;create=true");

			String sql = "delete from CustomerRegistration where ssn_id=?";

			pst = con.prepareStatement(sql);
            pst.setString(1, ssn_id);

			check = pst.executeUpdate();

			System.out.println(check);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return check;

	}
}
