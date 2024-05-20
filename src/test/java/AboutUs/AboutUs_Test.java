package AboutUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutUs_Test
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://www.tranktechnologies.com/"); 
	}
	@Test(priority=1)
	void Access_AboutUs() 	
	{
		WebElement AboutUs =driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='About us']"));
		AboutUs.click();
	}
	@Test(priority=2)
	void IndustriesWeServe() throws InterruptedException 	
	{
		WebElement Next =driver.findElement(By.xpath("//button[@aria-label='Next']"));
		Next.click();
		Thread.sleep(2000);
		WebElement Previous =driver.findElement(By.xpath("//button[@aria-label='Previous']"));
		Previous.click();
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}
