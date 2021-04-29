package ornek4;

import java.util.Arrays;
import java.util.List;

public class Calistir {

    public static void main(String[] args) {

	List<Insan> insanlar = Arrays.asList(new Insan("Muharrem", "Uzun", 45), new Insan("Kamuran", "Akkor", 80),
		new Insan("Levent", "Guren", 41), new Insan("Doða", "Kavak", 14), new Insan("Baha", "Arbak", 49));

	// 1-butun adlarý ekran bas
	for (int i = 0; i < insanlar.size(); i++) {
	    System.out.println(insanlar.get(i));
	}
	System.out.println("-------------------------------------------");
	for (Insan insan : insanlar) {
	    System.out.println(insan);
	}
	System.out.println("-------------------------------------------");

	insanlar.forEach(System.out::println);
	System.out.println("-------------------------------------------");

	// 2- soyadarý A ile baþlayan insanlarý ekrana bas
	insanlariYaz(insanlar);

	// 3- ismi F harfi ve daha önce harf ile baþlayan insanlarýn yaþlarýný ekrana
	// bas
    }

    private static void insanlariYaz(List<Insan> insanlar) {
	for (Insan insan : insanlar)
	    if (insan.getSoyadi().startsWith("A")) {
		System.out.println(insan);
	    }
    }

}
