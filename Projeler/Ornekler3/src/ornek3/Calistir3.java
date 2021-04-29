package ornek3;

public class Calistir3 {
    public static void main(String[] args) {
	try {
	    try {
		test(1);
		System.out.println(4);
	    } finally {
		System.out.println(7);
	    }
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }

    private static void test(int i) throws Exception {
	try {
	    try {
		if (i == 1) {
		    throw new RuntimeException("Merhaba");
		}
	    } finally {
		System.out.println(15);
	    }
	    System.out.println(5);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    throw new Exception(e.getMessage() + " nasilsiniz");
	} finally {
	    System.out.println(8);
	}
    }

}
