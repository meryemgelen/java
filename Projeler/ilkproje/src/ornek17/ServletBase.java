package ornek17;

public abstract class ServletBase {

    public abstract void doGet();

    public void doProcess() {
	System.out.println("vt bağlantısı kur");
	doGet();
	System.out.println("VT bağlantısını kapat");
    }
}
