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
@ToString

public class Masa implements Comparable<Masa> {
    private int agirlik;
    private String renk;

    @Override
    public int compareTo(Masa o) {
	if (agirlik > o.agirlik) {
	    return 1;
	} else if (agirlik < o.agirlik) {
	    return -1;
	}
	return 0;
    }
}
