package ornek3;

public class Calistir {

    public static void main(String[] args) {
	System.out.println("----------------------------------------------------------------");
	Ogrenci[] ogrenciler = new Ogrenci[7];
	ogrenciler[0] = new Ogrenci("Þaziment", 23);
	ogrenciler[1] = new Ogrenci("Kunter", 63);
	ogrenciler[2] = new Ogrenci("Viþne", 102);
	ogrenciler[3] = new Ogrenci("kiraz", 35);
	ogrenciler[4] = new Ogrenci("Kamile", 28);
	ogrenciler[5] = new Ogrenci("Erkut", 24);
	ogrenciler[6] = new Ogrenci("Tutku", 43);

	sirala(ogrenciler, new OgrenciKiyaslaYasaGore()); // yaþa göre sýralanacak

	for (Ogrenci ogrenci : ogrenciler) {
	    System.out.println(ogrenci);
	}

	System.out.println("----------------------------------------------------------------");
	sirala(ogrenciler, new OgrenciKiyaslaYasaGoreTersten()); // yaþa göre testen sýralanacak

	for (Ogrenci ogrenci : ogrenciler) {
	    System.out.println(ogrenci);
	}
//
	System.out.println("-------------------------------------------------------------------");
	Masa[] masalar = new Masa[4];
	masalar[0] = new Masa(2, "Kahverengi");
	masalar[1] = new Masa(1, "Kýrmýzý");
	masalar[2] = new Masa(3, "Yeþil");
	masalar[3] = new Masa(2, "Mavi");

	sirala(masalar, new MasaKiyaslaAgirligaGore());
	for (Masa masa : masalar) {
	    System.out.println(masa);
	}

	System.out.println("-------------------------------------------------------------------");
//
//	Bilgisayar[] bilgisayar = new Bilgisayar[3];
//	bilgisayar[0] = new Bilgisayar(8);
//	bilgisayar[1] = new Bilgisayar(32);
//	bilgisayar[2] = new Bilgisayar(16);
//
//	sirala(bilgisayar);
//	for (Bilgisayar bilgisayar2 : bilgisayar) {
//	    System.out.println(bilgisayar2);
//	}

    }

    private static void sirala(Object[] liste, Kiyaslayici kiyaslayici) {
	for (int i = 0; i < liste.length; i++) {
	    for (int j = i + 1; j < liste.length; j++) {
		if (kiyaslayici.kiyasla(liste[i], liste[j]) > 0) {
		    Object temp = liste[i];
		    liste[i] = liste[j];
		    liste[j] = temp;
		}
	    }
	}
    }

}
