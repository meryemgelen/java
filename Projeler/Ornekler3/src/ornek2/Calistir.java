package ornek2;

public class Calistir {
    public static void main(String[] args) {
	try {
	    int sonuc = hesapla(3, 0);
	    System.out.println(sonuc);
	} catch (BolmeHatasi e) {
	    // TODO: handle exception
	    System.out.println("Hata oluþtu.Kod = " + e.getHataKode());
	}
    }

    private static int hesapla(int i, int j) throws BolmeHatasi {
	if (j == 0) {
	    // kendi hata sýnýfýmý kullanmak istiyorum
	    BolmeHatasi hata = new BolmeHatasi();
	    hata.setHataKode(101);
	    throw hata;
	}
	return i / j;
    }

}
