package Verticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RetailAndEcommerce {
	String driverPath = "C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	Boolean a;
	Actions action = new Actions(driver);

	@BeforeTest
	void navigate_functionality() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver.navigate().to("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	void visibilityVerticals() throws InterruptedException {
		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		
		a=verticals.isDisplayed();
		if(a=true) {
			action.moveToElement(verticals).perform();
			Thread.sleep(2000);
			System.out.println("Verticals is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=2)
	void visibilityRetailAndEcommerce() throws InterruptedException {
		WebElement retailandecommerce = driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		
		a=retailandecommerce.isDisplayed();
		if(a=true) {
			action.moveToElement(retailandecommerce).perform();
			Thread.sleep(2000);
			System.out.println("Retail and Ecommerce is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=3)
	void visibiilityEcommerceWebsiteDevelopment() throws InterruptedException {
		WebElement ecommercewebsitedevelopment = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='eCommerce Website Development']"));
		a=ecommercewebsitedevelopment.isDisplayed();
		if(a=true) {
			ecommercewebsitedevelopment.click();
			Thread.sleep(2000);
			System.out.println("Ecommerce Website Development is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=4)
	void visibiilityEcommerceAppDevelopment() throws InterruptedException {
		
		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();
		
		WebElement trading = driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		action.moveToElement(trading).perform();
		
		WebElement ecommerceappdevelopment = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='eCommerce App Development']"));
		a=ecommerceappdevelopment.isDisplayed();
		if(a=true) {
			ecommerceappdevelopment.click();
			Thread.sleep(2000);
			System.out.println("Ecommerce App Development is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@AfterTest
	void quitFunctionality() {
		driver.quit();
	}
	
}