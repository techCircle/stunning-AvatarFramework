package FiftyOneTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Utilities.ListenersNG;
import Utilities.RetryAnalyzer;
import Utilities.commonMethods;

@Listeners(ListenersNG.class)
public class myAccountRegistrationTestCases extends commonMethods{
	
	
	@Test(groups={"smoke", "Regression"})
	public void RegistrationSignIn() {
		System.out.println("Testing one method from account registration");
		AssertJUnit.assertTrue(false);
	}


}
