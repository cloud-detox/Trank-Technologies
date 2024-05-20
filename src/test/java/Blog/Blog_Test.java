package Blog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Blog_Test 
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://www.tranktechnologies.com/"); 
	}
	@Test(priority=1)
	void Access_Blog() 	
	{
		WebElement Blog =driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='Blog']"));
		Blog.click();
	}
	@Test(priority=2)
	void AppDevelopment() throws InterruptedException 
	{
		WebElement AD =driver.findElement(By.xpath("//a[@href='/blog/category/app-development/']"));
		AD.click();
		WebElement ReadMore =driver.findElement(By.xpath("//article[@id='post-1694']//a[@class='btn btn-default']"));
		ReadMore.click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=3)
	void WebDevelopment() throws InterruptedException 
	{
		WebElement WD =driver.findElement(By.xpath("//a[@href='/blog/category/web-development/']"));
		WD.click();
     	WebElement ReadMore =driver.findElement(By.xpath("//article[@id='post-1748']//a[@class='btn btn-default']"));
  	    ReadMore.click();
  	    driver.navigate().back();
  	    Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=4)
	void SoftwareDevelopment() throws InterruptedException 
	{
		WebElement SD =driver.findElement(By.xpath("//a[@href='/blog/category/software-development/']"));
		SD.click();
     	WebElement ReadMore =driver.findElement(By.xpath("//article[@id='post-1461']//a[@class='btn btn-default']"));
  	    ReadMore.click();
  	    driver.navigate().back();
  	    Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=5)
	void DigitalMarketing() 
	{
		WebElement DM =driver.findElement(By.xpath("//a[@href='/blog/category/digital-marketing/']"));
		DM.click();
     	WebElement ReadMore =driver.findElement(By.xpath("//article[@id='post-1441']//a[@class='btn btn-default']"));
  	    ReadMore.click();
  	    driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority=6)
	void EmailMarketing() 
	{
		WebElement EM =driver.findElement(By.xpath("//a[@href='/blog/category/email-marketing/']"));
		EM.click();
     	WebElement ReadMore =driver.findElement(By.xpath("//a[@class='btn btn-default']"));
  	    ReadMore.click();
  	    driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority=7)
	void ArtificialIntelligence() 
	{
		WebElement AI =driver.findElement(By.xpath("//a[@href='/blog/category/artificial-intelligence/']"));
		AI.click();
     	WebElement ReadMore =driver.findElement(By.xpath("//a[@class='btn btn-default']"));
  	    ReadMore.click();
  	    driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority=8)
	void UI_UXDesign() 
	{
		WebElement UIUX =driver.findElement(By.xpath("//a[@href='/blog/category/ui-ux-design/']"));
		UIUX.click();
     	WebElement ReadMore =driver.findElement(By.xpath("//article[@id='post-616']//a[@class='btn btn-default']"));
  	    ReadMore.click();
  	    driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority=9)
	void Search() 
	{
		WebElement Search =driver.findElement(By.xpath("//div[@class=\"search-icon\"]"));
		Search.click();
		WebElement InputText =driver.findElement(By.xpath("//input[@class=\"search_text\"]"));
		InputText.click();
		InputText.sendKeys("App Development");
     	WebElement SearchButton =driver.findElement(By.xpath("//button[@class=\"search_submit\"]"));
     	SearchButton.click();
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}
