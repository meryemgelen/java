package hgm.gov.controller;

import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hgm.gov.beans.entity.Personel;
import hgm.gov.beans.json.PersonelJSON;
import hgm.gov.service.PersonelService;
import hgm.gov.util.Util;

@RestController
public class PersonelController {
	@Inject
	private PersonelService personelService;
	@Inject
	private ModelMapper modelMapper;

	@GetMapping("/personel")
	public List<PersonelJSON> getPersoneller() {
//		List<Personel> personeller = personelService.getPersoneller();
//
//		List<PersonelJSON> personellerJSON = new ArrayList<PersonelJSON>();
//		for (int i = 0; i < personeller.size(); i++) {
//			PersonelJSON personelJson = modelMapper.map(personeller.get(i), PersonelJSON.class);
//			personellerJSON.add(personelJson);
//		}
//		return personellerJSON;
//
		return personelService.getPersoneller().stream().map(this::convertTo).collect(Collectors.toList());
	}

	private PersonelJSON convertTo(Personel personel) {
		PersonelJSON personelJson = modelMapper.map(personel, PersonelJSON.class);
		return personelJson;
	}

	@GetMapping("/personel/{id}")
	public PersonelJSON getPersonel(@PathVariable("id") int id) throws Exception {
		Personel personel = personelService.getPersonel(id);
		if (personel != null) {
			PersonelJSON personelJSON = convertTo(personel);

			// if (personel.getBirlik() != null) {
			// personelJSON.setBirlik_id(personel.getBirlik().getId());
			// }
			personelJSON.setSifre(null);
			if (personel.getResim() != null) {
				String resim64 = Base64.getEncoder().encodeToString(personel.getResim());
				personelJSON.setResim(resim64);
			}
			return personelJSON;
		} else {
			throw new Exception("Personel Bulunamadı");
		}
	}

	@PostMapping("/personel")
	public String personelYarat(@RequestBody PersonelJSON personelJson) {
		System.out.println(personelJson);
		Personel personel = modelMapper.map(personelJson, Personel.class);
		// ModelMapper, bir objeden başka bir objeye değişken değerleri ile dönüşüm
		// yapmak için kullanılır. Üstteki kod, alttaki kodun yaptığını yapar.
		// ModelMapper kullanabilmek için sınıfların değişken isimlerinin aynı olması
		// gerekmektedir.

//      Personel personel = new Personel();
//      personel.setAdi(personelJson.getAdi());
//      personel.setSoyadi(personelJson.getSoyadi());
//      personel.setSifre(personelJson.getSifre());
//      personel.setTcno(personelJson.getTcno());

		Personel olusturulanPersonel = personelService.personelOlustur(personel);
		return Util.tamamCevabiOlustur("personelId", olusturulanPersonel.getId());
	}

	@PutMapping("/personelMobil")
	public String mobildenPersonelYarat(@RequestBody PersonelJSON personelJson) {
		System.out.println(personelJson);
		Personel personel = modelMapper.map(personelJson, Personel.class);
		if (personelJson.getResim() != null) {
			personel.setResim(Base64.getDecoder().decode(personelJson.getResim()));
		}
		personel.setSifre(Util.getPasswordAuthentication().hash(personel.getSifre().toCharArray()));

		Personel olusturulanPersonel = personelService.personelOlustur(personel);
		return Util.tamamCevabiOlustur("personelId", olusturulanPersonel.getId());
	}
}
