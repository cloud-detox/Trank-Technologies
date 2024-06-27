package Verticals_healthcare;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HealthcareTest {

	String driverPath = "C:\\Users\\karan\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	
@BeforeTest
	void navigate()
	{
        driver.navigate().to("https://www.tranktechnologies.com/usa");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
@Test(priority=1)
void vertical() throws InterruptedException 
{
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	WebElement verdrop=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
	Actions a= new Actions(driver);
	
	a.moveToElement(verdrop).perform();
    


    WebElement health=driver.findElement(By.xpath("//li[@data-id='healthcare']//a"));
    a.moveToElement(health).perform();
    
    WebElement diet=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Diet & Nutritions']"));
    diet.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 5500);");
    Thread.sleep(10);
    driver.navigate().back();
}

@Test(priority=2)
void verticalback() throws InterruptedException 
{
	WebElement verdrop=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
	Actions a= new Actions(driver);
	
	a.moveToElement(verdrop).perform();
    

    WebElement thealth=driver.findElement(By.xpath("//li[@data-id='healthcare']//a"));
    a.moveToElement(thealth).perform();
  
    
    WebElement healthapp=driver.findElement(By.xpath("//div[@id='healthcare']//li[2]"));
    healthapp.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
}

@AfterTest
void close() {
	driver.quit();
}
}