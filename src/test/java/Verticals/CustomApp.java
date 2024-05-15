package Verticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomApp {
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
	void visibilityCustomApp() throws InterruptedException {
		WebElement customapp = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));

		a=customapp.isDisplayed();
		if(a=true) {
			action.moveToElement(customapp).perform();
			Thread.sleep(2000);
			System.out.println("Custom App is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
	}

	@Test(priority=3)
	void visibiilityDesktopAppDevelopment() throws InterruptedException {
		WebElement desktopappdevelopment = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Desktop App Development']"));
		a=desktopappdevelopment.isDisplayed();
		if(a=true) {
			desktopappdevelopment.click();
			Thread.sleep(2000);
			System.out.println("Desktop App Development is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}

	@Test(priority=4)
	void visibiilityCRMDevelopment() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();

		WebElement customapp = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		action.moveToElement(customapp).perform();

		WebElement crmdevelopment = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='CRM Development']"));
		a=crmdevelopment.isDisplayed();
		if(a=true) {
			crmdevelopment.click();
			Thread.sleep(2000);
			System.out.println("CRM Development is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=5)
	void visibiilityHRMDevelopment() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();

		WebElement customapp = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		action.moveToElement(customapp).perform();

		WebElement hrmdevelopment = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='HRM Development']"));
		a=hrmdevelopment.isDisplayed();
		if(a=true) {
			hrmdevelopment.click();
			Thread.sleep(2000);
			System.out.println("HRM Development is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=6)
	void visibiilityERPAppDevelopment() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();

		WebElement customapp = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		action.moveToElement(customapp).perform();

		WebElement ERPAppDevelopment = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='ERP App Development']"));
		a=ERPAppDevelopment.isDisplayed();
		if(a=true) {
			ERPAppDevelopment.click();
			Thread.sleep(2000);
			System.out.println("ERP App Development is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=7)
	void visibiilityTravel() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();

		WebElement customapp = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		action.moveToElement(customapp).perform();

		WebElement travel = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Travel']"));
		a=travel.isDisplayed();
		if(a=true) {
			travel.click();
			Thread.sleep(2000);
			System.out.println("Travel is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=8)
	void visibiilityELearning() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();

		WebElement customapp = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		action.moveToElement(customapp).perform();

		WebElement elearning = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='E-Learning']"));
		a=elearning.isDisplayed();
		if(a=true) {
			elearning.click();
			Thread.sleep(2000);
			System.out.println("ELearning is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=9)
	void visibiilityDatingAppDevelopment() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();

		WebElement customapp = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		action.moveToElement(customapp).perform();

		WebElement datingappdevelopment = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Dating App Development']"));
		a=datingappdevelopment.isDisplayed();
		if(a=true) {
			datingappdevelopment.click();
			Thread.sleep(2000);
			System.out.println("Dating App Development is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}
	
	@Test(priority=10)
	void visibiilityRealState() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();

		WebElement customapp = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		action.moveToElement(customapp).perform();

		WebElement realstate = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Real Estate']"));
		a=realstate.isDisplayed();
		if(a=true) {
			realstate.click();
			Thread.sleep(2000);
			System.out.println("Real State is visible: "+a);
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
