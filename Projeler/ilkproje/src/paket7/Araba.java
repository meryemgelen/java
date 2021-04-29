package paket7;

public class Araba {
    Motor motor;
    Lastik[] lastikler;

    public static void main(String[] args) {
	Araba araba1 = new Araba();
	araba1.motor = new Motor();
	araba1.motor.hacim = 2000;

	araba1.lastikler = new Lastik[4];
	araba1.lastikler[0] = new Lastik();
	araba1.lastikler[1] = new Lastik();
	araba1.lastikler[2] = new Lastik();
	araba1.lastikler[3] = new Lastik();

	araba1.lastikler[0].genislik = 180;
	araba1.lastikler[1].genislik = 180;
	araba1.lastikler[2].genislik = 180;
	araba1.lastikler[3].genislik = 180;

    }
}
