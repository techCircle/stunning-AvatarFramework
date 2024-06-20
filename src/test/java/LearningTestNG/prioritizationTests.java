package LearningTestNG;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class prioritizationTests {
	
	@Test(priority= 1)
	public void method1() {
		BaseClass.getDriver();
		System.out.println(BaseClass.getDriver().getTitle() + " this is coming from method1");
		//BaseClass.tearDown();
	}

	@Test(priority= 2)
	public void method2() {
		BaseClass.getDriver();
		System.out.println(BaseClass.getDriver().getCurrentUrl() + " this is coming from method2");
	//	BaseClass.tearDown();
	}

}
