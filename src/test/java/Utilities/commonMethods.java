package Utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class commonMethods {

	public static void sendKeys(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public static void wait(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void TINY_WAIT() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void SMALL_WAIT() {
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void MEDIUM_WAIT() {
		try {
			Thread.sleep(15 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void LARGE_WAIT() {
		try {
			Thread.sleep(30 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void x_LARGE_WAIT() {
		try {
			Thread.sleep(60 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void MAJOR_WAIT() {
		try {
			Thread.sleep(120 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void HUGE_WAIT() {
		try {
			Thread.sleep(360 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void ULTIMATE_WAIT() {
		try {
			Thread.sleep(600 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// click radio or checkbox by value
	public static void clickRadioOrCheckboxByValue(List<WebElement> radioOrCheckbox, String value) {
		String actualValue;
		for (WebElement eachElement : radioOrCheckbox) {
			actualValue = eachElement.getText();
			if (eachElement.isEnabled() && actualValue.equals(value)) {
				eachElement.click();
				break;
			}
		}
	}
	
	
	public static void selectDropDownByVisibleText(WebElement element, String textToSelect) {
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement faz : options) {
				if (faz.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	

}
