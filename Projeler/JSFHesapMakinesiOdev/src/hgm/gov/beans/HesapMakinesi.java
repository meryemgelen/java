package hgm.gov.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Data;

@ManagedBean
@Data
@SessionScoped
public class HesapMakinesi {
	private float deger1;
	private float deger2;
	private float sonuc = 0;

	public void topla() {
		sonuc = deger1 + deger2;
	}

	public void cikar() {
		sonuc = deger1 - deger2;
	}

	public void carpma() {
		sonuc = deger1 * deger2;
	}

	public void bolme() {
		sonuc = deger1 / deger2;
	}

}
