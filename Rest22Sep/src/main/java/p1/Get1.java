package p1;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class Get1 {

	public static void main(String[] args) {

		baseURI = "https://www.google.com";

		Response response = given().get();

		int status = response.getStatusCode()	;
		System.out.println(status);
	

	}

}
