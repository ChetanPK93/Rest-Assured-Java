package demo;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_req_1 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a = RestAssured.given();
		
		JSONObject hi = new JSONObject();
		hi.put("name", "nandan");
		hi.put("job", "test engg");
		a.contentType(ContentType.JSON);
		a.body(hi.toJSONString());
		
		Response res = a.request(Method.POST, "/api/users");
		res.prettyPrint();
		//System.out.println(res.asString());
	}
}
