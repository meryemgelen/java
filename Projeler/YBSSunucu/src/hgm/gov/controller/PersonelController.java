package hgm.gov.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import hgm.gov.entities.Personel;
import hgm.gov.service.PersonelService;

@RestController
@RequestMapping("/personel")
public class PersonelController {
	@Inject
	private PersonelService personelService;

	@GetMapping("/liste")
	public String liste() {
		JsonArray sonuc = new JsonArray();
		personelService.getPersonelListesi().forEach(p -> {
			JsonObject personelJsonObject = new JsonObject();
			personelJsonObject.addProperty("id", p.getId());
			personelJsonObject.addProperty("tcNo", p.getTcno());
			personelJsonObject.addProperty("adi", p.getAdi());
			personelJsonObject.addProperty("soyadi", p.getSoyadi());
			personelJsonObject.addProperty("birlikId", p.getBirlikId());

			sonuc.add(personelJsonObject);
		});

		return sonuc.toString();
	}

	@GetMapping("/detay")
	public String detay(@RequestParam int id) {
		Personel personel = personelService.getPersonel(id);
		JsonObject personelJsonObject = new JsonObject();
		if (personel != null) {
			personelJsonObject.addProperty("id", personel.getId());
			personelJsonObject.addProperty("adi", personel.getAdi());
			personelJsonObject.addProperty("soyadi", personel.getSoyadi());
			personelJsonObject.addProperty("tcNo", personel.getTcno());
			personelJsonObject.addProperty("birlikId", personel.getBirlikId());
			personelJsonObject.addProperty("evKoorEnlem", personel.getEvKoordinatEnlem());
			personelJsonObject.addProperty("evKoorBoylam", personel.getEvKoordinatBoylam());
		}
		return personelJsonObject.toString();
	}
}
