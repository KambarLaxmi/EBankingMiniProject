package PageObjects;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ConfigReader;

public class BaseTest {

	// public String baseURL = "https://demo.guru99.com/v4/index.php";
	// public String userName = "mngr531165";
	// public String password = "manypUm";
	public static WebDriver driver;
	public static Logger logger;
	public Properties prop;
	public ConfigReader confiReader;

	@BeforeClass
	public void setUp() throws IOException {
		BasicConfigurator.configure();
		logger = Logger.getLogger("EBankingProject");
		PropertyConfigurator.configure(
				"C:\\Users\\kamba\\Desktop\\2023SeleniumPractice\\EBankingProject\\src\\test\\resources\\log4j.properties");

		prop = ConfigReader.ConfigRead(prop);

		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriverPath"));
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("baseURL"));

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
