package pojo2;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Req 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a = RestAssured.given();
		Response res = a.request(Method.GET, "/api/unknown/2");
		
		Single_Resource single = res.as(Single_Resource.class);
		
		Support s = single.getSupport();
		String text = s.getText();
		System.out.println(text);
		
		Data d = single.getData();
		String name = d.getName();
		System.out.println(name);
		
	}
}
