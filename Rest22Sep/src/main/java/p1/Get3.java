package p1;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class Get3 {

	public static void main(String[] args) {
		baseURI="https://reqres.in";
		
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("/api/unknown")
		.then()
		.assertThat().statusCode(200).log().all();
		
		
	}
}
