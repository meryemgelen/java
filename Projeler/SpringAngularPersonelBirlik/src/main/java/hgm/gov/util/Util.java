package hgm.gov.util;

import org.json.JSONObject;

public class Util {
	private static PasswordAuthentication passwordAuthentication = new PasswordAuthentication();

	private Util() {
	}

	public static PasswordAuthentication getPasswordAuthentication() {
		return passwordAuthentication;
	}

	public static String tamamCevabiOlustur() {
		JSONObject json = new JSONObject();
		json.put("sonuc", "tamam");
		return json.toString();
	}

	public static String tamamCevabiOlustur(String key, Object value) {
		JSONObject json = new JSONObject();
		json.put("sonuc", "tamam");
		json.put(key, value.toString());
		return json.toString();
	}

	public static String hataCevabiOlustur(String key, Object value) {
		JSONObject json = new JSONObject();
		json.put(key, value.toString());
		return json.toString();
	}
}