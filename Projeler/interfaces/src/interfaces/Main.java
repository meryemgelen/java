package interfaces;

public class Main {

	public static void main(String[] args) {
//		CustomerManager customerManager = new CustomerManager(new EmailLogger());

		Logger[] loggers = { new SmsLogger(), new EmailLogger(), new FileLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer engin = new Customer(1, "Engin", "Demirog");

		customerManager.add(engin);

	}

}
