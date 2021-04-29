package ornek5;

public class Sayac extends Thread {
    private static int deger = 0;
    private String adi;

    public Sayac(String adi) {
	this.adi = adi;
    }

    @Override
    public void run() {
	for (int i = 0; i < 10; i++) {
	    degerArttir(adi);
	    bekle(5);
	}
    }

    private static synchronized void degerArttir(String adi) {
	int s = deger;
	bekle(100);
	deger = s + 1;
	System.out.format("%s Deger %s oldu %n", adi, deger);
    }

    private static void bekle(long ms) {
	try {
	    Thread.sleep(ms);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

}
