package TestClasses;

import org.junit.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RestApiExampleHolder {

	protected RequestSpecification spec;

	@Before
	public void setUp() {

		spec = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();

	}

}