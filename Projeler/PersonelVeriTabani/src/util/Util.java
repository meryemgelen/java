package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {
    static {
	ayarlariOku();
    }
    private static Properties ayarlar;

    private Util() {
    }

    private static void ayarlariOku() {
	ayarlar = new Properties();
	InputStream ayarlarDosyasi = Util.class.getClassLoader().getResourceAsStream("ayarlar.properties");
	try {
	    ayarlar.load(ayarlarDosyasi);
	} catch (Exception e) {
	    System.err.println("Ayarlar dosyasi okunamadi: " + e);
	} finally {
	    try {
		ayarlarDosyasi.close();
	    } catch (IOException e2) {
	    }
	}
    }

    public static String getParam(String key) {
	return ayarlar.getProperty(key);
    }
}
