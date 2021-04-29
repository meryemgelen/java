package ornek2;

public class BolmeHatasi extends Exception {
    private static final long serialVersionUID = -3113639858008449617L;
    private int hataKode;

    public int getHataKode() {
	return hataKode;
    }

    public void setHataKode(int hataKode) {
	this.hataKode = hataKode;
    }
}
