package h07.firstcache_secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch07 {

	public static void main(String[] args) {
		
		
		Books07 book = new Books07();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students07.class).addAnnotatedClass(Books07.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();
		Transaction tx1 = session1.beginTransaction();
		
		//When you fetch a new data ,your code should hit database,but if you want to get same data
		//again again,hibernate will not hit the database again and again.It will use Cache Memory to fetch data
		book=session1.get(Books07.class, 103);//1.hit
		System.out.println(book);
		
		book=session1.get(Books07.class, 103);//From cache
		System.out.println(book);
		
		book=session1.get(Books07.class, 103);//From cache
		System.out.println(book);
		
		book=session1.get(Books07.class, 103);//1.hit
		System.out.println(book);
		
		book=session1.get(Books07.class, 102);//2.hit
		System.out.println(book);
		
		book=session1.get(Books07.class, 102);
		System.out.println(book);
		

			tx1.commit();


	}

}
