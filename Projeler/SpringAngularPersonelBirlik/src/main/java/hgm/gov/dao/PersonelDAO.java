package hgm.gov.dao;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import hgm.gov.beans.entity.Personel;
import hgm.gov.repository.PersonelRespository;

@Named
public class PersonelDAO {
	@Inject
	private PersonelRespository personelRepository;

	public List<Personel> getPersoneller() {
		return personelRepository.findAll();
	}

	public Optional<Personel> getPersonel(int id) {
		return personelRepository.findById(id);
	}

	public Personel personelOlustur(Personel personel) {
		Personel kaydedilenp = personelRepository.save(personel);
		System.out.println(kaydedilenp.getId());
		return kaydedilenp;
	}
}
