package api.endpoints;
import static io.restassured.RestAssured.*;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//UserEndPoints.java
//Created to perform Create, Read, Update, Delete requests to the user API
//These methods we are calling from the test case data

public class UserEndPoints {

	public static Response createUser(User payload){	//return type is response
		
		Response response = given()	//type of the variable is response and the variable name is also response
			.contentType(ContentType.JSON) //JSON --> Java Script Object Notation
			.accept(ContentType.JSON)
			.body(payload)
		.when()
			.post(Routes.post_url);
		
		return response;
		
		}
	
	public static Response readUser(String userName){	//return type is response
		
		Response response = given()	//type of the variable is response and the variable name is also response
			.pathParam("username", userName)	//"userName" --> path parameter, userName --> path parameter value
		.when()
			.get(Routes.get_url);
		
		return response;
		
		}
	
	public static Response updateUser(String userName, User payload){	//return type is response
		
		Response response = given()	//type of the variable is response and the variable name is also response
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.pathParam("username", userName)
			.body(payload)
		.when()
			.put(Routes.update_url);
		
		return response;
		
		}
	
	public static Response deleteUser(String userName){	//return type is response
		
		Response response = given()	//type of the variable is response and the variable name is also response
			.pathParam("username", userName)	//"userName" --> path parameter, userName --> path parameter value
		.when()
			.delete(Routes.delete_url);
		
		return response;
		
		}

}
