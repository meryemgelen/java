package ornek2;

public class Personel {
    private String tcno;
    private String adi;
    private String soyadi;

    public String getTcno() {
	return tcno;
    }

    public void setTcno(String tcno) {
	this.tcno = tcno;
    }

    public String getAdi() {
	return adi;
    }

    public void setAdi(String adi) {
	this.adi = adi;
    }

    public String getSoyadi() {
	return soyadi;
    }

    public void setSoyadi(String soyadi) {
	this.soyadi = soyadi;
    }

    public Personel(String tcno, String adi, String soyadi) {
	this.tcno = tcno;
	this.adi = adi;
	this.soyadi = soyadi;
    }

    public Personel() {
    }

    @Override
    public String toString() {
	return new StringBuilder("Personel Tc:").append(tcno).append(", Adi : ").append(adi).append(", Soyadi : ")
		.append(soyadi).toString();
    }
}
