package TestClasses;

import org.junit.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class TestBaseDummy {

	protected RequestSpecification spec;  // Interface 

	@Before
	public void setUp() {

		spec = new RequestSpecBuilder().setBaseUri("http://dummy.restapiexample.com").build();

	}

}