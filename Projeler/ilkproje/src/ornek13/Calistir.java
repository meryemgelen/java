package ornek13;

public class Calistir {

    public static void main(String[] args) {
	Integer sayi1 = new Integer(3);
	Integer sayi2 = new Integer(5);
	Integer sayi3 = new Integer(sayi1.intValue() + sayi2.intValue());
	System.out.println(sayi3.intValue());

	sayi1 = 3;
	sayi2 = 5;
	sayi3 = sayi1 + sayi2;
	System.out.println(sayi3);

    }

}