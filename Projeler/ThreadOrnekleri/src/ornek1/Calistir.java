package ornek1;

public class Calistir {

    public static void main(String[] args) {
	Sayac sayac = new Sayac();
	Sayac sayac2 = new Sayac();
	sayac.start();
	System.out.println("1.thread oluşturuldu");
	sayac2.start();
	System.out.println("2.thread oluşturuldu");
    }

}
