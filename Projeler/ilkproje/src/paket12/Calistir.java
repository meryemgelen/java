package paket12;

public class Calistir {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Bilgisayar.marka = "Asus";
	Bilgisayar.markaYaz();
	Bilgisayar bilgisayar = new Bilgisayar();
	bilgisayar.bellekMiktari = 100;

	Bilgisayar bilgisayar2 = new Bilgisayar();
	bilgisayar2.bellekMiktari = 1001;
	bilgisayar.bilgileriYaz();

	System.out.println("----------------------------");

	bilgisayar2.marka = "acer";
	bilgisayar.bilgileriYaz();
    }

}
