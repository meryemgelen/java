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
		System.out.println(TahminSonucları.DOGRU_TAHMIN.ordinal());
		islem.birSayiTut();
		System.out.println("bir sayı tuttum . Bilmeye çalış bakalım");
		TahminSonucları durum;
		do {
		    System.out.println("tahmininiz : ");
		    int tahmin = scn.nextInt();
		    durum = islem.tahmindeBulun(tahmin);
		    if (durum == TahminSonucları.TAHMIN_BUYUK) {
			System.out.println("tamnininizi azaltın");
		    } else if (durum == TahminSonucları.TAHMIN_KUCUK) {
			System.out.println("tahmininizi artırın");
		    } else {
			System.out.println("tebrikler " + islem.getTahminAdedi() + " defada bildiniz");
		    }
		} while (durum != TahminSonucları.DOGRU_TAHMIN);
	    }
	}
    }

}
