package inheritance2;

public class Main {

	public static void main(String[] args) {

//		LogManager logManager = new LogManager();
//		logManager.log(); //yanl��

		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new FileLogger());

	}

}
