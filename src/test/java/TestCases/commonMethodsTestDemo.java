package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.commonMethods;

public class commonMethodsTestDemo {

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

		
		
		
		
		
		
		
		
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
