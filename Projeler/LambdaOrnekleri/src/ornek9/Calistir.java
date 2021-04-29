package ornek9;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Calistir {

    public static void main(String[] args) {
	List<Integer> sayilar1 = Arrays.asList(1, 2, 5);
	List<Integer> sayilar2 = Arrays.asList(2, 3, 8);
	hesapla(sayilar1, sayilar2, (a, b) -> System.out.println(a + b));
    }

    private static void hesapla(List<Integer> sayilar1, List<Integer> sayilar2, BiConsumer<Integer, Integer> c) {
	for (int i = 0; i < sayilar1.size(); i++) {
	    c.accept(sayilar1.get(i), sayilar2.get(i));
	}
    }

}
