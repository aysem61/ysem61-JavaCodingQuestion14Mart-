package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {

	public static void main(String[] args) {
		
		Students01 st1=new Students01(101,"ALi Can",11);
		
		Students01 st2=new Students01(102,"Canan Can",9);
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students01.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session s1=sf.openSession();
		
		Transaction tx=s1.beginTransaction(); //import org.hibernate.Transaction; den import et 
		
		s1.save(st1);
		
		s1.save(st2);
		
		tx.commit();
		
		 
	}

}
