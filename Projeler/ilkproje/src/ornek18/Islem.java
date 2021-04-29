package ornek18;

public class Islem {
    private Tahmin tahmin;
    private int tahminAdedi;

    public void birSayiTut() {
	tahmin = new Tahmin();
	tahminAdedi = 0;
    }

    public TahminSonuclarý tahmindeBulun(int tahminEdilen) {
	tahminAdedi++;

	int tutulan = tahmin.getTutulanSayi();
	if (tahminEdilen > tutulan) {
	    return TahminSonuclarý.TAHMIN_BUYUK;
	} else if (tahminEdilen < tutulan) {
	    return TahminSonuclarý.TAHMIN_KUCUK;
	} else {
	    return TahminSonuclarý.DOGRU_TAHMIN;
	}
    }

    public int getTahminAdedi() {
	return tahminAdedi;
    }

}
