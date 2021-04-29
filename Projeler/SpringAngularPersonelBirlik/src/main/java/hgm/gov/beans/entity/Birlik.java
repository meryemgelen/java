package hgm.gov.beans.entity;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Named
public class Birlik {
	@Id
	private int id;
	private String adi;
	private int mevcut;
	private String sehir;

}
