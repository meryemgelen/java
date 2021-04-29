package ornek14;

public class Calistir {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Arac arac = new Arac();
	arac.hiz = 30;
	Araba araba = new Araba();
	araba.hiz = 50;
	Arac arac2 = new Araba();
	arac2.hiz = 80;
	Motosiklet m = new Motosiklet();
	m.hiz = 100;
	m.hiziArttir();
	System.out.println(m);
    }

}
