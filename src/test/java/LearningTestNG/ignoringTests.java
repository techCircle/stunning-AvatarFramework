package LearningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class ignoringTests {
	
	
	
	@Test(enabled = true)
	
	public void test1() {
		System.out.println("coming from test1");
	}
	
		// this ignoring method is recommended to use in testng
	@Test(enabled=true)   //attributes key  value pair
	public void test2() {
		System.out.println("coming from test2");
	}
	
	

}
