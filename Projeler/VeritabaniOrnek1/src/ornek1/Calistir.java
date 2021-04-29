package ornek1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Calistir {

    static {
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
    }

    public static void main(String[] args) throws SQLException {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	try {
	    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/harita?serverTimezone=Europe/Istanbul",
		    "harita_user", "Aa123456");
	    stmt = conn.prepareStatement("select * from personel");
	    rs = stmt.executeQuery();
	    while (rs.next()) {
		String tcno = rs.getString("tcno");
		String adi = rs.getString("adi");
		String soyadi = rs.getString("soyadi");
		System.out.format("TcnNo : %s, Adi : %s , Soyadi : %s%n", tcno, adi, soyadi);
	    }

	} finally {
	    try {
		rs.close();
	    } finally {
		try {
		    stmt.close();
		} finally {
		    conn.close();
		}
	    }
	}
    }
}
