package TestCases;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.commonMethods;

public class TestCasesForProject extends commonMethods {
	

	@Test
	public void verifyUserIsActive() {
		commonMethods.TINY_WAIT();
		pimP.PIMButton.click();
		commonMethods.TINY_WAIT();
		pimP.employeeNameInputField.sendKeys(BaseClass.getProperty("employeeName"));
		pimP.supervisorNameInputField.sendKeys(BaseClass.getProperty("supervisorName"));
		
		
	}

//	@Test
//	public void verifyUserIsDisabled() {
//
//
//		
//	}
//
//	@Test
//	public void verifyUserCanBeAdded() {
//
//		
//	}
	
	

}
