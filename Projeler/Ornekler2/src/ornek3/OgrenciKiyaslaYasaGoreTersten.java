package ornek3;

public class OgrenciKiyaslaYasaGoreTersten implements Kiyaslayici {

    @Override
    public int kiyasla(Object o1, Object o2) {
	// TODO Auto-generated method stub
	Ogrenci ogrenci1 = (Ogrenci) o1;
	Ogrenci ogrenci2 = (Ogrenci) o2;

	if (ogrenci1.getYas() > ogrenci2.getYas()) {
	    return -1;
	} else if (ogrenci1.getYas() < ogrenci2.getYas()) {
	    return 1;
	} else {
	    return 0;
	}

    }
}
