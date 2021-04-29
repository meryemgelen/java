package ornek18_1;

public class BabaAnne extends Anne {
    static {
	System.out.println("Babaanne," + yas);
    }

    public BabaAnne() {
	super(45);
	System.out.println(getYas());
    }
}
