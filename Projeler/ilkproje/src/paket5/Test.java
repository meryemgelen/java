package paket5;

public class Test {

    public static void main(String[] args) {
	Sehir[] sehirler = new Sehir[2];
	sehirler[0] = new Sehir();
	sehirler[0].adi = "Ankara";
	sehirler[1] = new Sehir();
	sehirler[1] = sehirler[0];
	System.out.println(sehirler[0].adi);
	sehirler[1].adi = "istanbul";
	System.out.println(sehirler[0].adi);

    }

}
