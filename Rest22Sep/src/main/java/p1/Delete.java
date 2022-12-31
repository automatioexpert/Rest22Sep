package p1;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
public class Delete {

	public static void main(String[] args) {
		
	baseURI="https://reqres.in/";
	
	given()
	.contentType(ContentType.JSON)
	.when()
	.put("api/users/2")
	.then()
	.log()
	.all()
	.assertThat()
	.statusCode(200).log().all();	
	
		
	}
}
