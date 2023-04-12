package demo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Request2 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification a = RestAssured.given();
		
		Response res = a.request(Method.GET,"/api/users/2");
		
		System.out.println(res.asString());
		int statusCode = res.getStatusCode();
		System.out.println(statusCode);
		String statusLine = res.getStatusLine();
		System.out.println(statusLine);
		long time = res.getTime();
		System.out.println(time);
	}
}
