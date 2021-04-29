package beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Birlik {
	private int id;
	private String adi;
	private int mevcut;
	private String sehir;
}
