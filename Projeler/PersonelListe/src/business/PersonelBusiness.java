package business;

import java.util.List;

import beans.Birlik;
import beans.Personel;
import db.PersonelDB;

public class PersonelBusiness {
	public List<Personel> getPersoneller() {
		return new PersonelDB().getPersonelListesi();
	}

	public List<Birlik> getBirlikler() {
		return new PersonelDB().getBirlikListesi();
	}
}
