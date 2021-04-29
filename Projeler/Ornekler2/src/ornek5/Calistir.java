package ornek5;

import java.util.Arrays;

public class Calistir {
    public static void main(String[] args) {
	Ogrenci[] ogrenciler = new Ogrenci[7];
	ogrenciler[0] = new Ogrenci("Þazument", 23);
	ogrenciler[1] = new Ogrenci("Kunter", 45);
	ogrenciler[2] = new Ogrenci("Viþne", 33);
	ogrenciler[3] = new Ogrenci("Kiraz", 35);
	ogrenciler[4] = new Ogrenci("Kamile", 28);
	ogrenciler[5] = new Ogrenci("Erkut", 23);
	ogrenciler[6] = new Ogrenci("Tutku", 43);

	Arrays.sort(ogrenciler); // quicksort ile yaptý daha hýzlý

	for (Ogrenci ogrenci : ogrenciler) {
	    System.out.println(ogrenci);
	}

	Masa[] masalar = new Masa[4];
	masalar[0] = new Masa(2, "Kahverengi");
	masalar[1] = new Masa(1, "Kýrmýzý");
	masalar[2] = new Masa(3, "Yeþil");
	masalar[3] = new Masa(2, "Mavi");
	Arrays.sort(masalar);
	for (Masa masa : masalar) {
	    System.out.println(masa);
	}

    }

}