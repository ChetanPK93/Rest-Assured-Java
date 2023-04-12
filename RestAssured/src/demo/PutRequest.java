package demo;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification a = RestAssured.given();
		
		JSONObject hi = new JSONObject();
		hi.put("name", "morpheus");
		hi.put("job", "zion");
		a.contentType(ContentType.JSON);
		a.body(hi.toJSONString());
		
		Response res = a.request(Method.PUT,"/api/users/2");
		res.prettyPrint();
	}
}