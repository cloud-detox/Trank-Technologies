package Technologies_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MobileAppDevelopment {
	String driverPath = "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver=new ChromeDriver();
	
	@BeforeTest
	void navigateTo() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
	    driver.get("https://www.tranktechnologies.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}
	@AfterTest
	void exit() {
		driver.quit();
	}
	@Test(priority=1)
	void Mobiledropdown() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement mob=driver.findElement(By.xpath("//li[@data-id='mobileApp']//a"));
		if(mob.isDisplayed() && mob.isEnabled())
		{
			Actions act=new Actions(driver);
			act.moveToElement(mob).perform();
			Thread.sleep(2000);
			
		}
		else
		{
			System.out.println("MobileApp Development dropdown is either not displayed or not enabled");
		}
	}
	@Test(priority=2)
	void ReactApp() throws InterruptedException {	
		WebElement rea=driver.findElement(By.xpath("//a[contains(text(),'React Native Mobile App Development')]"));
		if(rea.isDisplayed() && rea.isEnabled())
		{
			rea.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("React Mobile App Development is either not displayed or not enabled");
		}
		
	}
	@Test(priority=3)
	void XamarineApp() throws InterruptedException {
		WebElement ver =driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		Actions act2=new Actions(driver);
		act2.moveToElement(ver).perform();
		Thread.sleep(2000);
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(tech).perform ();
		Thread.sleep(2000);
		WebElement mob=driver.findElement(By.xpath("//li[@data-id='mobileApp']//a"));
		Actions act=new Actions(driver);
		act.moveToElement(mob).perform();
		Thread.sleep(2000);
		WebElement xam=driver.findElement(By.xpath("//a[contains(text(),'Xamarin Mobile App Development')]"));
		if(xam.isDisplayed() && xam.isEnabled())
		{
			xam.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Xamarine Mobile App Development is either not displayed or not enabled");
		}
		
	}
	@Test(priority=4)
	void FlutterApp() throws InterruptedException {
		WebElement ver =driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		Actions act2=new Actions(driver);
		act2.moveToElement(ver).perform();
		Thread.sleep(2000);
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(tech).perform ();
		Thread.sleep(2000);
		WebElement mob=driver.findElement(By.xpath("//li[@data-id='mobileApp']//a"));
		Actions act=new Actions(driver);
		act.moveToElement(mob).perform();
		Thread.sleep(2000);
		WebElement flu=driver.findElement(By.xpath("//a[contains(text(),'Flutter Mobile App Development')]"));
		if(flu.isDisplayed() && flu.isEnabled())
		{
			flu.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Flutter Mobile App Development is either not displayed or not enabled");
		}
		
	}
	@Test(priority=5)
	void SwiftApp() throws InterruptedException {
		WebElement ver =driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		Actions act2=new Actions(driver);
		act2.moveToElement(ver).perform();
		Thread.sleep(2000);
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(tech).perform ();
		Thread.sleep(2000);
		WebElement mob=driver.findElement(By.xpath("//li[@data-id='mobileApp']//a"));
		Actions act=new Actions(driver);
		act.moveToElement(mob).perform();
		Thread.sleep(2000);
		WebElement swi=driver.findElement(By.xpath("//a[contains(text(),'Swift App Development')]"));
		if(swi.isDisplayed() && swi.isEnabled())
		{
			swi.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Swift Mobile App Development is either not displayed or not enabled");
		}
		
	}
	
}
