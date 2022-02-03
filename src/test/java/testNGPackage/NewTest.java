package testNGPackage;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
class NewTest {

    public WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
    	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.mercadolibre.com.co/");

    }

    @Test
    public void main() throws InterruptedException {
    	driver.findElement(By.name("as_word")).sendKeys("monitor");
		driver.findElement(By.xpath("//button/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Monitor gamer curvo Asus TUF Gaming VG24VQ led 23.6 \" negro 100V/240V")).click();
		
		/*String expectedTitle = "Mercado Libre Colombia - Envíos Gratis en el día";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);*/

    }
    

    @AfterMethod
    public void afterMethod() {
      //  driver.quit();
    }

}

