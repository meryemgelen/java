package hgm.gov.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * The persistent class for the personel database table.
 * 
 */
@Data
@Entity
@NamedQuery(name = "Personel.findAll", query = "SELECT p FROM Personel p")
public class Personel implements Serializable {
	private static final long serialVersionUID = 7866557269218362887L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String adi;

	@Column(name = "birlik_id")
	private int birlikId;

	@Lob
	private byte[] resim;

	private String sifre;

	private String soyadi;

	private String tcno;

	@Column(name = "ev_koor_enlem")
	private BigDecimal evKoordinatEnlem;

	@Column(name = "ev_koor_boylam")
	private BigDecimal evKoordinatBoylam;

	// bi-directional many-to-one association to PersonelYetki
	@OneToMany(mappedBy = "personel")
	private List<PersonelYetki> personelYetkis;
}