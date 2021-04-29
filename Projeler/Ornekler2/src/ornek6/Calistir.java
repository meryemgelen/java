package ornek6;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

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

	Arrays.sort(ogrenciler, new Comparator<Ogrenci>() {

	    @Override
	    public int compare(Ogrenci o1, Ogrenci o2) {
		// TODO Auto-generated method stub
		if (o1.getYas() > o2.getYas()) {
		    return 1;
		} else if (o1.getYas() < o2.getYas()) {
		    return -1;
		}
		return 0;
	    }

	});

	for (Ogrenci ogrenci : ogrenciler) {
	    System.out.println(ogrenci);
	}
	System.out.println("------------------------------------------------");
	Masa[] masalar = new Masa[4];
	masalar[0] = new Masa(2, "Kahverengi");
	masalar[1] = new Masa(1, "Kýrmýzý");
	masalar[2] = new Masa(3, "Yeþil");
	masalar[3] = new Masa(2, "Mavi");

	Arrays.sort(masalar, new Comparator<Masa>() {

	    @Override
	    public int compare(Masa o1, Masa o2) {
		// TODO Auto-generated method stub
		return new Integer(o1.getAgirlik()).compareTo(o2.getAgirlik());

	    }
	});
	for (Masa masa : masalar) {
	    System.out.println(masa);
	}

	System.out.println("---------------------------------------------");

	Arrays.sort(ogrenciler, new Comparator<Ogrenci>() {
	    @Override
	    public int compare(Ogrenci o1, Ogrenci o2) {
		// TODO Auto-generated method stub
		Collator c = Collator.getInstance(new Locale("TR"));
		return c.compare(o1.getAdi(), o2.getAdi());
	    }
	});

	for (Ogrenci ogrenci : ogrenciler) {
	    System.out.println(ogrenci);
	}

    }

}