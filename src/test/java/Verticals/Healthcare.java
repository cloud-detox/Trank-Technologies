package Verticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Healthcare {
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
	void visibilityHealthcare() throws InterruptedException {
		WebElement healthcare = driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));

		a=healthcare.isDisplayed();
		if(a=true) {
			action.moveToElement(healthcare).perform();
			Thread.sleep(2000);
			System.out.println("Healthcare is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
	}

	@Test(priority=3)
	void visibiilityDietAndNutitions() throws InterruptedException {
		WebElement dietandnutitions = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Diet & Nutritions']"));
		a=dietandnutitions.isDisplayed();
		if(a=true) {
			dietandnutitions.click();
			Thread.sleep(2000);
			System.out.println("Diet And Nutitions is visible: "+a);
		}
		else {
			driver.navigate().refresh();
		}
		driver.navigate().back();
	}

	@Test(priority=4)
	void visibiilityHealthTrackingApp() throws InterruptedException {

		WebElement verticals = driver.findElement(By.xpath("(//i[@class='fa fa-chevron-down'])[2]"));
		action.moveToElement(verticals).perform();

		WebElement healthcare = driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		action.moveToElement(healthcare).perform();

		WebElement healthtrackingapp = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Health tracking App']"));
		a=healthtrackingapp.isDisplayed();
		if(a=true) {
			healthtrackingapp.click();
			Thread.sleep(2000);
			System.out.println("Health Tracking App is visible: "+a);
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
