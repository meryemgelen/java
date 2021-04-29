package paket20;

public class Ornek {
    int sayi = 3;

    Ornek(Ornek o) {
	this(5);
	if (o != null) {
	    sayi += o.sayi;
	}
    }

    Ornek(int sayi2) {
	sayi = sayi2;
    }
}
