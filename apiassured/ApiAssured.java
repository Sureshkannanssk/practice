package org.apiassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class ApiAssured {

	@Test
	public void getUrl() {

		RestAssured r = new RestAssured();
		Response response = r.get("https://reqres.in/api/users/2");
		Response post = r.post();
	//	System.out.println(post);

		String asString = response.asString();
	//	System.out.println(asString);
		String asString2 = response.getBody().asString();
	//	System.out.println(asString2);
		int statusCode = response.getStatusCode();
	//	System.out.println(statusCode);
		String statusLine = response.getStatusLine();
	//	System.out.println(statusLine);
		String header = response.getHeader("content-type");
	//	System.out.println(header);
		Headers header1 = response.getHeaders();
		System.out.println(header1);
		long time = response.getTime();
		System.out.println(time);
		
	}

}
