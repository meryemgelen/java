package ornek7;

public class Calistir {

    public static void main(String[] args) {
	Sayac s1 = new Sayac();
	Thread t1 = new Thread(s1);
	t1.start();
    }
}
