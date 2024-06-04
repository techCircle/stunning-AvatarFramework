package LearningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	
	@Test
	public void initialEnvironment() {
		//AssertJUnit.fail();
		System.out.println("From the initial method");
	}
	
	@Test(dependsOnMethods = {"initialEnvironment"})
	public void testSaluteCohort18() {
		System.out.println("From Test Salute Cohort 18 method");
	}
	
	@Test(dependsOnMethods = {"testSaluteCohort18"})
	public void testPrintMessage() {
		System.out.println("From the TestPrint Message method");
	}

}
