package paket3;

public class Test {
    public static void main(String[] args) {
	Cocuk c = new Cocuk();
	Cocuk c2 = new Cocuk();
	Anne a = new Anne();
	Anne a2 = new Anne();
	a.yas = 38;
	a2.yas = 41;
	c.yas = 13;
	c2.yas = 8;
	System.out.println(a.cocuk);
	a.cocuk = c2;
	a2.cocuk = c;
	System.out.println(a.cocuk.yas);
	System.out.println(a2.yas);
    }
}
