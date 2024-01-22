package api.endpoints;
import static io.restassured.RestAssured.*;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//UserEndPoints.java
//Created to perform Create, Read, Update, Delete requests to the user API
//These methods we are calling from the test case data

public class UserEndPoints2 {
	
		// method created for getting URL's from the properties file
		static ResourceBundle getURL(){
			
			ResourceBundle routes = ResourceBundle.getBundle("routes"); //Loading properties file	//Name of the properties file
			return routes;
		}

	public static Response createUser(User payload){	//return type is response
		
		String post_url = getURL().getString("post_url");
		
		Response response = given()	//type of the variable is response and the variable name is also response
			.contentType(ContentType.JSON) //JSON --> Java Script Object Notation
			.accept(ContentType.JSON)
			.body(payload)
		.when()
			.post(post_url);
		
		return response;
		
		}
	
	public static Response readUser(String userName){	//return type is response
		
		String get_url = getURL().getString("get_url");
		
		Response response = given()	//type of the variable is response and the variable name is also response
			.pathParam("username", userName)	//"userName" --> path parameter, userName --> path parameter value
		.when()
			.get(get_url);
		
		return response;
		
		}
	
	public static Response updateUser(String userName, User payload){	//return type is response
		
		String update_url = getURL().getString("update_url");
		
		Response response = given()	//type of the variable is response and the variable name is also response
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.pathParam("username", userName)
			.body(payload)
		.when()
			.put(update_url);
		
		return response;
		
		}
	
	public static Response deleteUser(String userName){	//return type is response
		
		String delete_url = getURL().getString("delete_url");
		
		Response response = given()	//type of the variable is response and the variable name is also response
			.pathParam("username", userName)	//"userName" --> path parameter, userName --> path parameter value
		.when()
			.delete(delete_url);
		
		return response;
		
		}

}
