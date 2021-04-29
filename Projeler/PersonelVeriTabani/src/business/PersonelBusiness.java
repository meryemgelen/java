package business;

import java.util.List;

import beans.Personel;
import db.DBBase;
import db.PersonelDB;

public class PersonelBusiness {
    public List<Personel> getPersoneller() {
	try {
	    return new PersonelDB().getPersoneller();
	} finally {
	    DBBase.closeConnection();
	}
    }

    public void personelEkle(Personel personel) {
	try {
	    new PersonelDB().personelEkle(personel);
	    DBBase.commit();
	} catch (Exception e) {
	    DBBase.rollback();
	} finally {
	    DBBase.closeConnection();
	}
    }

    public void personelSil(int id) {
	try {
	    new PersonelDB().personelSil(id);
	    DBBase.commit();
	} catch (Exception e) {
	    DBBase.rollback();
	} finally {
	    DBBase.closeConnection();
	}
    }

}
