package hgm.gov.beans.entity;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Named
@Entity
public class Personel {
	@Id
	private int id;
	private String adi;
	private String soyadi;
	@Column(name = "tcno")
	private String tcno;
	private String sifre;
	private String birlik_id;
	// @ManyToOne
	// private Birlik birlik;
	private byte[] resim;
}
