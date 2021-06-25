package h03.onetoonejoins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch03 {

	public static void main(String[] args) {
		/*
		 * We are using Fethc class to read the data
		 */

		Students03 stdRead = new Students03();

		Dairy dRead = new Dairy();

		
		Configuration con = new Configuration().
								 configure("hibernate.cfg.xml").
								 addAnnotatedClass(Students03.class)
								.addAnnotatedClass(Dairy.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		// get method workd alwast with id variable ...
		
		//stdRead=session.get(Students03.class, 101); // first ist Class , second pK 
		//System.out.println(stdRead);
		
		//dRead=session.get(Dairy.class, 11);
		//System.out.println(dRead);
		
		
		//2)  Fetch the dairy details of  a student whose id is 102 by using get()
		// if you use  non -primary key values in get() , it returns "null"
		
		
		/*dRead=session.get(Dairy.class, 12); //without  pk is returning Null 
		System.out.println(dRead); */
		
		// 3) Fetch student name , dairy name  and 
		//student grade of common recors from Students03 and Dairy tables
		
		
		//1.Way :Sql Queries 
		
		// to make Tables name short using allies as s or d letter to reference  
		
	  /*	String sql3="Select s.student_name,d.dairy,s.grade "
				+ "FROM Students03 s  INNER JOIN Dairy d "
				+ "on s.student_id=d.student_id";
		
		
		
		// in list to use an Object in order to cover all type of the data type 
		// in List Object array should be use to cover all data 
		List<Object[]>   resultList3=session.createSQLQuery(sql3).getResultList(); // will give a list for many data 
		
		
		for(Object[] w:resultList3) {
			
			System.out.println(Arrays.toString(w));
		}
		
		*/
		
		// 2.Way HQL queries   is using class variable but sql using  table name and column 
		
		//Do not use table values in HQL query 
		
		/*
		String hql3="SELECT s.name ,d.dairy,s.grade "
				+ "FROM Students03 s INNER JOIN Dairy d "
				+ "ON s.student_id=d.student";
		
		List<Object[]> resultListHql3=session.createQuery(hql3).getResultList();
		
		
		for(Object[] w:resultListHql3) {
			
			System.out.println(Arrays.toString(w));
		}
		
		*/		
		
//		dRead=session.get(Dairy.class, 12); 
//		System.out.println(dRead); 
		
		/*
		 *  4) Fetch student name , dairy name , and student grade of records from Student03 table 
		 */
		
		
//			String sql4="SELECT  s.student_name, d.dairy , s.grade "
//								+ "FROM Students03 s LEFT JOIN  Dairy d "
//								+ "ON s.student_id=d.student_id ";	
//			
//			List<Object[]> resultSql4=session.createSQLQuery(sql4).getResultList();
//				
//			
//			for(Object[] w:resultSql4) {
//				
//				System.out.println(Arrays.toString(w));
//			}
		
		
		/*
		 * 2. Way with HQL Query by using only class values .
		 */
//		
//		String hql4="SELECT s.name, d.dairy , s.grade FROM Students03 s LEFT JOIN Dairy d ON s.student_id=d.student ";
//		
//		List<Object[]> hql4List=session.createQuery(hql4).getResultList();
//		
//		for(Object[]  w:hql4List) {
//			
//			System.out.println(Arrays.toString(w));
//		}
//		
//		
		
		
		/*
		 * 5 Fetch student name , dairy name and student grade of records from Dairy table 
		 */
		
		
//		String sql5="SELECT s.student_name,d.dairy,s.grade FROM Dairy d RIGHT JOIN Students03 s ON d.student_id=s.student_id";
//		
//		List<Object[]> resultList5=session.createSQLQuery(sql5).getQueryReturns();
//		
//		for(Object[]  w:resultList5) {
//			
//			System.out.println(Arrays.toString(w));
//		}
//		
		
		//2. Way with HQL Query 
		
//		String hql5="SELECT s.name,d.dairy,s.grade FROM Students03 s RIGHT JOIN Dairy d ON s.student_id=d.student";
//		
//		
//		List<Object[]>  resultList5b=session.createQuery(hql5).getResultList();
//		
//		for(Object[] w:resultList5b) {
//			
//			System.out.println(Arrays.toString(w));
//		}
//		
//		
		
		/*
		 * 6) Fetch student name , dairy name and student grade of all records from Students03 and Dariy table 
		 */
		
		
//		String sql6="SELECT s.student_name,d.dairy,s.grade "
//					+ "FROM Students03 s FULL  JOIN Dairy d "
//					+ "ON d.student_id=s.student_id ";
//		
//		List<Object[]> resultList6sql=session.createSQLQuery(sql6).getResultList();
//		
//		for(Object[] w:resultList6sql) {
//			
//			System.out.println(Arrays.toString(w));
//		}
		
		
		//2. Way with HQL Query 
//		
//		String hql6="SELECT s.name,d.dairy,s.grade FROM Students03 s FULL JOIN Dairy d ON s.student_id=d.student";
//		
//		
//		List<Object[]> resultListhql5=session.createQuery(hql6).getResultList();
//		
//		for(Object[] w:resultListhql5) {
//			
//			System.out.println(Arrays.toString(w));
//		}
//		
		
		// 7) Fetch all students information of common records from Students03 and Dairy table 
		
		
		//1.Way :Sql Query 
		//Note:If you have duplicated columns in diffrent table,to fetch all records do not use "*".
		//Type column names
		String sql7="SELECT  s.student_id,s.grade,s.student_name,d.id,d.dairy FROM Students03  s INNER JOIN Dairy d ON s.student_id=d.student_id ";
		
		List<Object[]>  result7sqlList=session.createSQLQuery(sql7).getResultList();
		
		for(Object[]  w:result7sqlList) {
			
			System.out.println(Arrays.toString(w));
		}
//		
//		
//		//2. Way with HQL full data ....
//		//In Hql if you want to get all data about the records , no need tu use "SELECT *"  you can start from "FROM"
////		String hql7="FROM Students03 s INNER JOIN Dairy d ON s.student_id=d.student";
////		
////		List<Object[]> resultList7b=session.createQuery(hql7).getResultList();
////		
////		for(Object[]  w:resultList7b) {
////			System.out.println(Arrays.toString(w));
////		}
//		
		
		//8) Fetch all students information of all records from Students03 and Dairy table 
		
//		String hql8="FROM Students03 s FULL JOIN Dairy d ON s.student_id=d.student";
//		
//		List<Object[]>  resultListhql7=session.createQuery(hql8).getResultList();
//		
//		
//		for(Object[] w:resultListhql7) {
//			
//			System.out.println(Arrays.toString(w));
//		}
		
		
		
		tx.commit();

		
		
		session.close();
		sf.close();
	}

}
