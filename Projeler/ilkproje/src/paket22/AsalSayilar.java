package paket22;

public class AsalSayilar {

    public static void main(String[] args) {
	AsalSayilar sinif = new AsalSayilar();
	for (int i = 2; i < 100; i++) {
	    if (sinif.asalMi(i)) {
		System.out.println(i);
	    }
	}
    }

    public boolean asalMi(int sayi) {
	for (int i = 2; i < sayi - 1; i++) {
	    if (sayi % i == 0) {
		// sayi tam bolunuyor. Asal deðil
		return false;
	    }
	}
	// sayi asaldir.
	return true;
    }

}
