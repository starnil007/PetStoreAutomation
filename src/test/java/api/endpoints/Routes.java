package api.endpoints;

/* Swagger URI: https://petstore.swagger.io/
 * Create User(Post): https://petstore.swagger.io/v2/user
 * Get User(Get): https://petstore.swagger.io/v2/user/{username}
 * Update User(Put): https://petstore.swagger.io/v2/user/{username}
 * Delete User(Delete): https://petstore.swagger.io/v2/user/{username}
 */

public class Routes {

	public static String base_url = "https://petstore.swagger.io/v2";

	// User module

	public static String post_url = base_url + "/user"; // First we will create an user then use it in the other request
	public static String get_url = base_url + "/user/{username}"; // The users are dynamic so cannot be hardcoded
	public static String update_url = base_url + "/user/{username}";
	public static String delete_url = base_url + "/user/{username}";

	// Pet module

	// Here we will create pet module URLs

	// Store module

	// Here we will create store module URLs

}
