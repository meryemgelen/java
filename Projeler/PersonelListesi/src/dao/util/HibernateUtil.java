package dao.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory; // static olunca hafýzada bir tane oluyor.
	private static ThreadLocal<Session> hibernateSession = new ThreadLocal<Session>();

	public HibernateUtil() {
		// TODO Auto-generated constructor stub
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}

	public static Session getSession() {
		if (hibernateSession.get() == null) {
			hibernateSession.set(getSessionFactory().openSession());
		}

		return hibernateSession.get();
	}

	public static void closeSession() {
		if (hibernateSession.get() != null && hibernateSession.get().isOpen()) {
			hibernateSession.get().close();
		}
	}
}
