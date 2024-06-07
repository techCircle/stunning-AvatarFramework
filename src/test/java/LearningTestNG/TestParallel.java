package LearningTestNG;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TestParallel {

	@Test
	public void method1() {
		BaseClass.getDriver();
		System.out.println(BaseClass.getDriver().getTitle() + " this is coming from method1");
		//BaseClass.tearDown();
	}

	@Test
	public void method2() {
		BaseClass.getDriver();
		System.out.println(BaseClass.getDriver().getCurrentUrl() + " this is coming from method2");
	//	BaseClass.tearDown();
	}


}
