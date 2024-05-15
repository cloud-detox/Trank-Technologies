package Verticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fintech {
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
	void visibilityFintech() throws InterruptedException {
		WebElement fintech = driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));

		a=fintech.isDisplayed();
		if(a=true) {
			action.moveToElement(fintech).perform();
			Thread.sleep(2000);
			System.out.println("Fintech is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
	}

	@Test(priority=3)
	void visibiilityPosSoftwareDevelopment() throws InterruptedException {
		WebElement possoftwaredevelopment = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Pos Software Development']"));
		a=possoftwaredevelopment.isDisplayed();
		if(a=true) {
			possoftwaredevelopment.click();
			Thread.sleep(2000);
			System.out.println("Pos Software Development is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}

	@Test(priority=4)
	void visibiilityCrypto() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();

		WebElement fintech = driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		action.moveToElement(fintech).perform();

		WebElement crypto = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Crypto']"));
		a=crypto.isDisplayed();
		if(a=true) {
			crypto.click();
			Thread.sleep(2000);
			System.out.println("Crypto is visible: "+a);
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
