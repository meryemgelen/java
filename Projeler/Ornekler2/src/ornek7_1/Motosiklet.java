package ornek7_1;

public class Motosiklet extends Arac {
    @Override
    public void setHiz(int hiz) {
	// TODO Auto-generated method stub
	super.setHiz(hiz);
	super.setHiz(hiz);
	if (getHiz() < 100) {
	    setVites(1);
	} else if (getHiz() < 160) {
	    setVites(2);
	} else if (getHiz() < 200) {
	    setVites(3);
	} else if (getHiz() < 240) {
	    setVites(4);
	} else {
	    setVites(5);
	}
    }

}
