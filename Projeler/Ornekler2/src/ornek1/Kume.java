package ornek1;

import java.util.HashSet;
import java.util.Iterator;

public class Kume {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	HashSet<String> sepet = new HashSet<String>();
	sepet.add("ayakkabý");
	sepet.add("yumurta");
	sepet.add("Vantilator");

	Iterator<String> itr = sepet.iterator();
	while (itr.hasNext()) {
	    String urun = itr.next();
	    System.out.println(urun);
	}

	System.out.println("------------------");
	for (String urun : sepet) {
	    System.out.println(urun);
	}

    }
}
