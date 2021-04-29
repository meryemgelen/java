package ornek2;

public class Calistir {

    public static void main(String[] args) {

	Ogrenci[] ogrenciler = new Ogrenci[7];
	ogrenciler[0] = new Ogrenci("Þaziment", 23);
	ogrenciler[1] = new Ogrenci("Kunter", 63);
	ogrenciler[2] = new Ogrenci("Viþne", 102);
	ogrenciler[3] = new Ogrenci("kiraz", 35);
	ogrenciler[4] = new Ogrenci("Kamile", 28);
	ogrenciler[5] = new Ogrenci("Erkut", 23);
	ogrenciler[6] = new Ogrenci("Tutku", 43);

	sirala(ogrenciler); // yaþa göre sýralanacak

	for (Ogrenci ogrenci : ogrenciler) {
	    System.out.println(ogrenci);
	}

	sirala(ogrenciler); // ada göre sýralanacak

	for (Ogrenci ogrenci : ogrenciler) {
	    System.out.println(ogrenci);
	}

	Masa[] masalar = new Masa[4];
	masalar[0] = new Masa(2, "Kahverengi");
	masalar[1] = new Masa(1, "Kýrmýzý");
	masalar[2] = new Masa(3, "Yeþil");
	masalar[3] = new Masa(2, "Mavi");

	sirala(masalar);
	for (Masa masa : masalar) {
	    System.out.println(masa);
	}

	Bilgisayar[] bilgisayar = new Bilgisayar[3];
	bilgisayar[0] = new Bilgisayar(8);
	bilgisayar[1] = new Bilgisayar(32);
	bilgisayar[2] = new Bilgisayar(16);

	sirala(bilgisayar);
	for (Bilgisayar bilgisayar2 : bilgisayar) {
	    System.out.println(bilgisayar2);
	}

    }

    private static void sirala(Kiyaslanabilir[] liste) {
	for (int i = 0; i < liste.length; i++) {
	    for (int j = i + 1; j < liste.length; j++) {
		if (liste[i].kiyasla(liste[j]) > 0) {
		    Kiyaslanabilir temp = liste[i];
		    liste[i] = liste[j];
		    liste[j] = temp;
		}
	    }
	}
    }

}
