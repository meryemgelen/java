package ornek1;

import java.util.List;
import java.util.Vector;

public class Liste2 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<String> liste2 = new Vector<String>();
	liste2.add("Kezban");
	liste2.add("Mehmet");
	System.out.println(liste2.get(0).length());
	System.out.println("------------------------------");
	listeyiYaz(liste2);

    }

    private static void listeyiYaz(List<String> liste2) {
	for (String s : liste2) {
	    System.out.println(s);
	}
    }

}
