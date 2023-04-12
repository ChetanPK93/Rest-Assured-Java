package pojo3;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Request 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a = RestAssured.given();
		Response res = a.request(Method.GET, "/api/users?page=2");
		
		List_Users l = res.as(List_Users.class);
		
		List<Data> all_data = l.getData();
		
		for (Data data : all_data) 
		{
			String name = data.getLast_name();
			String fName = data.getFirst_name();
			System.out.println(fName);
		}
	}
}
