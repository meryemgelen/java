package ornek18;

public class Tahmin {
    private int tutulanSayi;

    public Tahmin() {
	tutulanSayi = ((int) (Math.random() * 99)) + 1;
    }

    public int getTutulanSayi() {
	return tutulanSayi;
    }

}
