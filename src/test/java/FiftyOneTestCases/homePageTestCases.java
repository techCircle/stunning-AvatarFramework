package FiftyOneTestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.commonMethods;

public class homePageTestCases extends commonMethods {

	@Test
	public void homePageWithThreeSlidersOnly() {
		hP.clickOnNavOption("Shop");
		commonMethods.click(sP.homeButton);
		Assert.assertTrue(hP.sliders.size() == 3);
	}

	@Test
	public void homePageWithThreeArrivalsOnly() {
		hP.clickOnNavOption("Shop");
		commonMethods.click(sP.homeButton);
		Assert.assertTrue(hP.arrivals.size() == 3);
	}

	@Test
	public void homePageImagesInArrivalsShouldNavigate() {
		
		hP.clickOnNavOption("Shop");
		commonMethods.click(sP.homeButton);
		Assert.assertTrue(hP.arrivals.size() == 3);
		commonMethods.click(hP.firstArrival);
		commonMethods.click(pP.addToBasketButton);		
		Assert.assertTrue(commonMethods.getText(pP.viewBasketMessage).contains("has been added to your basket"));

	}

}
