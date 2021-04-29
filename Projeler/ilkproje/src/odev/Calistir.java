package odev;

import java.util.Scanner;

public class Calistir {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("bir sayi giriniz:");
	int girilensayi = scanner.nextInt();
	for (int i = 1; i <= girilensayi; i++) {
	    for (int j = girilensayi - i; j > 0; j--) {
		System.out.print(" ");
	    }
	    for (int k = 0; k < i; k++) {
		System.out.print("*");
	    }
	    System.out.println();
	}
    }

}