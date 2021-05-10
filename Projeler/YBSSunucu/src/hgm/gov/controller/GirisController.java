package hgm.gov.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import hgm.gov.service.PersonelService;

@RestController
public class GirisController {
	@Inject
	private PersonelService personelService;

	@PostMapping("/giris")
	public String giris(@RequestBody String data) {
		JsonObject jsonData = JsonParser.parseString(data).getAsJsonObject();
		String tcNo = jsonData.get("tcNo").getAsString();
		String sifre = jsonData.get("sifre").getAsString();

		JsonObject sonuc = new JsonObject();
		sonuc.addProperty("sonuc", personelService.girisYap(tcNo, sifre));
		return sonuc.toString();
	}

}
