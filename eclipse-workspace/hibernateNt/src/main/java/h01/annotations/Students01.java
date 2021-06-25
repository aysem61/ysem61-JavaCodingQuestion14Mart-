package h01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity // javax.persistence.Entity; kullan 
@Table(name="students_table") // table ismini degistimek icin kullanilan annotation 
public class Students01 {

	/*
	 * POJO :Plain  Old Java Object 
	 * 
	 * 1-Create private variables
	 * 2-Create constructor
	 * 3-Create getters and setters
	 * 4-Create toString()
	 */
	
	/*
	 * Note :If you will use a clas in hibernate to create table in databese,
	 *  do not make any variable "final" or "static"
	 */
	@Id // Hibernate de mutlaka bir tane primaryKey olmali ve o da @Id annotation ile oluyor 
	private int student_id;
	@Column(name="student_name") //   with @Column(name=") degistirilebilir oldu 
	private String name;
	//@Transient // not to put on consol as a column name ..column name ismini consolda gostermemmek icin kullanulur 
	private int grade;
	
	
	public Students01() {
		
	}


	public Students01(int id, String name, int grade) {
		
		this.student_id = id;
		this.name = name;
		this.grade = grade;
	}


	public int getId() {
		return student_id;
	}


	public void setId(int id) {
		this.student_id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Students01 : id=" + student_id + ", name=" + name + ", grade=" + grade + ".";
	}
	
	
}
