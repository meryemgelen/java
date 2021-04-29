package ornek3;

public class Calistir {

    public static void main(String[] args) {
	try {
	    System.out.println(1);
	    test(2);
	    System.out.println(4);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }

    private static void test(int i) {
	try {
	    System.out.println(i++ + 1);
	    if (i == 2) {
		throw new RuntimeException(String.valueOf(i * 2));
	    }
	    System.out.println(5);
	} catch (Exception e) {
	    throw e;
	}
    }

}
