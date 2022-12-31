package p1;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;

public class Post3 {

	public static void main(String[] args) {
	
		Map<String,String> body = new HashMap<String,String>();
		body.put("name", "vv");
		body.put("job", "LEADER");
		
baseURI="https://reqres.in/";
given()
//.contentType(ContentType.JSON)
.when()
.body("body.toString()")
.post("api/users")
.then().log()
.all()
.assertThat()
.statusCode(201);

		
	}
}
