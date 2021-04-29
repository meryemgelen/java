package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the personel database table.
 * 
 */
@Entity
@NamedQuery(name="Personel.findAll", query="SELECT p FROM Personel p")
public class Personel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String adi;

	private String sifre;

	private String soyadi;

	private String tcno;

	//bi-directional many-to-one association to PersonelAdres
	@OneToMany(mappedBy="personel")
	private List<PersonelAdres> personelAdres;

	public Personel() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return this.adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSifre() {
		return this.sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getSoyadi() {
		return this.soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getTcno() {
		return this.tcno;
	}

	public void setTcno(String tcno) {
		this.tcno = tcno;
	}

	public List<PersonelAdres> getPersonelAdres() {
		return this.personelAdres;
	}

	public void setPersonelAdres(List<PersonelAdres> personelAdres) {
		this.personelAdres = personelAdres;
	}

	public PersonelAdres addPersonelAdre(PersonelAdres personelAdre) {
		getPersonelAdres().add(personelAdre);
		personelAdre.setPersonel(this);

		return personelAdre;
	}

	public PersonelAdres removePersonelAdre(PersonelAdres personelAdre) {
		getPersonelAdres().remove(personelAdre);
		personelAdre.setPersonel(null);

		return personelAdre;
	}

}