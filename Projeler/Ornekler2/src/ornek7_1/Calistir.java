package ornek7_1;

public class Calistir {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Araba araba = new Araba();
	araba.setHiz(100);
	System.out.println(araba);
	System.out.println("--------------------------------------");
	Motosiklet moto = new Motosiklet();
	moto.setHiz(100);
	System.out.println(moto);
	System.out.println("--------------------------------------");
	Araba araba1 = new Araba();
	araba1.setVites(3);
	System.out.println(araba1);
    }

}
