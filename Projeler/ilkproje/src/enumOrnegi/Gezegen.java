package enumOrnegi;

public enum Gezegen {
    MERKUR(2440), VENUS(6051), DUNYA(6871), MARS(3390);

    private int cap;

    private Gezegen(int cap) {
	this.cap = cap;
    }

    public int getCap() {
	return cap;
    }

}
