package demo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class Request3 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification a = RestAssured.given();
		
		a.request(Method.GET,"/api/users?page=2");
	}
}
