package ornek2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BirlikDB extends DBBase {
    public List<Birlik> getBirlikler() {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	List<Birlik> birlikListesi = new ArrayList<Birlik>();
	try {
	    conn = getConnection();
	    stmt = conn.prepareStatement("select * from birlik");
	    rs = stmt.executeQuery();
	    while (rs.next()) {
		Birlik birlik = new Birlik();
		birlik.setAdi(rs.getString("adi"));
		birlik.setMevcut(rs.getInt("mevcut"));
		birlik.setSehir(rs.getString("sehir"));
		birlikListesi.add(birlik);
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    close(rs, stmt);
	}
	return birlikListesi;
    }
}
