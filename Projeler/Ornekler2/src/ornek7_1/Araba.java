package ornek7_1;

public class Araba extends Arac {
    @Override
    public void setHiz(int hiz) {
	super.setHiz(hiz);
	if (getHiz() < 30) {
	    super.setVites(1);
	} else if (getHiz() < 60) {
	    super.setVites(2);
	} else if (getHiz() < 90) {
	    super.setVites(3);
	} else if (getHiz() < 120) {
	    super.setVites(4);
	} else {
	    super.setVites(5);
	}
    }

    @Override
    public void setVites(int vites) {
	// TODO Auto-generated method stub
	super.setVites(vites);
	if (getVites() == 1) {
	    super.setHiz(30);
	} else if (getVites() == 2) {
	    super.setHiz(60);
	} else if (getVites() == 3) {
	    super.setHiz(90);
	} else if (getVites() == 4) {
	    super.setHiz(120);
	} else {
	    super.setHiz(200);
	}
    }
}
