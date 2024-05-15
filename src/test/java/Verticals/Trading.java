package Verticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trading {
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
	void visibilityTrading() throws InterruptedException {
		WebElement trading = driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
		
		a=trading.isDisplayed();
		if(a=true) {
			action.moveToElement(trading).perform();
			Thread.sleep(2000);
			System.out.println("Trading is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=3)
	void visibiilityStockTrading() throws InterruptedException {
		WebElement stocktrading = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Stock Trading']"));
		a=stocktrading.isDisplayed();
		if(a=true) {
			stocktrading.click();
			Thread.sleep(2000);
			System.out.println("Stock Trading is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=4)
	void visibiilityAlgoTrading() throws InterruptedException {
		
		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();
		
		WebElement trading = driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
		action.moveToElement(trading).perform();
		
		WebElement algotrading = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Algo Trading']"));
		a=algotrading.isDisplayed();
		if(a=true) {
			algotrading.click();
			Thread.sleep(2000);
			System.out.println("Algo Trading is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=5)
	void visibiilityPaperTrading() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();
		
		WebElement trading = driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
		action.moveToElement(trading).perform();
		
		WebElement papertrading = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Paper Trading']"));
		a=papertrading.isDisplayed();
		if(a=true) {
			papertrading.click();
			Thread.sleep(2000);
			System.out.println("Paper Trading is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=6)
	void visibiilityCustomTrading() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();
		
		WebElement trading = driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
		action.moveToElement(trading).perform();
		
		WebElement customtrading = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Custom Trading']"));
		a=customtrading.isDisplayed();
		if(a=true) {
			customtrading.click();
			Thread.sleep(2000);
			System.out.println("Custom Trading is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=7)
	void visibiilityCFDTrading() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();
		
		WebElement trading = driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
		action.moveToElement(trading).perform();
		
		WebElement CFDtrading = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='CFD Trading']"));
		a=CFDtrading.isDisplayed();
		if(a=true) {
			CFDtrading.click();
			Thread.sleep(2000);
			System.out.println("CFD Trading is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=8)
	void visibiilityWebPortalTrading() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();
		
		WebElement trading = driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
		action.moveToElement(trading).perform();
		
		WebElement webportaltrading = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Web Portal Trading']"));
		a=webportaltrading.isDisplayed();
		if(a=true) {
			webportaltrading.click();
			Thread.sleep(2000);
			System.out.println("Web Portal Trading is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=9)
	void visibiilityTradingAppDevelopmentInMassachusetts() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();
		
		WebElement trading = driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
		action.moveToElement(trading).perform();
		
		WebElement tadinm = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Trading App Development in Massachusetts']"));
		a=tadinm.isDisplayed();
		if(a=true) {
			tadinm.click();
			Thread.sleep(2000);
			System.out.println("Trading App Development in Massachusetts is visible: "+a);
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
