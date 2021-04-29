package hgm.gov.util;

import java.util.ArrayList;
import java.util.List;

public class StreamOrnegi {
	public static void main(String[] args) {
		List<String> isimler = new ArrayList<String>();
		isimler.add("Ahmet");
		isimler.add("Ayşe");
		isimler.add("Aslı");
		isimler.add("Kamuran");
		isimler.add("Kazım");
		isimler.add("Abdulmuttalip");
		isimler.add("Su");
		long kayitSayisi = isimler.stream().map(String::toUpperCase).filter(StreamOrnegi::filtrele).map(StreamOrnegi::uzunluk).filter(x -> x > 8).count();
		System.out.println("Sonuc: " + kayitSayisi);
	}

	public static boolean filtrele(String isim) {
		System.out.println("Filtrele metoduna gelen isim: " + isim);
		return isim.length() > 5;
	}

	public static int uzunluk(String isim) {
		System.out.println("uzunluk metoduna gelen isim: " + isim);
		return isim.length();
	}
}