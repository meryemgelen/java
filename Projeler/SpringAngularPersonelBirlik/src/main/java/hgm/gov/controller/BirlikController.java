package hgm.gov.controller;

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

import hgm.gov.beans.entity.Birlik;
import hgm.gov.beans.json.BirlikJSON;
import hgm.gov.service.BirlikService;
import hgm.gov.util.Util;

@RestController
public class BirlikController {
	@Inject
	private BirlikService birlikService;
	@Inject
	private ModelMapper modelMapper;

	@GetMapping("/birlik")
	public List<BirlikJSON> getBirlikler() {
		return birlikService.getBirlikler().stream().map(this::convertTo).collect(Collectors.toList());
	}

	private BirlikJSON convertTo(Birlik birlik) {
		BirlikJSON birlikJson = modelMapper.map(birlik, BirlikJSON.class);
		return birlikJson;
	}

	@GetMapping("/birlik/{id}")
	public Birlik getPersoneller(@PathVariable("id") int id) {
		return birlikService.getBirlik(id);
	}

	@PostMapping("/birlik")
	public String birlikYarat(@RequestBody BirlikJSON birlikJson) {
		System.out.println(birlikJson);
		Birlik birlik = modelMapper.map(birlikJson, Birlik.class);
		Birlik olusturulanBirlik = birlikService.birlikOlustur(birlik);
		return Util.tamamCevabiOlustur("birlikID", olusturulanBirlik.getId());
	}

	@PutMapping("/birlikMobil")
	public String mobildenBirlikYarat(@RequestBody BirlikJSON birlikJson) {
		Birlik birlik = modelMapper.map(birlikJson, Birlik.class);
		Birlik olusturulanBirlik = birlikService.birlikOlustur(birlik);
		return Util.tamamCevabiOlustur("birlikID", olusturulanBirlik.getId());
	}
}
