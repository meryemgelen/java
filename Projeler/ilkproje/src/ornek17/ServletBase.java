package ornek17;

public abstract class ServletBase {

    public abstract void doGet();

    public void doProcess() {
	System.out.println("vt baðlantýsý kur");
	doGet();
	System.out.println("VT baðlantýsýný kapat");
    }
}
