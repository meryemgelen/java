package ornek1;

public class Calistir4 {

    public static void main(String[] args) {
	System.out.println("Program baþladý");
	try {
	    test(0);
	} catch (Exception e) {

	    System.out.println("hata oluþtu : " + e.getMessage());
	}
	System.out.println("Program bitti");
    }

    private static void test(int sayi) throws Exception {
	if (sayi == 0) {
	    // hatalý durum
	    Exception e = new Exception("Sýfýr gönderilemez");
	    throw e;
	} else {
	    System.out.println(sayi);
	}
    }

}
