package paket13;

public class Calistir3 {

    public static void main(String[] args) {
	int sayi = 1;
	int onceki = 0;
	int toplam = 0;
	int adet = 0;
	System.out.println(onceki);
	System.out.println(sayi);
	while (onceki + sayi < 1000) {
	    toplam = onceki + sayi;
	    onceki = sayi;
	    sayi = toplam;
	    adet++;
	    System.out.println(toplam);
	}
	System.out.println("bulunan sayý adedi = " + adet);
    }

}
