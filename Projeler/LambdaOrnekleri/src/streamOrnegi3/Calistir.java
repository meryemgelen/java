package streamOrnegi3;

import java.util.Arrays;
import java.util.List;;

public class Calistir {
    public static void main(String[] args) {

	List<Insan> insanlar = Arrays.asList(new Insan("Muharrem", "Uzun", 45), new Insan("Kamuran", "Akkor", 80),
		new Insan("Levent", "Guren", 41), new Insan("Doða", "Kavak", 14), new Insan("Baha", "Arbak", 49));
	insanlar.stream().sorted((i1, i2) -> i1.getAdi().compareTo(i2.getAdi())).forEach(System.out::println);
    }
}
