package hgm.gov.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hgm.gov.dao.BirlikDAO;
import hgm.gov.entities.Birlik;

@Service
public class BirlikBusiness {
	@Autowired
	private BirlikDAO birlikDAO;

	public List<Birlik> getBirlikler() {
		return birlikDAO.getBirlikler();
	}
}
