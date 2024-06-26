package TrankTechnologies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 public class FineTech {
	String driverPath = "C:\\Users\\guess\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	 WebDriver driver= new ChromeDriver(); 
	 
 @BeforeTest
  public void navigate() throws InterruptedException
	 {
		 driver.get("https://www.tranktechnologies.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	 }
	
 @Test(priority=1)
  void vertical() throws InterruptedException 
	 {
	    WebElement vert = driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(vert).perform();

	    WebElement FineTech = driver.findElement(By.xpath("//li[@data-id='fintech']"));
	    a.moveToElement(FineTech).perform();
	    Thread.sleep(2000);
	 }
	 
 @Test(priority=2)
 void PosSoft() throws InterruptedException 
   {
	   WebElement PosSoft = driver.findElement(By.xpath("//a[normalize-space()='Pos Software Development']"));
	   PosSoft.click();
	   Thread.sleep(2000);
		 
	   WebElement Logo =driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']"));
	   Logo.click();
	   Thread.sleep(2000);
 
	   WebElement vertical = driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[1]"));
	   Actions b = new Actions(driver);
	   b.moveToElement(vertical).perform();
	   Thread.sleep(2000);
	 
	   WebElement FineTech1 = driver.findElement(By.xpath("//li[@data-id='fintech']"));
	   b.moveToElement(FineTech1).perform();
	   Thread.sleep(2000);
	 
	   WebElement Crypto = driver.findElement(By.xpath("//a[normalize-space()='Crypto']"));
	   Crypto.click();
	   Thread.sleep(2000);
	 
   } 

 @AfterTest
   public void close() throws InterruptedException
		 {
			driver.quit();
		 }
   }
