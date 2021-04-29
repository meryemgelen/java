package paket24;

public class Calistir {

    public static void main(String[] args) {
	Bilgisayar bilgisayar = new Bilgisayar();
	bilgisayar.ram = 16;
	bilgisayar.marka = "acer";

	Bilgisayar bilgisayar2 = new Bilgisayar();
	bilgisayar2.ram = 32;
	bilgisayar2.marka = "hp";

	System.out.println(bilgisayar.ram);
	System.out.println("acer".equals(bilgisayar.marka));

	System.out.println(bilgisayar2.ram);
	System.out.println(bilgisayar2.marka);
    }
}