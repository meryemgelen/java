package hgm.gov.beans;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import hgm.gov.service.IsimlerService;

@Named
@ManagedBean
@SessionScoped
public class PisimlerTable {
	private List<SimpleEntry<String, Integer>> liste;
	@Inject
	private IsimlerService isimlerService;

	public List<SimpleEntry<String, Integer>> getListe() {
		if (liste == null || liste.isEmpty()) {
			liste = isimlerService.getIsimSayilari();
		}
		return liste;
	}

	public void setListe(List<SimpleEntry<String, Integer>> liste) {
		this.liste = liste;
	}

}
