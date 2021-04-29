package paket13;

public class Calistir2 {

    public static void main(String[] args) {
	int sayi1 = 3, sayi2 = 4;
	if (sayi1 > sayi2) {
	    System.out.println("s1>s2");
	} else if (sayi1 < sayi2) {
	    System.out.println("s1<s2");
	} else {
	    System.out.println("s1 = s2");
	}

	if (sayi1 > sayi2) {
	    System.out.println("s1>s2");
	} else
	    for (int i = 0; i < 5; i++) {
		System.out.println(i);
	    }
    }

}
