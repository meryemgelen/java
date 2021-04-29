package paket1;

public class Test6 {
    public static void main(String[] args) {
	int a = 10;
	while (a > 0) {
	    System.out.println(a--);
	}
	System.out.println("-----------------------");
	do {
	    System.out.println(a++);
	} while (a < 6);
	System.out.println("-----------------------");

    }
}
