package ornek2;

public class Birlik {
    private String adi;
    private int mevcut;
    private String sehir;

    public String getAdi() {
	return adi;
    }

    public void setAdi(String adi) {
	this.adi = adi;
    }

    public int getMevcut() {
	return mevcut;
    }

    public void setMevcut(int mevcut) {
	this.mevcut = mevcut;
    }

    public String getSehir() {
	return sehir;
    }

    public void setSehir(String sehir) {
	this.sehir = sehir;
    }

    public Birlik(String adi, int mevcut, String sehir) {
	this.adi = adi;
	this.mevcut = mevcut;
	this.sehir = sehir;
    }

    public Birlik() {
    }

    @Override
    public String toString() {
	return new StringBuilder("Birlik Adi:").append(adi).append(", Mevcut : ").append(mevcut).append(", Þehir : ")
		.append(sehir).toString();
    }

}
