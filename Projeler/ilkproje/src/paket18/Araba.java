package paket18;

public class Araba {
    static String marka;
    static {
	System.out.println(1);
	marka = "5";
    }

    Araba() {
	System.out.println(2);
	System.out.println(marka);
	marka = "4";
    }
}
