package h02.embeddable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

// burada entity annotaton kullanilmaz cunku altta id yok onun icin hibarnate hata verir 
@Embeddable // Embeddable is used to make data a class object inside a table  // Embeddable diger klass lara burayi ekelemek icin kullnulir
public class Courses02 {

	private String elective;

	private String mandatory;

	public Courses02() {

	}

	public Courses02(String elective, String mandatory) {

		this.elective = elective;
		this.mandatory = mandatory;
	}

	public String getElective() {
		return elective;
	}

	public void setElective(String elective) {
		this.elective = elective;
	}

	public String getMandatory() {
		return mandatory;
	}

	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}

	@Override
	public String toString() {
		return "Courses02 : elective=" + elective + ", mandatory=" + mandatory + ".";
	}
}
