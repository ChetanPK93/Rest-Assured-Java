package restAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequst 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a = RestAssured.given();
		Response res = a.request(Method.GET,"/api/users/2");
		String response = res.asString();
		JsonPath path = new JsonPath(response);
		String value = path.getString("support.text");
		System.out.println(value);
		
	}
}
