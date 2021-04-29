package harita;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Personel;
import beans.PersonelAdres;

public class Calistir {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		List<Personel> personelListesi = session.createQuery("from Personel", Personel.class).list();
		for (Personel p : personelListesi) {
			System.out.println(p);
		}
		PersonelAdres adres = session.get(PersonelAdres.class, 6);
		System.out.println(adres);

		// personel adres deðiiþli
		adres.setAdres("yeni adres2");
		session.getTransaction().begin();
		session.save(adres);
		session.getTransaction().commit();
		//

		System.out.println("------------------------------------");

		PersonelAdres adres2 = (PersonelAdres) session.createQuery("from PersonelAdres p where p.id=6").uniqueResult();
		System.out.println(adres2);

		System.out.println("------------------------------------");
		List<PersonelAdres> adresler = session.createQuery("from PersonelAdres p where p.personel.adi='ilhan'", PersonelAdres.class).list();
		adresler.forEach(System.out::println);

		session.close();
		factory.close();
	}

}
