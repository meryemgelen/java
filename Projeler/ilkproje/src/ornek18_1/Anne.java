package ornek18_1;

public class Anne {
    protected static int yas = 38;
    static {
	System.out.println(yas);
	yas++;
    }

    public Anne() {
	super();
	System.out.println(yas);
	yas = 29;

    }

    public Anne(int yas) {
	this();
	System.out.println(yas);
	Anne.yas = yas--;
    }

    public int getYas() {
	return yas;
    }

    static {
	yas++;
    }

}
