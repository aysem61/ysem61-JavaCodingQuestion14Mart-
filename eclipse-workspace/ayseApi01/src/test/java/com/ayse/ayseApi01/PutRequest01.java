package com.ayse.ayseApi01;

import java.util.HashMap;

import org.hamcrest.Matchers;
import org.junit.Test;

import TestClasses.RestApiExampleHolder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

/*
When   I send PUT Requst to the Url https://jsonplaceholder.typicode.com/todos/198
        with the PUT Request body like 
        
        {
           "userId": 21,
           "title": "Wash the dishes",
           "completed": false
                                  }
Then
 Status code is 200
 And response body is like {
                               "userId": 21,
                               "title": "Wash the dishes",
                               "completed": false,
                               "id": 198
*/

public class PutRequest01 extends RestApiExampleHolder {

	
@Test	
public void put01() {
	
	spec.pathParams("todos","todos","id","198");
	
	HashMap<String,Object> data=new HashMap<String,Object>();
	
	data.put("userId", 21);
	data.put("title", "Bulasiklari yika ....");
	data.put("completed", false);
	
	
	Response response=given().contentType(ContentType.JSON).spec(spec).body(data).when().put("/{todos}/{id}");
	
	response.prettyPrint();
	
	response.then().assertThat().statusCode(200);
	
	response.then().assertThat().statusCode(200)
	.body("completed", Matchers.equalTo(false),
			"title",Matchers.equalTo("Wash the dishes"),"userId",Matchers.equalTo(21));
	
	
}
	
	
}
