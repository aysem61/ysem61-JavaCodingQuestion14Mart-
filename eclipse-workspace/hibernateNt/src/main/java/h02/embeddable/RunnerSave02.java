package h02.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {

	public static void main(String[] args) {
		
		//Course02 da ki veriler icin obje uretildi 
		Courses02 c1=new Courses02("Art","Science");
		
		Courses02 c2=new Courses02("Music","Math");
		
		// those are row or record on sql for data ..
		Students02 std1=new Students02(101, "Veli Han", 11,c1 ); // bura da c1 courses02 nun objesi olmali cunku Courses02 dan uretildi 

		Students02 std2=new Students02(102,"Angie Star",10,c1);
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students02.class);
		
		SessionFactory  sf=con.buildSessionFactory();
		
		Session s1=sf.openSession();
		
		
		// Burada  datalari olusuruyoruz   
		Transaction tx=s1.beginTransaction();
		
		s1.save(std1);
		s1.save(std2);
		
		
		tx.commit();
		
		
		
	}

}
