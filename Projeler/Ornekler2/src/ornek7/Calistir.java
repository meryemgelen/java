package ornek7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Calistir {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	try (Scanner scn = new Scanner(System.in)) {
	    List<Integer> sayilar = new ArrayList<Integer>();
	    int tahmin;
	    do {
		System.out.println("Bir sayi giriniz (0 olunca oyun bitiyor) : ");
		tahmin = scn.nextInt();
		if (tahmin != 0) {
		    // sayý diziye eklencek
		    sayilar.add(tahmin);
		} else {
		    // sýralama yapýlacak
		    Collections.sort(sayilar);
		    for (int i : sayilar) {
			System.out.println(i);
		    }
		}
	    } while (tahmin != 0);
	}
    }
}
