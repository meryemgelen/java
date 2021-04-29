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
@ToString

public class Masa implements Kiyaslanabilir {
    private int agirlik;
    private String renk;

    public int kiyasla(Object o) {
	Masa masa = (Masa) o;
	if (agirlik > masa.agirlik) {
	    return 1;
	} else if (agirlik < masa.agirlik) {
	    return -1;
	} else {
	    return 0;
	}
    }

}
