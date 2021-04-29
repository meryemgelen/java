package ornek3;

public class Calistir {

    public static void main(String[] args) {

	System.out.println(islemYap(10, 60, (sayi1, sayi2) -> sayi1 + sayi2));
	System.out.println(islemYap(10, 60, (sayi1, sayi2) -> sayi1 - sayi2));
    }

    public static int islemYap(int s1, int s2, Islem islem) {
	return islem.islemYap(s1, s2);
    }

    public interface Islem {
	public int islemYap(int sayi1, int sayi2);
    }
}
