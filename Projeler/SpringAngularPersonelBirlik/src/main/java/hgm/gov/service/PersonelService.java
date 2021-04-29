package hgm.gov.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import hgm.gov.beans.entity.Personel;
import hgm.gov.dao.PersonelDAO;
import hgm.gov.util.Util;

@Named
public class PersonelService {
	@Inject
	private PersonelDAO personelDAO;

	public List<Personel> getPersoneller() {
		return personelDAO.getPersoneller();
	}

	public Personel getPersonel(int id) {
		Optional<Personel> o = personelDAO.getPersonel(id);
		if (o.isPresent()) {
			return o.get();
		}
		return null;
	}

	public Personel personelOlustur(Personel personel) {
		personel.setSifre(Util.getPasswordAuthentication().hash(personel.getSifre().toCharArray()));
		return personelDAO.personelOlustur(personel);
	}
}