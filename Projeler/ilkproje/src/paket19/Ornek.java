package paket19;

public class Ornek {
    int sayi = 3;
    static {
	new Ornek(4).sayi = 5;
    }

    Ornek() {
	this(6);
	System.out.println(sayi);
    }

    Ornek(int sayi) {
	System.out.println(sayi);
	this.sayi = sayi;
    }
}
