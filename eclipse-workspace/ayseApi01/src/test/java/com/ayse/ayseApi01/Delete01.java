package com.ayse.ayseApi01;



import java.util.HashMap;

import org.hamcrest.Matchers;
import org.junit.Test;

import TestClasses.RestApiExampleHolder;
import TestClasses.TestBaseDummy;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
/*
 * When
              I send DELETE Request to the Url http://dummy.restapiexample.com/api/v1/delete/2                 
       Then
              Status code is 200
              And Response body is {
                                                       "status": "success",
                                                       "data": "2",
                                                       "message": "Successfully! Record has been deleted"
                                                     }
 */
public class Delete01 extends TestBaseDummy {

	
	
	@Test
	public void delete01() {
		
		spec.pathParams("api","api","version","v1","delete","delete","id","2");
		
		Response reponse=given().spec(spec).when().delete("/{api}/{version}/{delete}/{id}");
		
		reponse.prettyPrint();
		
		reponse.then().assertThat().statusCode(200)
		.body("status", Matchers.equalTo("success"),"data",Matchers.equalTo("2"),
				"message",Matchers.equalTo("Successfully! Record has been deleted"));
		
	}
	
}
