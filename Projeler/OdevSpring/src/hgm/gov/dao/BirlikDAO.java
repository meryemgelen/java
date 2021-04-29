package hgm.gov.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hgm.gov.entities.Birlik;
import hgm.gov.repositories.PersonelRepository;

@Component
public class BirlikDAO {
	@Autowired
	private PersonelRepository personelRepository;

	public List<Birlik> getBirlikler() {
		// List<Personel> liste = new ArrayList<Personel>();
		// personelRepository.findAll().forEach(liste::add);
		return personelRepository.fetchEmpDeptDataLeftJoin();
		// personelRepository.findByAdi("ilhan").forEach(liste::add);
		// return liste;

	}

}
