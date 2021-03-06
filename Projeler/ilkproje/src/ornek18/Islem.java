package ornek18;

public class Islem {
    private Tahmin tahmin;
    private int tahminAdedi;

    public void birSayiTut() {
	tahmin = new Tahmin();
	tahminAdedi = 0;
    }

    public TahminSonuclarę tahmindeBulun(int tahminEdilen) {
	tahminAdedi++;

	int tutulan = tahmin.getTutulanSayi();
	if (tahminEdilen > tutulan) {
	    return TahminSonuclarę.TAHMIN_BUYUK;
	} else if (tahminEdilen < tutulan) {
	    return TahminSonuclarę.TAHMIN_KUCUK;
	} else {
	    return TahminSonuclarę.DOGRU_TAHMIN;
	}
    }

    public int getTahminAdedi() {
	return tahminAdedi;
    }

}
