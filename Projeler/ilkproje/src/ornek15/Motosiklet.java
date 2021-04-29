package ornek15;

public class Motosiklet extends Arac {
    private int hiz;

    @Override
    public String toString() {
	return "Motosiklet hizi = " + hiz;
    }

    @Override
    public void hiziArttir() {
	System.out.println("motorun hýzý artýrýlýyor");
	super.hiziArttir();
    }

    public int getHiz() {
	return hiz;
    }

    public void setHiz(int hiz) {
	this.hiz = hiz;
    }

}
