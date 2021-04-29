package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the personel_adres database table.
 * 
 */
@Entity
@Table(name="personel_adres")
@NamedQuery(name="PersonelAdres.findAll", query="SELECT p FROM PersonelAdres p")
public class PersonelAdres implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String adres;

	//bi-directional many-to-one association to Personel
	@ManyToOne
	private Personel personel;

	public PersonelAdres() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdres() {
		return this.adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public Personel getPersonel() {
		return this.personel;
	}

	public void setPersonel(Personel personel) {
		this.personel = personel;
	}

}