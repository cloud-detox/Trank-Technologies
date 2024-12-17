package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG1Test {
	
	String driverPath = "Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@Test
	void navigate () throws InterruptedException
	{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	}
	@Test
	void username () {
		WebElement un= driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		un.sendKeys("Admin");
	}
	@Test
	void password () {
		WebElement pw= driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		pw.sendKeys("admin123"); 
	}
	
	@Test
	
	void login () {
		
		WebElement bt= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		bt.click();	
		
		
	}
		
}
		

	


