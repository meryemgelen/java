package paket28;

public class Calistir {

    public static void main(String[] args) {
	test();
	test(10);
	test("merhaba");
	test((Calistir) null);
    }

    public static void test() {
	System.out.println("1");
    }

    public static void test(int a) {
	System.out.println("2");
    }

    public static void test(String adi) {
	System.out.println("3");
    }

    public static void test(Calistir c) {
	System.out.println("4");
    }
}