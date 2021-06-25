package com.ayse.ayseApi01;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;





public class Get01 {
	
	/*
 	Gherkin Language:
 	Given: It declares prerequisetes
 	When: It defines the action which user will perform
 	Then: Talk about outputs
 	And: It can be used in "Given", "When", "Then", if you have multiple options
 */
	/*
	 When
	     I send a GET Request to the URL https://restful-booker.herokuapp.com/booking/3
	 Then
	     HTTP Status Code should be 200
	 And
	     Content Type should be in JSON Format
	 And
	     Status Line should be HTTP/1.1 200 OK
*/
	
	@Test
	public void get01(){
		
		//1. step set url
		String url="https://restful-booker.herokuapp.com/booking/3";
		
		//2.step  accepted data
		
		//3.step send the url                //"application/json"
		Response response=given().accept("application/json").when().get(url);
		
		response.prettyPrint();// yazdirma gorutuleme 
		
		
		// 4. step make assertion
		
		
		response.then().assertThat().
		statusCode(200)
		.contentType(ContentType.JSON).statusLine("HTTP/1.1 200 OK");
		
		
		/////how can see status code. status line ,content type on console
		
		System.out.println("mine status code is:"+response.getStatusCode());
		System.out.println("content type is :"+response.getContentType());
		System.out.println("status line is :"+response.getStatusLine());
		System.out.println("headers are :"+response.getHeaders());
	}
	
	

}
