package ornek17;

public class Calistir {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	requestGeldi(new Servlet1());
	requestGeldi(new Servlet2());

    }

    private static void requestGeldi(ServletBase servlet) {
	servlet.doProcess();
    }

}
