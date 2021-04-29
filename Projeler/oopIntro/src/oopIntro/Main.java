package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product(1, "Lenova 1", 15000, "16 gb ram", 10, 15000);// örnek oluþturma referans
																						// olusturma instance

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenova 2");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);

		System.out.println(product2.getUnitPriceAfterDiscount());
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("içecek");

		System.out.println(category1.getName());
	}

}
