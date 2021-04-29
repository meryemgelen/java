package paket26;

public class Bilgisayar {
    int ram = 16;

    public Bilgisayar() {
	this.ram = 32;
	System.out.println(ram);
    }

    public Bilgisayar(int ram) {
	this();
	System.out.println(ram);
	this.ram = ram;
	System.out.println(ram);
	System.out.println(this.ram);
    }
}
