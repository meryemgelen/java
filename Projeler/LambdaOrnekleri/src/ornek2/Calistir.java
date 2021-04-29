package ornek2;

public class Calistir {

    public static void main(String[] args) {
	System.out.println(islemYap(10, 20, new Islem() {
	    @Override
	    public int islemYap(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	    }
	}));
	System.out.println(islemYap(10, 20, new Islem() {
	    @Override
	    public int islemYap(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	    }
	}));
    }

    public static int islemYap(int s1, int s2, Islem islem) {
	return islem.islemYap(s1, s2);
    }

}
