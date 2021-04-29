package ornek2;

import java.sql.SQLException;

public class Calistir {
    public static void main(String[] args) throws SQLException {
	try {
	    new PersonelDB().getPersoneller().forEach(System.out::println);
	    System.out.println("--------------------------------------");
	    new BirlikDB().getBirlikler().forEach(System.out::println);
	} finally {
	    DBBase.closeConnection();
	}
    }
}
