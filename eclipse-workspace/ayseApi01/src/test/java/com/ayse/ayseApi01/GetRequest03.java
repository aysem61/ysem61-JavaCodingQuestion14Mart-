package com.ayse.ayseApi01;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetRequest03 {

	
	//When
//  I send a GET request to REST API URL         
	
	
//	https://jsonplaceholder.typicode.com/todos/23  
//And Accept type is “application/JSON”
//Then
//HTTP Status Code should be 200
//And Response format should be "application/JSON"
//And "title" is "et itaque necessitatibus maxime molestiae qui quas velit",
//And "completed" is false
//And "userId" is 2
//

	@Test
	public void get03() {

		// 1.step set url

		String url = " https://jsonplaceholder.typicode.com/todos/23 ";

		// 2.step accepted data

		// 3.step sent url

		Response response = given().accept(ContentType.JSON).when().get(url);
		response.prettyPrint();

		// 4.make assertion

		response.then().assertThat().statusCode(200).
					contentType("application/json; charset=utf-8");

	}

}
