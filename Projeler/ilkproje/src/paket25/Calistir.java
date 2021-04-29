package paket25;

public class Calistir {

    public static void main(String[] args) {
	Bilgisayar bilgisayar = new Bilgisayar(8, "acer");

	Bilgisayar bilgisayar2 = new Bilgisayar(16, "hp");

	System.out.println(bilgisayar.ram);
	System.out.println("acer".equals(bilgisayar.marka));

	System.out.println(bilgisayar2.ram);
	System.out.println(bilgisayar2.marka);
    }
}