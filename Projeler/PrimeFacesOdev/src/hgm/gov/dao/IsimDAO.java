package hgm.gov.dao;

import java.math.BigInteger;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import hgm.gov.repository.IsimlerRepository;

@Named
public class IsimDAO {
	@Inject
	private IsimlerRepository isimRepository;

	public List<SimpleEntry<String, Integer>> getIsimSayilari() {
		List<Object[]> sonuc = isimRepository.getIsimSayilari();
		List<SimpleEntry<String, Integer>> isimSayilariListesi = new ArrayList<SimpleEntry<String, Integer>>();
		for (Object[] kayit : sonuc) {
			String isim = (String) kayit[0];
			Integer isimSayisi = ((BigInteger) kayit[1]).intValue();
			SimpleEntry<String, Integer> deger = new SimpleEntry<String, Integer>(isim, isimSayisi);
			isimSayilariListesi.add(deger);
		}
		return isimSayilariListesi;
	}
}
