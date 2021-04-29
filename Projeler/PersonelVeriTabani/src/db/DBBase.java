package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.Sabitler;
import util.Util;

public class DBBase {
    static {
	try {
	    Class.forName(Util.getParam(Sabitler.DRIVER_CLASS));
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
    }

    private static Connection connection;

    protected Connection getConnection() throws SQLException {
	if (connection == null) {
	    connection = DriverManager.getConnection(Util.getParam(Sabitler.URL), Util.getParam(Sabitler.USERNAME),
		    Util.getParam(Sabitler.PASSWORD));
	    connection.setAutoCommit(false);
	}
	return connection;
    }

    public static void closeConnection() {
	try {
	    connection.close();
	    connection = null;
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

    public static void commit() {
	try {
	    connection.commit();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }

    public static void rollback() {
	try {
	    connection.rollback();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }
}
