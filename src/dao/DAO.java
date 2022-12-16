
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	protected Connection con;
	private final String HostName = "127.0.0.1";
	private final String DBName = "kinbaospa";
	private final String UserName = "root";
	private final String Password = "123456";
	public String err;

	public DAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionURL = "jdbc:mysql://" + HostName + ":3306/" + DBName
					+ "?zeroDateTimeBehavior=convertToNull";
			con = DriverManager.getConnection(connectionURL, UserName, Password);
		} catch (Exception e) {
			err = e + "";
			con = null;
		}
	}

}
