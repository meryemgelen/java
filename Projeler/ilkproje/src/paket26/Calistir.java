package paket26;

public class Calistir {

    public static void main(String[] args) {
	Bilgisayar bilgisayar = new Bilgisayar(64);
	System.out.println(bilgisayar.ram);
	System.out.println(new Bilgisayar(128).ram);
    }
}