package ornek15_1;

public class Arac extends Object {
    private int hiz;

    @Override
    public String toString() {
	return "Araç hizi = " + hiz;
    }

    public void hiziArttir() {
	hiz++;
	System.out.println("araç hýzý artýrýlýyor");
    }
}