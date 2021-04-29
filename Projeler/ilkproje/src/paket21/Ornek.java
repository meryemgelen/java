package paket21;

public class Ornek {
    int sayi = 3;

    Ornek() {
	this(2);
	sayi++;
    }

    Ornek(int s) {
	this(2.4);
	sayi -= s++;

    }

    Ornek(double s) {
	sayi += s;
    }

    public static void main(String[] args) {
	System.out.println(new Ornek().sayi);

    }
}
