package ornek2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBBase {

    static {
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
    }

    private static Connection connection;

    protected Connection getConnection() throws SQLException {
	if (connection == null) {
	    connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/harita?serverTimezone=Europe/Istanbul", "harita_user", "Aa123456");
	    System.out.println("Connection alýndý.");
	}
	return connection;
    }

    protected void close(ResultSet rs, Statement stmt) {
	try {
	    rs.close();
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    close(stmt);
	}
    }

    protected void close(Statement stmt) {
	try {
	    stmt.close();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }

    protected static void closeConnection() {
	try {
	    connection.close();
	    System.out.println("Connection kapatýldý");
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }

}
