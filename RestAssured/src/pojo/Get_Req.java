package pojo;

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
		Response res = a.request(Method.GET, "/api/users/2");
		Single_user single = res.as(Single_user.class);
		Data data = single.getData();
		int id = data.getId();
		System.out.println(id);
		String last_name = data.getLast_name();
		System.out.println(last_name);
	}
}
