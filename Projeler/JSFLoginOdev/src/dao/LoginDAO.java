package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	public static boolean validate(String tcno, String sifre) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DBBase.getConnection();
			ps = con.prepareStatement("Select tcno, sifre from personel where tcno = ? and sifre = ?");
			ps.setString(1, tcno);
			ps.setString(2, sifre);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				// result found, means valid inputs
				return true;
			}
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return false;
		} finally {
			DBBase.close(con);
		}
		return false;
	}
}
