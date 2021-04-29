package ornek4;

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
	
	Arrays.sort(ogrenciler)

	for (Ogrenci ogrenci : ogrenciler) {
	    System.out.println(ogrenci);
	}

	Masa[] masalar = new Masa[4];
	masalar[0] = new Masa(2, "Kahverengi");
	masalar[1] = new Masa(1, "Kýrmýzý");
	masalar[2] = new Masa(3, "Yeþil");
	masalar[3] = new Masa(2, "Mavi");
	sirala(masalar, new Kiyaslayici() {
	    @Override
	    public int kiyasla(Object o1, Object o2) {
		Masa masa1 = (Masa) o1;
		Masa masa2 = (Masa) o2;
		if (masa1.getAgirlik() < masa2.getAgirlik()) {
		    return -1;
		} else if (masa1.getAgirlik() > masa2.getAgirlik()) {
		    return 1;
		}
		return 0;
	    }
	});
	for (Masa masa : masalar) {
	    System.out.println(masa);
	}

	sirala(ogrenciler, new Kiyaslayici() {
	    @Override
	    public int kiyasla(Object o1, Object o2) {
		Ogrenci ogrenci1 = (Ogrenci) o1;
		Ogrenci ogrenci2 = (Ogrenci) o2;
		if (ogrenci1.getYas() < ogrenci2.getYas()) {
		    return 1;
		} else if (ogrenci1.getYas() > ogrenci2.getYas()) {
		    return -1;
		}
		return 0;
	    }
	});
	for (Ogrenci ogrenci : ogrenciler) {
	    System.out.println(ogrenci);
	}
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
