package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {

	public static WebDriver driver; // declaring webdriver at class level

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (BaseClass.getProperty("browser")) {
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "edge-private":
				EdgeOptions edgeOptions = new EdgeOptions();
				edgeOptions.addArguments("--inprivate");
				driver = new EdgeDriver(edgeOptions);
				break;
			case "chrome-private":
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--incognito");
				driver = new ChromeDriver(chromeOptions);
				break;

			}
			driver.get(BaseClass.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}

		return driver;
	}

	public static Properties prop; // declared the properties object.. the value of this prop at this line is NULL

	static {
		try {
			// what file to read
			// read the file into java, and finds the file using
			String filePath = "src/test/resources/propertiesFiles/configuration.properties";

			FileInputStream fis = new FileInputStream(filePath);

			prop = new Properties();

			prop.load(fis);
			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}