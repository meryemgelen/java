package paket4;

public class Test3 {

    public static void main(String[] args) {
	String[] s = new String[3];
	String isim = "Levent";
	s[0] = "Ali";
	s[1] = isim;
	s[2] = s[0];
	isim = "Mehmet";
	System.out.println(s[2]);
	System.out.println(s[1]);
    }
}
