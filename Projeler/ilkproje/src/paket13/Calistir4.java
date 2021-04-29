package paket13;

import java.util.Scanner;

public class Calistir4 {

    public static void main(String[] args) {
	int sayi;
	try (Scanner scanner = new Scanner(System.in)) {
	    System.out.print("Lütfen bir sayý giriniz = ");
	    sayi = scanner.nextInt();
	    StringBuilder str = new StringBuilder();
	    for (int i = 1; i <= sayi; i++) {
		str.delete(0, str.length());
		for (int j = 0; j < i; j++) {
		    str.append("*");
		}
		System.out.println(str.toString());
	    }
	}

    }

}
