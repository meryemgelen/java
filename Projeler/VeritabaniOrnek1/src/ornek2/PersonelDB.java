package ornek2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonelDB extends DBBase {
    public List<Personel> getPersoneller() {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	List<Personel> personelListesi = new ArrayList<Personel>();
	try {
	    conn = getConnection();
	    stmt = conn.prepareStatement("select * from personel");
	    rs = stmt.executeQuery();
	    while (rs.next()) {
		Personel personel = new Personel();
		personel.setTcno(rs.getString("tcno"));
		personel.setAdi(rs.getString("adi"));
		personel.setSoyadi(rs.getString("soyadi"));
		personelListesi.add(personel);
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    close(rs, stmt);
	}
	return personelListesi;
    }
}
