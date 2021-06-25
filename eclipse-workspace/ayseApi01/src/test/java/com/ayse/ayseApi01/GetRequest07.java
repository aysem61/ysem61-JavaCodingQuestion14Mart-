package com.ayse.ayseApi01;


import static org.junit.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.*;
import TestClasses.TestBaseHerOku;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequest07 extends TestBaseHerOku {
	
	/*
	  When
	  		I send a GET request to REST API URL https://restful-booker.herokuapp.com/booking/5
	  Then
		  HTTP Status Code should be 200
		  And response content type is “application/JSON”
		  And response body should be like;
		  {
		  	"firstname": "Susan",
		    "lastname": "Smith",
		    "totalprice": 254,
		    "depositpaid": false,
		    "bookingdates": { "checkin": "2019-07-21",
		                      "checkout":"2020-02-02" }
		  }
	 */
	@Test
	public void get07() {
		
		spec.pathParams("bookingName","booking","id","5" );
		
		
		Response response=given().spec(spec).when().get("/{bookingName}/{id}");
		
		response.prettyPrint();
		
		/*response.then().assertThat().statusCode(200).contentType(ContentType.JSON)
		.body("firstname",Matchers.equalTo("Eric")
				,"lastname",Matchers.equalTo("Smith"),
				"bookingdates.checkin",Matchers.equalTo("2015-12-19"),
				"bookingdates.checkout",Matchers.equalTo("2019-03-29"));
				
				*/
		
		JsonPath json=response.jsonPath();
		
		assertEquals(200,response.getStatusCode());
		
		//assertEquals("James",json.getString("firstname"));
		//assertEquals("Wilson",json.getString("lastname"));
		//assertEquals(933,json.getInt("totalprice"));
		//assertEquals(true,json.getBoolean("depositpaid"));
		//assertEquals(true,json.getString("bookingdates.checkin"));
		//assertEquals("2021-03-07",json.getString("bookingdates.checkin"));
		//assertEquals("2021-03-13",json.getString("bookingdates.checkout"));
		
		SoftAssert softAssert=new SoftAssert();
		
		softAssert.assertEquals(json.getString("firstname"), "James");
		
		softAssert.assertEquals(json.getString("lastname"), "Wilson");
		
		softAssert.assertEquals(json.getInt("totalprice"), 933);
		
		softAssert.assertEquals(json.getBoolean("depositpaid"), false);
		
		softAssert.assertEquals(json.getString("bookingdates.checkout"), "021-03-07");
		
		softAssert.assertEquals(json.getString("bookingdates.checkin"), "2021-03-13");
		
		softAssert.assertAll();
	}
	
	
	
}
