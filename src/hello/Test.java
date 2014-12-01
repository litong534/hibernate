package hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Test {
	static Configuration cfg = null;
	static StandardServiceRegistryBuilder srb = null;
	static SessionFactory sf = null;
	static Session session = null;
	
	public static void testSave(Student s){
		 cfg = new Configuration().configure(); 
	        srb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
	        StandardServiceRegistry sr = srb.build();
	        sf = cfg.buildSessionFactory(sr);
	        session = sf.openSession();
	        session.beginTransaction();
	        session.save(s);
	        session.getTransaction().commit();
	        session.close();
	        sf.close();
	}
	
	public static void testUpdate(Student s){
		 cfg = new Configuration().configure(); 
	        srb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
	        StandardServiceRegistry sr = srb.build();
	        sf = cfg.buildSessionFactory(sr);
	        session = sf.openSession();
	        session.beginTransaction();
	        session.update(s);
	        session.getTransaction().commit();
	        session.close();
	        sf.close();
	}
	
	public static void testDelete(Student s){
		 cfg = new Configuration().configure(); 
	        srb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
	        StandardServiceRegistry sr = srb.build();
	        sf = cfg.buildSessionFactory(sr);
	        session = sf.openSession();
	        session.beginTransaction();
	        session.delete(s);
	        session.getTransaction().commit();
	        session.close();
	        sf.close();
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("zhangsan");
		s.setAge(20);
		
		testUpdate(s);
		
	}
}
