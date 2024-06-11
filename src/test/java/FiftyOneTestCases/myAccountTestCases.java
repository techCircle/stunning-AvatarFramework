package FiftyOneTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.commonMethods;

public class myAccountTestCases extends commonMethods {
	
	
	@Test
	public void MyAccountsDashboard(){
		hP.clickOnNavOption("My Account");
		mAp.attemptToLoginIn(BaseClass.getProperty("automationUsername"), BaseClass.getProperty("automationPassword"));
		AssertJUnit.assertTrue(mAp.signOutButton.isDisplayed());
		hP.clickOnNavOption("My Account");
		AssertJUnit.assertTrue(mAp.signOutButton.isDisplayed());
	}

}
