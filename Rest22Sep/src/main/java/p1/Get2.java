package p1;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get2 {
	public static void main(String[] args) {
		
	RestAssured.baseURI="https://reqres.in/api";
	
		Response response =given()
		.get("/users?page=2");
		
		response.prettyPrint();


		
		
	}

}
