package paket29;

import java.util.Scanner;

public class Calistir {

    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in);) {
	    int girilensayi, toplamsayi = 0, toplam = 0;
	    do {
		System.out.println("bir sayi giriniz:(bitirmek için 0 giriniz)");
		girilensayi = scanner.nextInt();
		if (girilensayi != 0) {
		    toplamsayi++;
		    toplam += girilensayi;
		}
	    } while (girilensayi != 0);
	    System.out.println("Ortalama = " + toplam / (double) toplamsayi);
	}

    }

}