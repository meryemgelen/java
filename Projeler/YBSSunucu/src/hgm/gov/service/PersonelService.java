package hgm.gov.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import hgm.gov.dao.PersonelDAO;
import hgm.gov.entities.Personel;
import hgm.gov.util.Util;

@Named
public class PersonelService {
	@Inject
	private PersonelDAO personelDAO;

	public boolean girisYap(String tcNo, String sifre) {
		Optional<Personel> personel = personelDAO.getPersonel(tcNo);
		if (personel.isPresent()) {
			if (Util.getPasswordAuthentication().authenticate(sifre.toCharArray(), personel.get().getSifre())) {
				return true;
			}
		}
		return false;
	}

	public List<Personel> getPersonelListesi() {
		return personelDAO.getPersoneller();
	}

	public Personel getPersonel(int id) {
		Optional<Personel> personel = personelDAO.getPersonel(id);
		if (personel.isPresent()) {
			return personel.get();
		}
		return null;
	}
}
