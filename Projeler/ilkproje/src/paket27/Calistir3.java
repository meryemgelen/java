package paket27;

public class Calistir3 {

    public static void main(String[] args) {
	String[] sehirler = new String[3];
	sehirler[0] = "Ankara";
	sehirler[1] = "Ýstanbul";
	for (String sehir : sehirler) {
	    System.out.println(sehir);
	}
	System.out.println("-------------------------");
	String[] sehirler2 = { "Ankara", "Ýstanbul", null };
	for (String sehir : sehirler2) {
	    System.out.println(sehir);
	}

    }
}