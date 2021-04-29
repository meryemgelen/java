package ornek6;

public class Sayac extends Thread {
    private static volatile int deger = 0;
    private String adi;
    private static Integer blokObjesi = new Integer(3);

    public Sayac(String adi) {
	this.adi = adi;
    }

    @Override
    public void run() {
	for (int i = 0; i < 10; i++) {
	    synchronized (blokObjesi) {
		int s = deger;
		bekle(100);
		deger = s + 1;
	    }
	    System.out.format("%s Deger %s oldu %n", adi, deger);
	}
    }

    private static void bekle(long ms) {
	try {
	    Thread.sleep(ms);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

}
