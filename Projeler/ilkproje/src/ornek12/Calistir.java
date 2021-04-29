package ornek12;

public class Calistir {

    public static void main(String[] args) {
	int a = 4;
	String s;
	Integer i;
	s = String.valueOf(a);
	a = Integer.parseInt(s);
	i = new Integer(a);
	a = i.intValue();

	i = new Integer(s);
	s = i.toString();
    }

    public static int topla(int sayi1, int sayi2) {
	String s1 = "" + sayi1;
	String s2 = "" + sayi2;
	String s3 = s1 + s2;
	Integer i = new Integer(s3);
	return i.intValue();
    }

}