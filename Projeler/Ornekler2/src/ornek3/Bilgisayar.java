package ornek3;

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

public class Bilgisayar implements Kiyaslanabilir {
    private int ram;

    public int kiyasla(Object o) {
	Bilgisayar bilgisayar = (Bilgisayar) o;
	if (ram > bilgisayar.ram) {
	    return 1;
	} else if (ram < bilgisayar.ram) {
	    return -1;
	} else {
	    return 0;
	}
    }

}
