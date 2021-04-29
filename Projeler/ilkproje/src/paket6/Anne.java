package paket6;

public class Anne {
    Anne anne;
    int yas;

    public static void main(String[] args) {
	Anne anne = new Anne();
	anne.yas = 32;
	anne.anne = new Anne();
	anne.anne.yas = 55;
	Anne anne2 = anne.anne;
	anne2.anne = anne;
	System.out.println(anne.anne.anne.anne.anne.yas);
    }
}
