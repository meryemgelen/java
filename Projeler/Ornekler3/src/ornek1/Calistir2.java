package ornek1;

public class Calistir2 {

    public static void main(String[] args) throws InterruptedException {
	System.out.println("Program baþladý");
	for (int i = 0; i < 10; i++) {
	    System.out.println(i);
	    bekle(500);

	}
	System.out.println("Program bitti");
    }

    private static void bekle(long ms) throws InterruptedException {
	Thread.sleep(ms);
    }

}
