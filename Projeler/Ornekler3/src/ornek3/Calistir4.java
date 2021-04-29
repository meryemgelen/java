package ornek3;

public class Calistir4 {
    public static void main(String[] args) {
	try {
	    test(1);
	    System.out.println(7);
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
		// throw new RuntimeException("ne güzel bir gün");
	    }
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	} finally {
	    System.out.println(8);
	}
    }

}
