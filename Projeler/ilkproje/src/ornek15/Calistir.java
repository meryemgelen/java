package ornek15;

public class Calistir {

    public static void main(String[] args) {
	Motosiklet m = new Motosiklet();
	Arac a = m;
	m.setHiz(100);

	System.out.println(m.getHiz());
	m.hiziArttir();
	a.hiziArttir();
    }

}
