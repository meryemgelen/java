package ornek2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString()

public class Ogrenci implements Kiyaslanabilir {
    private String adi;
    private int yas;

    public int kiyasla(Object o) {
	Ogrenci ogrenci = (Ogrenci) o;
	if (yas > ogrenci.yas) {
	    return 1;
	} else if (yas < ogrenci.yas) {
	    return -1;
	} else {
	    return 0;
	}
    }

}
