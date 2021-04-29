package sayi;

import lombok.Data;

@Data
public class TahminSonucu {
	private int dogruBasamak;
	private int yanlisBasamak;
	private boolean hataliTahmin;

	public void dogruBasamakArttir() {
		dogruBasamak++;
	}

	public void yanlisBasamakArttir() {
		yanlisBasamak++;
	}
}
