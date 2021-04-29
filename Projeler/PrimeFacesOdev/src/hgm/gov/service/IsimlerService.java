package hgm.gov.service;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import hgm.gov.dao.IsimDAO;

@Named
public class IsimlerService {
	@Inject
	private IsimDAO isimkDAO;

	public List<SimpleEntry<String, Integer>> getIsimSayilari() {
		return isimkDAO.getIsimSayilari();
	}
}
