package siralama2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Calistir {

    public static void main(String[] args) {
	int[] sayilar = { 2, 8, 5, 1 };
	Arrays.sort(sayilar);
	for (int i : sayilar) {
	    System.out.println(i);
	}

	String[] isimler = { "Ali", "Zeynep", "Baha", "Deniz", "Ceylan" };
	Arrays.sort(isimler);
	for (String string : isimler) {
	    System.out.println(string);
	}

	List<Integer> sayilar2 = new ArrayList<Integer>();
	// List<Integer> sayilar2 = Arrays.asList(new Integer[] { 2, 3, 8, 5, 1 });
	sayilar2.add(2);
	sayilar2.add(3);
	sayilar2.add(8);
	sayilar2.add(5);
	sayilar2.add(1);
	Collections.sort(sayilar2);
	for (Integer i : sayilar2) {
	    System.out.println(i);
	}

	Collections.sort(sayilar2, new Comparator<Integer>() {
	    @Override
	    public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	    }
	});
	System.out.println("---------------------------------");
	for (Integer i : sayilar2) {
	    System.out.println(i);
	}

    }

}
