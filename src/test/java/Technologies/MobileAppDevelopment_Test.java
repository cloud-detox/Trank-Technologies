package Technologies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MobileAppDevelopment_Test 
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
	@Test(priority=3)
	void ReactNativeMobileAppDevelopment() throws InterruptedException 	
	{
		Actions a= new Actions(driver);
		WebElement MAD=driver.findElement(By.xpath("//li[@data-id=\"mobileApp\"]"));
		a.moveToElement(MAD).perform();
		driver.findElement(By.xpath("//a[@href=\"https://www.tranktechnologies.com/react-native-mobile-app-development\"]")).click();
	}
	@Test(priority=4)
	void EnterpriseMobileAppDevelopment() throws InterruptedException 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();		
		WebElement MAD=driver.findElement(By.xpath("//li[@data-id=\"mobileApp\"]"));
		a.moveToElement(MAD).perform();
		driver.findElement(By.xpath("//a[@href=\"https://www.tranktechnologies.com/enterprise-mobile-app-development\"]")).click();	
	}
	@Test(priority=5)
	void XamarinMobileAppDevelopment() throws InterruptedException 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();		
		WebElement MAD=driver.findElement(By.xpath("//li[@data-id=\"mobileApp\"]"));
		a.moveToElement(MAD).perform();
		driver.findElement(By.xpath("//a[@href=\"https://www.tranktechnologies.com/xamarin-mobile-app-development\"]")).click();	
	}
	@Test(priority=6)
	void KotlinMobileAppDevelopment() throws InterruptedException 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();		
		WebElement MAD=driver.findElement(By.xpath("//li[@data-id=\"mobileApp\"]"));
		a.moveToElement(MAD).perform();
		driver.findElement(By.xpath("//a[@href=\"https://www.tranktechnologies.com/kotlin-mobile-app-development\"]")).click();	
	}
	@Test(priority=7)
	void FlutterMobileAppDevelopment() throws InterruptedException 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();		
		WebElement MAD=driver.findElement(By.xpath("//li[@data-id=\"mobileApp\"]"));
		a.moveToElement(MAD).perform();
		driver.findElement(By.xpath("//a[@href=\"https://www.tranktechnologies.com/flutter-mobile-app-development\"]")).click();	
	}
	@Test(priority=8)
	void IonicAppDevelopment() throws InterruptedException 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();		
		WebElement MAD=driver.findElement(By.xpath("//li[@data-id=\"mobileApp\"]"));
		a.moveToElement(MAD).perform();
		driver.findElement(By.xpath("//a[@href=\"https://www.tranktechnologies.com/ionic-mobile-app-development\"]")).click();	
	}
	@Test(priority=9)
	void SwiftAppDevelopment() throws InterruptedException 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();		
		WebElement MAD=driver.findElement(By.xpath("//li[@data-id=\"mobileApp\"]"));
		a.moveToElement(MAD).perform();
		driver.findElement(By.xpath("//a[@href=\"https://www.tranktechnologies.com/swift-mobile-app-development\"]")).click();	
	}
	@Test(priority=10)
	void AppointmentBookingDevelopment() throws InterruptedException 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();		
		WebElement MAD=driver.findElement(By.xpath("//li[@data-id=\"mobileApp\"]"));
		a.moveToElement(MAD).perform();
		driver.findElement(By.xpath("//a[@href=\"https://www.tranktechnologies.com/appointment-booking-development\"]")).click();	
	}
	@Test(priority=11)
	void MobileAppDevelopment() 	
	{
		WebElement Technologies =driver.findElement(By.xpath("(//li[@class='drop_down'])[2]"));
		Technologies.click();
		WebElement MAD =driver.findElement(By.xpath("//li[@data-id=\"mobileApp\"]"));
		MAD.click();
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}
