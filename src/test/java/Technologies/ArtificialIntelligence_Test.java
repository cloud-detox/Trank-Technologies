package Technologies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArtificialIntelligence_Test 
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://www.tranktechnologies.com/"); 
	}
	@Test(priority=1)
	void Access_Technologies() 	
	{
		WebElement Technologies =driver.findElement(By.xpath("(//li[@class='drop_down'])[2]"));
		Technologies.click();
	}
	@Test(priority=2)
	void ArtificialIntelligence() 	
	{
		WebElement AI =driver.findElement(By.xpath("//strong[normalize-space()='Artificial Intelligence']"));
		Actions a= new Actions(driver);
		a.moveToElement(AI).click().perform();
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}
