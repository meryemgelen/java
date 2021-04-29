package ornek1;

import java.math.BigInteger;
import java.util.ArrayList;

public class Liste {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList liste = new ArrayList();
	liste.add(5);
	liste.add(6);
	liste.add("Ali");

	System.out.println(liste.get(0));
	int uzunluk = ((String) liste.get(2)).length();
	System.out.println(uzunluk);

	ArrayList<String> liste2 = new ArrayList<String>();
	liste2.add("Kezban");
	liste2.add("Mehmet");
	System.out.println(liste2.get(0).length());
	System.out.println("------------------------------");

	for (Object s : liste) {
	    System.out.println(s);
	}

	BigInteger sayi1 = new BigInteger("45437047630673420674072362364073246903274934863498734698348");
	BigInteger sayi2 = new BigInteger("87348437486743867436837463298463749682734694762309467469899");
	BigInteger sayi3 = sayi1.multiply(sayi2);
	System.out.println(sayi3.toString().length());
	System.out.println(sayi1.pow(5000).toString().length());

    }

}
