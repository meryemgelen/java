package ornek3;

public class Calistir5 {
    public static void main(String[] args) {
	try {
	    test(1);
	    System.out.println(9);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }

    private static void test(int i) throws Exception {
	try {
	    if (i == 1) {
		throw new ArithmeticException("4");
	    }
	    System.out.println(2);
	} catch (NullPointerException e) {
	    System.out.println(e.getMessage());
	} finally {
	    System.out.println(7);
	}
	System.out.println(8);
    }

}
