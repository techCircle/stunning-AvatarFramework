package LearningTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	
	@Test
	@Parameters({"username", "password"})
	public void login(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	@Parameters({"usernameAdmin", "passwordAdmin"})
	public void loginAdmin(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	

}
