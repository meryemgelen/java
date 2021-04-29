package hgm.gov.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import hgm.gov.beans.entity.Birlik;
import hgm.gov.dao.BirlikDAO;

@Named
public class BirlikService {
	@Inject
	private BirlikDAO birlikDAO;

	public List<Birlik> getBirlikler() {
		return birlikDAO.getBirlikler();
	}

	public Birlik getBirlik(int id) {
		Optional<Birlik> o = birlikDAO.getBirlik(id);
		if (o.isPresent()) {
			return o.get();
		}
		return null;
	}

	public Birlik birlikOlustur(Birlik birlik) {
		return birlikDAO.birlikOlustur(birlik);
	}
}
