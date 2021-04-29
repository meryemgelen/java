package streamOrnegi1;

import java.util.Arrays;

public class Calistir {

    public static void main(String[] args) {
	// stream = Array list gibi kavramlar üzerinde kolay iþlemler yapmaya yarýyor
	int[] sayilar = { 2, 3, 6, 8 };
	Arrays.stream(sayilar).parallel().filter(i -> i % 2 == 0).forEach(c -> System.out.println(c));
    }

}
