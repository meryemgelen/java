package ornek2;

public class Sayac implements Runnable {
    @Override
    public void run() {
	for (int i = 1; i <= 10; i++) {
	    System.out.println(i);
	    bekle(100);
	}
    }

    public static void bekle(long ms) {
	try {
	    Thread.sleep(ms);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

}
