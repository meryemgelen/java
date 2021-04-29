package hgm.gov.dao;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import hgm.gov.beans.entity.Birlik;
import hgm.gov.repository.BirlikRespository;

@Named
public class BirlikDAO {
	@Inject
	private BirlikRespository birlikRepository;

	public List<Birlik> getBirlikler() {
		return birlikRepository.findAll();
	}

	public Optional<Birlik> getBirlik(int id) {
		return birlikRepository.findById(id);
	}

	public Birlik birlikOlustur(Birlik birlik) {
		Birlik kaydedilenB = birlikRepository.save(birlik);
		System.out.println(kaydedilenB.getId());
		return kaydedilenB;
	}
}
