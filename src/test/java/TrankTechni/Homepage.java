package TrankTechni;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Homepage {

WebDriver driver = new ChromeDriver ();
	
	@Test(priority=1)
	//@BeforeTest
	void homepage() 
	{
		
		driver.get("https://www.tranktechnologies.com/about");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=2)
	void Exploremore()
	{
		driver.findElement(By.xpath("(//a[@href=\"https://www.tranktechnologies.com/web-development-company-in-india\"])[1]")).click();
	}

	@Test(priority=3)

	void Redirect () 
	{
		
		driver.findElement(By.xpath("//img[@src=\"https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp\"]")).click();
	}
	@Test(priority=4)
	//@BeforeTest
	void Arrrow () {
		
		Actions actions = new Actions(driver);
		WebElement A1 = driver.findElement(By.xpath("(//button[@class=\"slick-next slick-arrow\"])[2]"));
		actions.moveToElement(A1).perform();
			}
	@Test(priority=5)
	void Knowmore() {
	driver.findElement(By.xpath("//a[normalize-space()='Know More']")).click();
}
	@Test(priority=6)

	void Redirect2 () {
		
		driver.findElement(By.xpath("//img[@src=\"https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp\"]")).click();
		}	
	@Test(priority=7)
	void GetinTouch() {
		driver.findElement(By.xpath("//a[@href=\"/contact-us\"]")).click();
		
	}
		 @AfterClass
		    public void close()
		    {
		        driver.quit();

   }
}

