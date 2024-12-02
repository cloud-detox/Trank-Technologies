package Trank_Technologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Portfolio {
	
	String driverPath = "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() {
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	void portfolio() {
		WebElement portfolio=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[6]"));
		portfolio.click();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollintoview(false)", driver);	
		}
	
	@Test(priority=2)
	void ICS_homework() {
		WebElement ics=driver.findElement(By.xpath("//a[@href='https://www.icshomework.in/']"));
		ics.click();
		driver.navigate().back();
		}
	
	@Test(priority=3)
	void wings_pharma() {
		WebElement wing=driver.findElement(By.xpath("//a[@href='https://www.wingspharma.com/']"));
		wing.click();
		driver.navigate().back();
		}
	
	@Test(priority=4)
	void Arena_animation() {
		WebElement arena=driver.findElement(By.xpath("//a[@href='https://arenasonipat.com/']"));
		arena.click();
		driver.navigate().back();
		}
	
	@Test(priority=5)
	void home_360() {
		WebElement home=driver.findElement(By.xpath("//section[@class='cm-section active-section']//div[4]//div[1]//a[1]"));
		home.click();
		driver.navigate().back();
		}
	
	@Test(priority=6)
	void club() {
		WebElement club=driver.findElement(By.xpath("//div[5]//div[1]//a[1]"));
		club.click();
		driver.navigate().back();
		}
	
	@Test(priority=7)
	void cords() {
		WebElement cords=driver.findElement(By.xpath("//a[@xpath=\"1\"]"));
		cords.click();
		driver.navigate().back();
		}
	
	@AfterTest
	void quit() {
		driver.quit();
	}
	
	

}
