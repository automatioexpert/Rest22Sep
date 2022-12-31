package p1;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
public class Post1 {

	String body="{\r\n"
			+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
			+ "    \"password\": \"pistol\"\r\n"
			+ "}";
	
	public static void main(String[] args) {
		baseURI="https://reqres.in/api";
		given()
		.contentType(ContentType.JSON)
		.when()
		.post("/api/register")
		.then().log()
		.all()
		.assertThat()
		.statusCode(201);
		
		
	}
}
