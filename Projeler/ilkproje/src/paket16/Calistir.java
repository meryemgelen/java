package paket16;

public class Calistir {

    public static void main(String[] args) {
	Ucak[] ucaklar = { new Ucak("TR-DGV06", "Hamiyet"), new Ucak("TR-AGA65", "ilhan"),
		new Ucak("TR-UC314", "Kamuran") };

	for (int i = 0; i < ucaklar.length; i++) {
	    System.out.println("kuyruk no = " + ucaklar[i].kuyrukNo + "   Pilot = " + ucaklar[i].pilotAdi);
	}
	for (Ucak ucak : ucaklar) {
	    System.out.println(ucak.pilotAdi);
	}

	System.out.println("-----------------------");
	for (Ucak ucak : ucaklar) {
	    System.out.println(ucak);
	}
    }

}
