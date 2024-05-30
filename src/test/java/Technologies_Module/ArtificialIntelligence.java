package Technologies_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArtificialIntelligence {
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
	void AI() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement ai=driver.findElement(By.xpath("//strong[normalize-space()='Artificial Intelligence']"));
		if(ai.isDisplayed() && ai.isEnabled())
		{
			ai.click();
			Thread.sleep(2000);			
		}
		else
		{
			System.out.println("Artificial Intelligence is either not displayed or not enabled");
		}
	}

}
