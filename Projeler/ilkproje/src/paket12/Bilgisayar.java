package paket12;

public class Bilgisayar {
    static String marka;
    int bellekMiktari;

    void bilgileriYaz() {
	markaYaz();
	System.out.println(bellekMiktari);
    }

    static void markaYaz() {
	System.out.println(marka);
    }

}
