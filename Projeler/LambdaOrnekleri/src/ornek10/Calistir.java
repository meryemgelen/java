package ornek10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Calistir {
    public static void main(String[] args) {
	List<Integer> sayilar1 = Arrays.asList(2, 8, 14);
	hesapla(sayilar1, 0, (a, b) -> {
	    try {
		return a / b;
	    } catch (ArithmeticException e) {
		System.out.println("Hata oluþtu");
		return 0;
	    }
	});
    }

    private static void hesapla(List<Integer> sayilar1, int sayi, BiFunction<Integer, Integer, Integer> c) {
	for (int i : sayilar1) {
	    System.out.println(c.apply(i, sayi));
	}
    }

}
