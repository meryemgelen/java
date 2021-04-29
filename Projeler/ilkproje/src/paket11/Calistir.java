package paket11;

public class Calistir {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Bilgisayar.marka = "Asus";

	Bilgisayar bilgisayar = new Bilgisayar();
	bilgisayar.bellekMiktari = 100;

	Bilgisayar bilgisayar2 = new Bilgisayar();
	bilgisayar2.bellekMiktari = 1001;

	System.out.println(bilgisayar);
	System.out.println(bilgisayar2);
    }

}
