package ornek4;

import java.util.Random;
import java.util.Scanner;

public class Calistir {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Random r = new Random();
	int tutulanDeger = r.nextInt(9000) + 1000;
	System.out.println(tutulanDeger);
	Scanner scn = new Scanner(System.in);
	System.out.println("Lütfen 4 haneli bir sayi giriniz = ");
	int girilenDeger = scn.nextInt();
	int[] tutulanlar = new int[5];
	int[] girilenler = new int[5];

	tutulanlar[0] = tutulanDeger / 1000;
	tutulanlar[1] = (tutulanDeger % 1000) / 100;
	tutulanlar[2] = ((tutulanDeger % 1000) % 100) / 10;
	tutulanlar[3] = ((tutulanDeger % 1000) % 100) % 10;

	girilenler[0] = girilenDeger / 1000;
	girilenler[1] = (girilenDeger % 1000) / 100;
	girilenler[2] = ((girilenDeger % 1000) % 100) / 10;
	girilenler[3] = ((girilenDeger % 1000) % 100) % 10;

	for (Integer i : girilenler) {
	    System.out.print(i + "-");
	}
	int ayniDeger = 0;
	int yeriFarkli = 0;
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 4; j++) {
		if (girilenler[i] == tutulanlar[j]) {
		    ayniDeger++;
		}
	    }
	}

//	System.out.println("binler = " + binler);
//	System.out.println("yuzler = " + yuzler);
//	System.out.println("onlar = " + onlar);
//	System.out.println("Birler = " + birler);
    }

}
