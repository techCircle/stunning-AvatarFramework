package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Utilities.BaseClass;
import Utilities.commonMethods;
import pages.PIMPage;

public class commonMethodsTestDemo extends commonMethods {
	


	@Test
	public void demo() {

		WebElement loginInputBox = BaseClass.getDriver().findElement(By.xpath(""));
		
		//instead of this
//				loginInputBox.clear();
//				loginInputBox.sendKeys("username");
			// you have this	
		commonMethods.sendKeys(loginInputBox, "username");
		//////////////////////////////////////////////////////////////////////////////		

		// simplified the thread.sleep hard wait
		commonMethods.wait(3);
		
		
		//click on radio or checkbox when value is given
		
		List<WebElement> radioButton = BaseClass.getDriver().findElements(By.xpath(""));
		commonMethods.clickRadioOrCheckboxByValue(radioButton, "Male");
		//////////////////////////////////////////////////////////////////////////////		

		
		 //using window handle method
		
		//first click and open the window link
		
		commonMethods.switchToChildWindow(BaseClass.getDriver().getWindowHandle());
		
		commonMethods.click(loginInputBox);
		commonMethods.sendKeys("Address Name", loginInputBox);
		
		
		
		
		
		
		
		
	
	
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		String beerName = commonMethods.generateBeer();
		String address = commonMethods.generateAddress();
		String email = commonMethods.generateEmail();
		
		System.out.println(beerName);
		System.out.println(address);
		System.out.println(email);
		
		commonMethods.takeScreenShot();

		
		

	}
	
	
	/*
	 * 59739
		Schmeler Cliff
		Inesberg
		Venezuela
	 */
	
	
	
	

}
