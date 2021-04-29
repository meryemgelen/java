package ornek4;

public class Calistir {

    public static void bekle(long ms) {
	try {
	    Thread.sleep(ms);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    public static void main(String[] args) {
	new Thread(() -> {
	    for (int i = 1; i <= 10; i++) {
		System.out.println(i);
		bekle(100);
	    }
	}).start();
	System.out.println("Program Sonu");
    }

}
