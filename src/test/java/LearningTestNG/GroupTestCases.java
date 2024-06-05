package LearningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTestCases {
	
	
	@Test(groups = "funcTest")
	public void testPrintMessage() {
		
		System.out.println("Inside test Print Message");	
	}
	
	@Test(groups = "smokeTest")
	public void saluteCohort18Message() {
		System.out.println("Inside salutation message");	
		
	}
	
	@Test(groups = {"funcTest", "smokeTest"})
	public void testingExitMessage() {
		System.out.println("Inside exit message");	
	
	}
	
	// taging or grouping
	

}
