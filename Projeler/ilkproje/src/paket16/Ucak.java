package paket16;

public class Ucak {
    String kuyrukNo;
    String pilotAdi;

    Ucak(String kuyrukNo, String pilotAdi) {
	// TODO Auto-generated constructor stub
	this.kuyrukNo = kuyrukNo;
	this.pilotAdi = pilotAdi;
    }

    public String toString() {
	return new StringBuilder("Kuyruk NO : ").append(kuyrukNo).append("  Pilot Adý:").append(pilotAdi).toString();
    }
}
