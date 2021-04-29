package beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // bu clasýn veritabanundan veri okumak için olan bir class olduðunu
		// tanýmlýyoruz.
@Table(name = "personel")
public class Personel {
	@Id // bu class da primery key olarak bu kullanýlacak
	private int id;
	@Column(name = "tcno")
	private String tcKimlikNo;
	private String adi;
	private String soyadi;
	private String sifre;
	@OneToMany(mappedBy = "personel")
	private List<PersonelAdres> personelAdresler;
}
