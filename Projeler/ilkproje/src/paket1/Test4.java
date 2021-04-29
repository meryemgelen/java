package paket1;

public class Test4 {
    public static void main(String[] args) {
	int a = 2, b = 3;
	int c = a++ * ++b + ++a * ++b;
	System.out.println("a=" + a + "b = " + b + "c = " + c);
	System.out.println(a + b++ + c);

    }
}
