package ornek7;

import java.util.Scanner;

public class Sayac implements Runnable {

    @Override
    public void run() {
	Scanner scn = new Scanner(System.in);
	System.out.println("Lütfen bir sayi giriniz = ");
	int girilenDeger = scn.nextInt();
	int toplam = 0;
	for (int i = 1; i <= girilenDeger; i++) {
	    toplam += i;
	}
	System.out.println("toplam = " + toplam);
    }
}
