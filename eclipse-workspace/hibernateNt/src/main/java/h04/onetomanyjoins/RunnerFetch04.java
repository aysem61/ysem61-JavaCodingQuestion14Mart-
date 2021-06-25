package h04.onetomanyjoins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {

		Students04 student = new Students04();
		Books04 book = new Books04();

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students04.class)
				.addAnnotatedClass(Books04.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		// 1: Fetch all books of a student whose id is 101 by using get() method
//		student = session.get(Students04.class, 101);
//		for(Books04 w : student.getBooksList()) {
//			System.out.println(w);
//		}

		// 2: Fetch the owner of a book whose id is 11 by using get() method
//		book = session.get(Books04.class, 11);
//		student = session.get(Students04.class, book.getStudent().getStd_id());
//		System.out.println(student);

		// 3: Fetch student name, book name of common records from Students04 and
		// Books04 tables (INNER JOIN)

		// In SQL, you can use createSQLQuery() or createNativeQuery(). Both work. But
		// In HQL you should use createQuery()

		// 1.Way: SQL Query
//		String sqlQuery1 = "SELECT s.std_name, b.book_name \n" 
//		                   +"FROM students_table s INNER JOIN books_table b\n"
//				           + "ON s.std_id = b.std_id";
//
//		List<Object[]> resultList1 = session.createNativeQuery(sqlQuery1).getResultList();
//		
//		for (Object[] w : resultList1) {
//			System.out.println(Arrays.toString(w));
		// }

		// 2.Way: HQL Query

//		String hqlQuery="SELECT s.name,b.book_name "
//								+ "FROM Students04 s INNER JOIN Books04 b "
//								+ "ON s.std_id=b.student ";
//		
//		
//		List<Object[]> resultList2 = session.createQuery(hqlQuery).getResultList();
//		
//		for (Object[] w : resultList2) {
//			System.out.println(Arrays.toString(w));

		// Fetch student name, book name of all records from Students04 and Books04
		// table
		// 1:SQL query

//		String sqlQuery2="SELECT s.std_name,b.book_name FROM students_table s FULL JOIN books_table b ON s.std_id=b.student";
//		List<Object[]>resultList4=session.createQuery(hqlQuery2).getResultList();
//		for (Object[] w : resultList4) {
//			System.out.println(Arrays.toString(w));

		// How to delete all records from a table
		// 1:SQL Query
//			String sqlQuery3="DELETE FROM books_table";
//			int numOfDeleteRecs=session.createSQLQuery(sqlQuery3).executeUpdate();
//			System.out.println(numOfDeleteRecs+" records are deleted");
//			
//			
		// 6.Delete all records from parent table
		/*
		 * Note:If a table has child table,you cannot delete records from parent tablr.
		 * If you insist to delete records from parent table you have 2 options;
		 * a)Delete child records first then delete parent records. b)By using
		 * annotation we can tell to Hibernate like; If I delete parent delete child
		 */
		// 1:SQL Query
		// a)Delete child records first then delete parent records.
//		String sqlQuery3="DELETE FROM books_table";
//		int numOfDeleteRecs=session.createSQLQuery(sqlQuery3).executeUpdate();
//		System.out.println(numOfDeleteRecs+" records are deleted");

		// b)By using annotation we can tell to Hibernate like;
//		book=session.get(Books04.class,12);
//		session.delete("Books04, book);
//		

		// How to get a specific field values from a table
//		int max=Integer.MAX_VALUE;
//		String hqlQuery="FROM Students04  WHERE std_id<1000" + max;
//		List<Students04>resultList=session.createQuery(hqlQuery).getResultList();
//		
//		for(Students04 w:resultList) {
//			System.out.println(w.getStd_id();
//		}

		// c)Without touching Child Table delete records from Parent Table and from Child Table
		
		int max = Integer.MAX_VALUE;
		String hqlQuery = "FROM Students04  WHERE std_id<" + max;
		List<Students04> resultList = session.createQuery(hqlQuery).getResultList();

		for (Students04 w : resultList) {
					student=session.get(Students04.class,w.getStd_id());
			session.delete(student);
		}
		tx.commit();
		session.close();

	}
}
