package com.ayse.ayseApi01;
import org.hamcrest.Matchers;
import org.junit.Test;

import TestClasses.TestBaseDummy;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojo.Data;


public class PostRequest01 extends TestBaseDummy{
	
	/*
 	When
 	  	I send a POST Request to the Url http://dummy.restapiexample.com/api/v1/create
 	  	by using the following Request Body {
											    "name":"bill",
											    "salary":1000,
											    "age":35,
											    "department": "it"
											}
 	 Then
 	  	Status code is 200
 	  	And response body should be like { "status": "success",
 "data": {
 "name": "bill",
 "salary": "1000",
 "age": "33",
 "department": "it"
										    },
 "message": "Successfully! Record has been added."
										 }
*/
    @Test
	public void post01() {
		//first one is path name "version" second on eis path "v1"
		spec.pathParams("api","api","version","v1","create","create");
		//spec.pathParam("api","api").pathParam("version","v1").pathParam("create","create")
//		Data data=new Data();		
//		
//		data.setAge(35);
//		data.setDepartment("it");
//		data.setName("bill");
//		data.setSalary(1000);
		
		
		//Data data=new Data( 0,35, 1000, "Bill", "it");
		
		HashMap<String ,Object> data=new HashMap<String, Object>();
		
		data.put("age", 35);
		data.put("salary", 1000);
		data.put("name", "Bill");
		data.put("department", "it");
		
		
		Response response=given().contentType(ContentType.JSON).spec(spec).
				body(data).when().post("/{api}/{version}/{create}");
		response.prettyPrint();
		
		assertEquals(200,response.getStatusCode());
		
		JsonPath json=response.jsonPath();
		
		assertEquals("Bill",json.getString("data.name"));
		
		assertEquals("it",json.get("data.department"));
		
		assertEquals(35,json.getInt("data.age"));
		
		response.then().assertThat().statusCode(200).and()
		.body("data.age",Matchers.equalTo(35));
		
	}
	
}