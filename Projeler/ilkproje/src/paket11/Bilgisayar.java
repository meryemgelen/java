package paket11;

public class Bilgisayar {
    static String marka;
    int bellekMiktari;

    public String toString() {
	// String sonuc = "Marka";
	/// sonuc = sonuc + marka + ", bellek miktarý = " + bellekMiktari;
	// return sonuc;

	StringBuilder sb = new StringBuilder();
	sb.append("marka : ");
	sb.append(marka);
	sb.append(", bellek miktarý = ");
	sb.append(bellekMiktari);
	return sb.toString();
    }

    static void markaYaz() {
	System.out.println(marka);
    }

}
