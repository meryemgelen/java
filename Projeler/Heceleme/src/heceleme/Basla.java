package heceleme;

import java.util.List;
import java.util.Scanner;

public class Basla {
	private static Yardimci yardimci = new Yardimci();

	public static void main(String[] args) {
		new Basla().basla();
	}

	private void basla() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Hecelenecek cümleyi giriniz:");
			String cumle = scanner.nextLine();
			List<String> kelimeler = yardimci.kelimeAyir(cumle);
			for (String s : kelimeler) {
				System.out.print(yardimci.hecelerineAyir(s));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
