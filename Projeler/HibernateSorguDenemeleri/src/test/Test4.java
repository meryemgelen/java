package test;

import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.NativeQuery;

import entities.Birlik;
import entities.Personel;
import entities.PersonelAdres;

public class Test4 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();

		Properties properties = new Properties();
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.PASS, "Aa123456");
		properties.put(Environment.USER, "harita_user");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/harita");

		configuration.setProperties(properties);

		configuration.addAnnotatedClass(Personel.class);
		configuration.addAnnotatedClass(PersonelAdres.class);
		configuration.addAnnotatedClass(Birlik.class);

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		NativeQuery query = session.createSQLQuery("select p.adi, p.soyadi, count(*) adres_sayisi from personel p join personel_adres a on (p.id = a.personel_id) group by adi, soyadi");

		List<Object[]> sonuc = query.list();
		sonuc.forEach(s -> System.out.println(Stream.of(s).map(String::valueOf).collect(Collectors.joining(","))));

	}

}
