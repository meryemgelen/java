package hgm.gov.dao;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import hgm.gov.entities.Personel;
import hgm.gov.repository.PersonelRepository;

@Named
public class PersonelDAO {
	@Inject
	private PersonelRepository personelRepository;

	public Optional<Personel> getPersonel(String tcNo) {
		return personelRepository.findByTcno(tcNo);
	}

	public Optional<Personel> getPersonel(int id) {
		return personelRepository.findById(id);
	}

	public List<Personel> getPersoneller() {
		return personelRepository.findAll();
	}
}
