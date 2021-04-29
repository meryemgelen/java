package ornek11;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Calistir {
    public static void main(String[] args) {
	hesapla((a, b) -> a / b, c -> System.out.println(c.apply(6, 3)));
    }

    private static void hesapla(BiFunction<Integer, Integer, Integer> f,
	    Consumer<BiFunction<Integer, Integer, Integer>> c) {
	c.accept(f);
    }

}
