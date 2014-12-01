package hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setId(1);
		t.setName("t1");
		t.setTitle("middle");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(null);
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
	}
}
