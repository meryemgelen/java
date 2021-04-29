package ornek1;

public class Calistir3 {

    public static void main(String[] args) {
	System.out.println("Program baþladý");
	try {

	    for (int i = 0; i < 10; i++) {
		System.out.println(i);
		bekle(500);
	    }
	} catch (ArithmeticException | InterruptedException e) {
	    System.out.println("hata oluþtu");
	}
	System.out.println("Program bitti");
    }

    private static void bekle(long ms) throws InterruptedException {
	Thread.sleep(ms);
	int a = 3 / 0;
    }

}
