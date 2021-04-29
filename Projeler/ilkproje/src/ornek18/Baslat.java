package ornek18;

import java.util.Scanner;

public class Baslat {
    private Islem islem = new Islem();

    public static void main(String[] args) {
	new Baslat().oyunBaslat();
    }

    private void oyunBaslat() {
	try (Scanner scn = new Scanner(System.in)) {
	    while (true) {
		System.out.println(TahminSonuclarý.DOGRU_TAHMIN.ordinal());
		islem.birSayiTut();
		System.out.println("bir sayý tuttum . Bilmeye çalýþ bakalým");
		TahminSonuclarý durum;
		do {
		    System.out.println("tahmininiz : ");
		    int tahmin = scn.nextInt();
		    durum = islem.tahmindeBulun(tahmin);
		    if (durum == TahminSonuclarý.TAHMIN_BUYUK) {
			System.out.println("tamnininizi azaltýn");
		    } else if (durum == TahminSonuclarý.TAHMIN_KUCUK) {
			System.out.println("tahmininizi artýrýn");
		    } else {
			System.out.println("tebrikler " + islem.getTahminAdedi() + " defada bildiniz");
		    }
		} while (durum != TahminSonuclarý.DOGRU_TAHMIN);
	    }
	}
    }

}
