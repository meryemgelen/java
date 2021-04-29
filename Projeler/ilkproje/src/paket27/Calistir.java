package paket27;

public class Calistir {

    public static void main(String[] args) {
	int[] sayilar = new int[5];
	sayilar[0] = 5;
	sayilar[2] = 5;
	for (int i = 0; i < 5; i++) {
	    System.out.println((i + 1) + ".sayi " + sayilar[i]);
	}
	System.out.println("-------------------------------------");

	for (int b : sayilar) {
	    System.out.println(b);
	}
    }
}