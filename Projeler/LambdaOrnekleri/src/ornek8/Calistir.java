package ornek8;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Calistir {

    public static void main(String[] args) {
	Supplier<Object> f = () -> 5;
	Consumer<Object> c = x -> System.out.println((Integer) f.get() + (Integer) x);
	c.accept(3);
    }

}
