package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBBase {
	protected Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/harita", "harita_user", "Aa123456");
		return conn;
	}

	public void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
		}
	}

	protected void close(Statement stmt) {
		try {
			stmt.close();
		} catch (Exception e) {
		}
	}

	protected void close(ResultSet rs, Statement stmt) {
		try {
			rs.close();
		} catch (Exception e) {

		} finally {
			close(stmt);
		}

	}

}
