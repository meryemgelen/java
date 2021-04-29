package sayi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calistir {

	public static void main(String[] args) {
		Tahmin tahmin = new Tahmin();
		TahminSonucu sonuc = null;
		int tahminAdedi;
		try (Scanner scanner = new Scanner(System.in)) {
			tahmin.yeniSayiTut();
			tahminAdedi = 0;
			System.out.println("Bir sayý tuttum.");
			do {
				System.out.println("Tahmininiz:");
				try {
					int tahminSayisi = scanner.nextInt();
					tahminAdedi++;
					sonuc = tahmin.tahminiKontrolEt(tahminSayisi);
					if (sonuc.isHataliTahmin()) {
						System.out.println("Hatalý tahminde bulundunuz. Yeniden tahmin ediniz.");
					} else {
						System.out.format("Doðru basamak sayýsý: %s, Yanlýþ basamak sayýsý: %s%n", sonuc.getDogruBasamak(), sonuc.getYanlisBasamak());
						if (sonuc.getDogruBasamak() == 4) {
							System.out.format("Tebrikler, %s defada bildiniz..", tahminAdedi);
						}
					}
				} catch (InputMismatchException e) {
					System.out.println("Lütfen tamsayý giriniz.");
					// giriþ tamponunu temizle
					scanner.nextLine();
					sonuc = new TahminSonucu();
				}
			} while (sonuc.getDogruBasamak() != 4);
		}

	}

}
