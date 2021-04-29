package ornek1;

public class Sayac extends Thread {
    @Override
    public void run() {
	for (int i = 1; i <= 10; i++) {
	    System.out.println(i);
	    bekle(1000);
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
