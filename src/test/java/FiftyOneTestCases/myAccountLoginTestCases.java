package FiftyOneTestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Constants;
import Utilities.ListenersNG;
import Utilities.commonMethods;


@Listeners(ListenersNG.class)
public class myAccountLoginTestCases extends commonMethods {

	
	@Test
	public void  LogInWithWalidUsernameAndPassword() {
		hP.clickOnNavOption("My Account");
		mAp.attemptToLoginIn(BaseClass.getProperty("automationUsername"), BaseClass.getProperty("automationPassword"));
		AssertJUnit.assertTrue(mAp.signOutButton.isDisplayed());
	}
	
	
	@Test
	public void logInWithIncorrectUsernameIncorrectPassword() {
		hP.clickOnNavOption("My Account");
		mAp.attemptToLoginIn(BaseClass.getProperty("automationInvalidUsername"), BaseClass.getProperty("automationInvalidPassword"));
		AssertJUnit.assertTrue(commonMethods.getText(mAp.incorrectCredentialMessage).contains(Constants.invalidCredErroMessage));
	}
	
	
	
	
}
