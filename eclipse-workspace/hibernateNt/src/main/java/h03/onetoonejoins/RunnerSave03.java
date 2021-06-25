package h03.onetoonejoins;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave03 {

	
	public static void main(String[] args) {
		/*
		 * java yukaridan asagi calisir ve once Dairy  child class ve obje sonra Students olusturulu
		 * 
		 * yoksa error verir
		 */
		Dairy d1=new Dairy(11,"First dairy");
		Dairy d2=new Dairy(12,"Second dairy");
		Dairy d3=new Dairy(13,"Third dairy");
		
		
		Students03 std1=new Students03(101, "Ali Can", 11, d1);
		
		Students03 std2=new Students03(102,"Veli Han", 12, d2);
		
		Students03 std3=new Students03(103,"Ayse Han", 10, d3);
		
		
		//Dairy deki column student update etmek icin 
		d1.setStudent(std1); // 3.gun de dairy class update edildi ve 
		d2.setStudent(std2);
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").
				              addAnnotatedClass(Students03.class).
				              addAnnotatedClass(Dairy.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(d1);
		session.save(d2);
		session.save(d3);
		
//		session.save(std1);
//		session.save(std2);
//		session.save(std3);
		
		
		tx.commit();
		
		
	}
	
	
}
