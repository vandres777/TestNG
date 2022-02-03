package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SampleTestNGProgram {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.mercadolibre.com.co/");

	}

	@AfterTest
	public void tittleTest() {
		String title = driver.getTitle();
		System.out.println("el titulo de la pagina es "+title);

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}


