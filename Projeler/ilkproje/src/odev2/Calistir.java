package odev2;

public class Calistir {

    public static void main(String[] args) {
	int birler, onlar, yuzler;
	// 1000'e kadar olan sayýlarýn basaamak toplamý basamak çarpýmýna eþit olan
	// sayýlar
	for (int i = 1; i <= 999; i++) {
	    birler = i % 10;
	    onlar = ((i - birler) % 100) / 10;
	    yuzler = ((i - onlar * 10 - birler) % 1000) / 100;
	    // System.out.println("sayi = " + i + "yüzler = " + yuzler + "onlar = " + onlar
	    // + "birler = " + birler);
	    if (birler + onlar + yuzler == birler * onlar * yuzler) {
		System.out.println(i);
	    }
	}
    }
}