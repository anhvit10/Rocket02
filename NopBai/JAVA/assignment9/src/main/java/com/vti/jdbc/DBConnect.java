//
package com.vti.jdbc;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * This class connects database. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 27, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 27, 2020
 */
public class DBConnect {

	
	/**
	 * This method opens connection to database. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 * @return
	 */
	public static Connection openConnection() {
		Connection con = null;
		Properties propertiesFile = new Properties();
		try {
			propertiesFile.load(new FileInputStream("src/main/resources/jdbc.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String url = propertiesFile.getProperty("connectionString");
		String user = propertiesFile.getProperty("username");
		String password = propertiesFile.getProperty("password");
		String driver = propertiesFile.getProperty("driverSQLName");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}


	/**
	 * This method close database connection . 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 * @param con
	 * @param pstmt
	 * @param rs
	 */
	public static void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
