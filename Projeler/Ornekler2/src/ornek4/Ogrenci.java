package ornek4;

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

public class Ogrenci implements Comporable<Ogrenci> {
    private String adi;
    private int yas;

    @Override
    public int compareTo(Ogrenci o) {
	if (yas > o.yas) {
	    return 1;
	} else if (yas < o.yas) {
	    return -1;
	}
	return 0;
    }
}
