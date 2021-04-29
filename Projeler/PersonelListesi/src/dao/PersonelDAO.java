package dao;

import java.util.List;

import dao.util.HibernateUtil;
import entities.Personel;

public class PersonelDAO {
	public List<Personel> getPersonelList() {

		List<Personel> personelListesi = HibernateUtil.getSession().createQuery("from Personel", Personel.class).list();

		// Query<Personel> query = HibernateUtil.getSession().createQuery("from
		// Personel", Personel.class);
		return personelListesi;
	}
}
