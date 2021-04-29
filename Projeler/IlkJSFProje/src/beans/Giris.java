package beans;

import javax.faces.bean.ManagedBean;

import lombok.Data;

@Data
@ManagedBean
public class Giris {
	private String isim;

	public String butonaBasildi() {
		System.out.println(isim);
		return "ikincisayfa";
	}
}
