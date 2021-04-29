package ornek7;

import java.util.Arrays;
import java.util.List;;

public class Calistir {
    public static void main(String[] args) {

	List<Insan> insanlar = Arrays.asList(new Insan("Muharrem", "Uzun", 45), new Insan("Kamuran", "Akkor", 80),
		new Insan("Levent", "Guren", 41), new Insan("Doða", "Kavak", 14), new Insan("Baha", "Arbak", 49));

	insanlar.stream().filter(i -> i.getSoyadi().startsWith("A")).map(i -> i.getYasi()).forEach(System.out::println);
	System.out.println("-------------------------------");
	insanlar.stream().forEach(Insan::getYasi);
    }
}
