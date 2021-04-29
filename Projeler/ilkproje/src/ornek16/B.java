package ornek16;

public class B extends A implements Tip1 {
    public void test() {
	System.out.println("B.test");
    }

    public void x(int sayi) {
	System.out.println("B.x" + sayi);
    }
}
