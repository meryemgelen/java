package ornek2;

public class Calistir {

    public static void main(String[] args) {
	Sayac sayac = new Sayac();
	Sayac sayac2 = new Sayac();
	Thread t1 = new Thread(sayac);
	Thread t2 = new Thread(sayac2);
	t1.start();
	t2.start();
	System.out.println("Program Sonu");
    }

}
