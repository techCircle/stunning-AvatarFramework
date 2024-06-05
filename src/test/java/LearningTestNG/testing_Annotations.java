package LearningTestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;



public class testing_Annotations {
	
	
	//TEST NG
	
	@BeforeSuite
	public void BeforeSuite() {
		 System.out.println("Before Suite");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void Test3() {
		System.out.println("Test3");
	}
	
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
	
	
	
	//JUNIT
//	@Before
//	@After
//	@Test

}
