package ornek8;

import java.util.Scanner;

public class Calistir {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
	System.out.println("LUTFEN ADINIZI GÝRÝNÝZ = ");
	String ad = scn.next();
	for (int i = ad.length() - 1; i >= 0; i--) {
	    System.out.print(ad.charAt(i));
	}
	System.out.println("----------------------");
	System.out.println(new StringBuilder(ad).reverse().toString());

    }

}
