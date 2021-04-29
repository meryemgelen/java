package business;

import java.util.List;

import dao.PersonelAdresDAO;
import entities.PersonelAdres;

public class PersonelAdresBusiness {

	public List<PersonelAdres> getPersonelAdresler(int personelId) {
		List<PersonelAdres> personelAdres = new PersonelAdresDAO().getPersonelAdresler(personelId);
		return personelAdres;
	}
}
