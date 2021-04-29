package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import dao.util.HibernateUtil;
import entities.PersonelAdres;

public class PersonelAdresDAO {

	public List<PersonelAdres> getPersonelAdresler(int personelId) {
		Session session = HibernateUtil.getSession();
		Query<PersonelAdres> query = session.createQuery("from PersonelAdres pa where pa.personel.id = :personelId", PersonelAdres.class);
		query.setParameter("personelId", personelId);
		return query.getResultList();

	}

}
