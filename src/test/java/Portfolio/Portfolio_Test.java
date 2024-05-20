package Portfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Portfolio_Test 
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://www.tranktechnologies.com/"); 
	}
	@Test(priority=1)
	void Access_Portfolio() 	
	{
		WebElement Portfolio =driver.findElement(By.xpath("//a[normalize-space()='Portfolio']"));
		Portfolio.click();
	}
	@Test(priority=2)
	void OurProjects() 	
	{
		WebElement ICS_Homework =driver.findElement(By.xpath("//a[@href='https://www.icshomework.in/']"));
		ICS_Homework.click();
		driver.navigate().back();
		WebElement WingsPharma =driver.findElement(By.xpath("//a[@href='https://www.wingspharma.com/']"));
		WingsPharma.click();
		driver.navigate().back();
		WebElement ArenaAnimation =driver.findElement(By.xpath("//a[@href='https://arenasonipat.com/']"));
		ArenaAnimation.click();
		driver.navigate().back();
		WebElement Home360 =driver.findElement(By.xpath("//a[@href='https://home360stores.com/']"));
		Home360.click();
		driver.navigate().back();
		WebElement ClubMeetings =driver.findElement(By.xpath("//div[5]//div[1]//a[1]"));
		ClubMeetings.click();
		WebElement CordsCables =driver.findElement(By.xpath("//a[@href='http://stockyard.cablecommunity.com/']"));
		CordsCables.click();
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}
