package FiftyOneTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.commonMethods;

public class homePageTestCases extends commonMethods {

	@Test
	public void homePageWithThreeSlidersOnly() {
		hP.clickOnNavOption("Shop");
		commonMethods.click(sP.homeButton);
		AssertJUnit.assertTrue(hP.sliders.size() == 3);
	}

	@Test
	public void homePageWithThreeArrivalsOnly() {
		hP.clickOnNavOption("Shop");
		commonMethods.click(sP.homeButton);
		AssertJUnit.assertTrue(hP.arrivals.size() == 3);
	}

	@Test
	public void homePageImagesInArrivalsShouldNavigate() {
		
		hP.clickOnNavOption("Shop");
		commonMethods.click(sP.homeButton);
		AssertJUnit.assertTrue(hP.arrivals.size() == 3);
		commonMethods.click(hP.firstArrival);
		commonMethods.click(pP.addToBasketButton);		
		AssertJUnit.assertTrue(commonMethods.getText(pP.viewBasketMessage).contains("has been added to your basket"));

	}
	
	//3 out of 18

}
