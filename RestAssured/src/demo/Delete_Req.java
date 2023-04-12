package demo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_Req 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a = RestAssured.given();
		Response res = a.request(Method.DELETE,"/api/users/2");
		res.prettyPrint();
		int z = res.getStatusCode();
		System.out.println(z);
		String zz = res.getStatusLine();
		System.out.println(zz);
		long zzz = res.getTime();
		System.out.println(zzz);
	}
}
