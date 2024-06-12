package Utilities;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class commonMethods extends PageInitializer {

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

	public static void selectDropDownByIndex(WebElement element, int indexToSelect) {
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			if (indexToSelect >= 0 && indexToSelect < options.size()) {
				select.selectByIndex(indexToSelect);
			} else {
				throw new IndexOutOfBoundsException("Index: " + indexToSelect + ", Size: " + options.size());
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	// alerts

	public static void acceptAlert() {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	public static void dismissAlert() {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static String alertGetText() {
		String a = null;
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			a = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		return a;
	}

	// iframe by index
	public static void switchToIFrameByIndex(int iFrameIndex) {
		try {
			BaseClass.getDriver().switchTo().frame(iFrameIndex);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	// iframe by element
	public static void switchToIFrameByElement(WebElement iframeElement) {
		try {
			BaseClass.getDriver().switchTo().frame(iframeElement);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	// iframe by name
	public static void switchToIFrameByName(String iFrameName) {
		try {
			BaseClass.getDriver().switchTo().frame(iFrameName);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	// the user should have already opened or hae clicked a link where a new
	// tab//window opened
	// clicked

	public static void switchToChildWindow(String currentWindow) {
		try {
			// get all the window handles
			Set<String> windowHandles = BaseClass.getDriver().getWindowHandles();
			for (String eachHandle : windowHandles) {
				if (!eachHandle.equals(currentWindow)) {
					BaseClass.getDriver().switchTo().window(eachHandle);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Exception occured while switching to child window " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(Constants.explicitWaitTime));
		return wait;
	}

	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	public static void click(WebElement element) {
		waitForClickability(element).click();
	}
	
	public static String getText(WebElement element) {
		return waitForVisibility(element).getText();
	}

	public static void sendKeys(String keys, WebElement element) {
		waitForVisibility(element).sendKeys(keys);
	}

	public static Actions actionObject() {
		Actions action = new Actions(BaseClass.getDriver());
		return action;
	}

	public static void hoverOverMouse(WebElement element) {
		actionObject().moveToElement(element).build().perform();
	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		actionObject().dragAndDrop(source, target).build().perform();
		;
	}

	public static void doubleClick(WebElement element) {
		actionObject().doubleClick(element).build().perform();
	}

	public static Faker getFakerObject() {
		Faker faker = new Faker();
		return faker;
	}

	public static String generateEmail() {
		FakeValuesService fakeValueService = new FakeValuesService(new Locale("en-GB"), new RandomService());
		return fakeValueService.bothify("????##@gmail.com");
	}

	public static String generateAddress() {
		String streetName = getFakerObject().address().streetName();
		String number = getFakerObject().address().buildingNumber();
		String city = getFakerObject().address().city();
		String country = getFakerObject().address().country();
		return String.format("%s\n%s\n%s\n%s", number, streetName, city, country);
	}

	public static String generateBeer() {
		return getFakerObject().beer().name();
	}

	public static String chuckNorrisFact() {
		return getFakerObject().chuckNorris().fact();
	}

	public static void takeScreenShot() {
		try {	
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH-mm-ss");
			LocalDateTime now = LocalDateTime.now();
			String dateString = now.format(formatter);
			// cast webdriver to screenshot object
			TakesScreenshot screenshot = (TakesScreenshot) BaseClass.getDriver();
			// get the screenthos as an autfile
			File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

			// define destination path with the unique name
			String desFilePath = "src/test/resources/screenshots/image" + dateString + ".png";
			File destFile = new File(desFilePath);
//		FileUtils.copyFile(srcFile, destFile);
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public static String takeScreenShot64() {
	    TakesScreenshot takesScreenshot = (TakesScreenshot) BaseClass.getDriver();
	    String base64code = takesScreenshot.getScreenshotAs(OutputType.BASE64);

	    ByteArrayInputStream bis = null;
	    try {
	        // Convert Base64 string to byte array
	        byte[] decodedBytes = Base64.getDecoder().decode(base64code);
	        bis = new ByteArrayInputStream(decodedBytes);
	        BufferedImage image = ImageIO.read(bis);

	        // Generate a timestamp-based file name
	        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
	        String filePath = "src/test/resources/htmlReport/screenshot_" + timestamp + ".png";

	        // Ensure the directory exists
	        File outputFile = new File(filePath);
	        outputFile.getParentFile().mkdirs();

	        // Save the screenshot to the specified path
	        ImageIO.write(image, "png", outputFile);

	    } catch (IOException e) {
	        System.err.println("Error while saving screenshot: " + e.getMessage());
	    } finally {
	        if (bis != null) {
	            try {
	                bis.close();
	            } catch (IOException e) {
	                System.err.println("Error while closing ByteArrayInputStream: " + e.getMessage());
	            }
	        }
	    }

	    return base64code;
	}

}
