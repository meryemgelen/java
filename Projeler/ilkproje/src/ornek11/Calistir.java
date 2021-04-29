package ornek11;

public class Calistir {

    public static void main(String[] args) {
	int[] sayilar;
	sayilar = new int[3];
	System.out.println(sayilar[2]);
	sayilar[1] = 58;
	System.out.println(sayilar.length);

	String[] isimler = new String[2];
	isimler[0] = "abdülkadir";
	isimler[1] = "kamile";

	String[] isimler2 = new String[] { "abdülkadir", "kamile" };
	isimler2 = new String[] { "azime", "murteza" };
	for (int i = 0; i < isimler2.length; i++) {
	    System.out.println(isimler2[i]);
	}
	System.out.println("----------------------------------------");
	for (String s : isimler2) {
	    System.out.println(s);
	}
    }

}