package ornek1;

public class Calistir {

    public static void main(String[] args) {
	System.out.println(islemYap(10, 20, new ToplamaIslemi()));
	System.out.println(islemYap(10, 20, new CikartmaIslemi()));
    }

    public static int islemYap(int s1, int s2, Islem islem) {
	return islem.islemYap(s1, s2);
    }

}
