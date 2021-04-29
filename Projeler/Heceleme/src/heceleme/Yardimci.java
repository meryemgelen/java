package heceleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Yardimci {
	private List<Character> sesliHarfler = Arrays.asList(new Character[] { 'a', 'e', 'ý', 'i', 'o', 'ö', 'u', 'ü' });
	private List<Character> tumHarfler = Arrays.asList(new Character[] { 'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ð', 'h', 'ý', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö', 'p', 'r', 's', 'þ', 't', 'u', 'ü', 'v', 'y', 'z' });

	private Locale trLocale = new Locale("TR");

	public List<String> kelimeAyir(String cumle) {
		List<String> kelimeler = new ArrayList<String>();
		String sonKelime = "";
		char sonKarakter = ' ';
		for (int i = 0; i < cumle.length(); i++) {
			char c = cumle.charAt(i);
			if (c == ' ' && sonKarakter != ' ' && !"".equals(sonKelime)) {
				kelimeler.add(sonKelime);
				sonKelime = "";
			}
			if (c != ' ') {
				sonKelime += c;
			}
			sonKarakter = c;
		}
		// son kelimeyi ekle
		if (!"".equals(sonKelime)) {
			kelimeler.add(sonKelime);
		}
		return kelimeler;
	}

	public String hecelerineAyir(String kelime) {
		String hecelenmisKelime = "";
		String sesliSessiz = sesliSessizAyir(kelime);
		while (!"".equals(sesliSessiz)) {
			String heceKalibi = getIlkHece(sesliSessiz);
			sesliSessiz = sesliSessiz.substring(heceKalibi.length());
			String hece = kelime.substring(0, heceKalibi.length());
			kelime = kelime.substring(heceKalibi.length());
			if (!"".equals(hecelenmisKelime)) {
				// ilk hece degilse
				hecelenmisKelime += "-";
			}
			hecelenmisKelime += hece;
		}
		hecelenmisKelime += kelime;// sondaki noktalama iþaretlerini de ekliyoruz.
		return hecelenmisKelime;
	}

	private String getIlkHece(String sesliSessiz) {
		String s = getSiradakiKalip(sesliSessiz, 0);
		if (s.equals("S")) {
			// sesli (ornek : a)
			String s2 = getSiradakiKalip(sesliSessiz, 1);
			if (s2.equals("S") || "".equals(s2)) {
				// sesli (ornek : ai(le))
				return sesliSessiz.substring(0, 1);
			} else {
				// sessiz ( ornek: al )
				String s3 = getSiradakiKalip(sesliSessiz, 2);
				if ("S".equals(s3)) {
					// sesli (ornek: ali)
					return sesliSessiz.substring(0, 1);
				} else if ("".equals(s3)) {
					// yok (ornek : al)
					return sesliSessiz.substring(0, 2);
				} else {
					// sessiz (ornek: alp)
					String s4 = getSiradakiKalip(sesliSessiz, 3);
					if ("S".equals(s4)) {
						// sesli (ornek: alpi)
						return sesliSessiz.substring(0, 2);
					} else if ("".equals(s4)) {
						// yok (ornek: alp)
						return sesliSessiz.substring(0, 3);
					} else {
						// sessiz ornek( alpp)
						// 3 sessiz harf arka arkaya gelmez.
						return "";
					}
				}
			}
		} else {
			// sessiz ornek( b)
			String s2 = getSiradakiKalip(sesliSessiz, 1);
			if (s2.equals("S")) {
				// sesli (ornek : bi)
				String s3 = getSiradakiKalip(sesliSessiz, 2);
				if ("S".equals(s3) || "".equals(s3)) {
					// sesli ornek: naa(þ)
					return sesliSessiz.substring(0, 2);
				} else {
					// sessiz ornek : tar
					String s4 = getSiradakiKalip(sesliSessiz, 3);
					if ("S".equals(s4)) {
						// sesli ornek: tarý(k)
						return sesliSessiz.substring(0, 2);
					} else if ("".equals(s4)) {
						// yok ornek: kar
						return sesliSessiz.substring(0, 3);
					} else {
						// sessiz ornek: tank
						String s5 = getSiradakiKalip(sesliSessiz, 4);
						if ("S".equals(s5)) {
							// sesli ornek: tanka
							return sesliSessiz.substring(0, 3);
						} else if ("".equals(s5)) {
							// yok ornek: tank
							return sesliSessiz.substring(0, 4);
						} else {
							// sessiz ornek: tankl
							// 3 sessiz harf yanyana olmamasý gerekir.
							return sesliSessiz.substring(0, 4);
						}
					}
				}
			} else if ("".equals(s2)) {
				// yok (ornek : b)
				// tek sessiz harf
				// olmamasi gerekir.
				return "";
			} else {
				// sessiz (ornek : tr(en))
				String s3 = getSiradakiKalip(sesliSessiz, 2);
				if ("S".equals(s3)) {
					// sesli ornek: tre(n)
					String s4 = getSiradakiKalip(sesliSessiz, 3);
					if ("S".equals(s4) || "".equals(s4)) {
						// sesli ornek: trea(tlon)
						return sesliSessiz.substring(0, 3);
					} else {
						// sessiz ornek: trol(eybüs)
						String s5 = getSiradakiKalip(sesliSessiz, 4);
						if ("".equals(s5)) {
							// yok ornek: trol
							return sesliSessiz.substring(0, 4);
						} else if ("S".equals(s5)) {
							// sesli ornek: trole(ybüs)
							return sesliSessiz.substring(0, 3);
						} else {
							// sessiz ornek( troll )
							// türkçede böyle bir hece olmamalýdýr.
							return sesliSessiz.substring(0, 5);
						}
					}
				} else if ("".equals(s3)) {
					// yok ornek: bre
					return sesliSessiz.substring(0, 3);
				} else {
					// sessiz ornek: brk
					// türkçede 3 sessiz harf yan yana gelmemelidir.
					return "";
				}
			}
		}
	}

	private String getSiradakiKalip(String sesliSessiz, int index) {
		return sesliSessiz.length() > index ? String.valueOf(sesliSessiz.charAt(index)) : "";
	}

	private String sesliSessizAyir(String kelime) {
		String ufakHarfStr = kelime.toLowerCase(trLocale);
		String sesliSessiz = "";
		for (int i = 0; i < ufakHarfStr.length(); i++) {
			char c = ufakHarfStr.charAt(i);
			if (sesliHarfler.contains(c)) {
				sesliSessiz += "S";
			} else if (tumHarfler.contains(c)) {
				sesliSessiz += "Z";
			}
		}
		return sesliSessiz;
	}

}
