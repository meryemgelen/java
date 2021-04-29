package util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class Util {

	private static final ThreadLocal<List<Locale>> locales = new ThreadLocal<List<Locale>>();

	private Util() {
	}

	public static void init() {

	}

	public static String getDBProp(String key) {
		// dosya içindekileri okumaya yarýyor.
		return ResourceBundle.getBundle("db").getString(key);
	}

	public static String getMessage(String key, Locale locale) {
		return ResourceBundle.getBundle("mesaj", Util.locales.get().get(0)).getString(key);
	}

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("db", new Locale("DE"));
		System.out.println(rb.getString("mesaj"));
	}

	public static void setLocales(Enumeration<Locale> locales) {
		Util.locales.set(new ArrayList<Locale>());
		while (locales.hasMoreElements()) {
			Locale locale = (Locale) locales.nextElement();
			Util.locales.get().add(locale);
		}
	}

}
