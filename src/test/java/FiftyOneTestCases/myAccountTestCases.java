package FiftyOneTestCases;

import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.ListenersNG;
import Utilities.commonMethods;

@Listeners(ListenersNG.class)
public class myAccountTestCases extends commonMethods {

	@Test(groups = {"Regression" })
	public void MyAccountsDashboard() {
		hP.clickOnNavOption("My Account");
		mAp.attemptToLoginIn(BaseClass.getProperty("automationUsername"), BaseClass.getProperty("automationPassword"));
		AssertJUnit.assertTrue(mAp.signOutButton.isDisplayed());
		hP.clickOnNavOption("My Account");
		AssertJUnit.assertTrue(mAp.signOutButton.isDisplayed());
	}

}
