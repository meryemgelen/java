package ornek1;

public class Calistir {

    public static void main(String[] args) {
	int sayi1 = 4;
	int sayi2 = 0;
	try {
	    int sayi3 = sayi1 / sayi2;
	    System.out.println(sayi3);
	} catch (ArithmeticException e) {
	    // TODO: handle exception
	    System.out.println("hata oluþtu,");
	}
	System.out.println("bitti");

    }

}
