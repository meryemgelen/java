package interfaces;

public class CustomerManager {

	private Logger logger;

	private Logger[] loggers;

//	public CustomerManager(Logger logger) {
//
//		this.logger = logger;
//	}

	public CustomerManager(Logger[] loggers) {

		this.loggers = loggers;

	}

	public void add(Customer customer) {
		System.out.println("müþteri eklendi " + customer.getFirstName());

//		this.logger.log(customer.getFirstName());

//		for (Logger logger : loggers) {
//
//			logger.log(customer.getFirstName());
//
//		}

		// Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());

	}

	public void delete(Customer customer) {

		System.out.println("müþteri silindi " + customer.getFirstName());

//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName() + " veritabanýna loglandý");

		Utils.runLoggers(loggers, customer.getLastName());

	}

}
