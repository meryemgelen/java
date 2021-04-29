package ornek1;

import java.util.HashMap;
import java.util.Map;

public class Harita {
    public static void main(String[] args) {
	Map<Integer, String> sehirler = new HashMap<Integer, String>();
	sehirler.put(1, "Adana");
	sehirler.put(63, "Urfa");
	sehirler.put(6, "Ankara");

	System.out.println(sehirler.get(63));
    }
}
