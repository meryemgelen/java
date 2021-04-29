package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Personel;

public class PersonelDB extends DBBase {
    public List<Personel> getPersoneller() {
	List<Personel> personelListesi = new ArrayList<Personel>();
	PreparedStatement stmt = null;
	ResultSet rs = null;
	try {
	    Connection conn = getConnection();
	    stmt = conn.prepareStatement("select * from personel");
	    rs = stmt.executeQuery();
	    while (rs.next()) {
		personelListesi.add(new Personel(rs.getInt("id"), rs.getString("tcno"), rs.getString("adi"),
			rs.getString("soyadi")));
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    close(rs, stmt);
	}
	return personelListesi;
    }

    public void personelEkle(Personel personel) {
	PreparedStatement stmt = null;
	try {
	    Connection conn = getConnection();
	    stmt = conn.prepareStatement("insert into personel(tcno, adi, soyadi) values(?,?,?)");
	    stmt.setString(1, personel.getTcno());
	    stmt.setString(2, personel.getAdi());
	    stmt.setString(3, personel.getSoyadi());
	    stmt.executeUpdate();
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    close(stmt);
	}
    }

    public void personelSil(int id) {
	PreparedStatement stmt = null;
	try {
	    Connection conn = getConnection();
	    stmt = conn.prepareStatement("delete from personel where id = ?");
	    stmt.setInt(1, id);
	    stmt.executeUpdate();
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    close(stmt);
	}
    }

}
