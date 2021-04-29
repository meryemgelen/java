package ornek8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Calistir2_2 {
    public static class myFunction implements Function<Integer, Integer> {
	@Override
	public Integer apply(Integer t) {
	    return t + 5;
	}
    }

    public static void main(String[] args) {
	List<Integer> sayilar = Arrays.asList(2, 3, 5, 1, 8);
	hesapla(sayilar, new myFunction(), System.out::println);
    }

    private static void hesapla(List<Integer> sayilar, Function<Integer, Integer> f, Consumer<Integer> c) {
	for (Integer i : sayilar) {
	    c.accept(f.apply(i));
	}
    }

}
