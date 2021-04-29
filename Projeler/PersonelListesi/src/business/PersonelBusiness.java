package business;

import java.util.List;

import dao.PersonelDAO;
import entities.Personel;

public class PersonelBusiness {

	public List<Personel> personelListesi() {
		List<Personel> personelListesi = new PersonelDAO().getPersonelList();
		return personelListesi;
	}
}
