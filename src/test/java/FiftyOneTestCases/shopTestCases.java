package FiftyOneTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Utilities.ListenersNG;
import Utilities.commonMethods;


@Listeners(ListenersNG.class)
public class shopTestCases extends commonMethods{
	
	@Test(groups={"smoke", "Regression"})
	public void ShopFilterByPriceFunctionality() {
		System.out.println("Testing one method from shop");
	}

}
