package Technologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class eCommerceDevelopment_Test 
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://www.tranktechnologies.com/"); 
	}
	@Test(priority=1)
	void Access_Technologies() 	
	{
		WebElement Technologies =driver.findElement(By.xpath("(//li[@class='drop_down'])[2]"));
		Technologies.click();
	}
	@Test(priority=2)
	void eCD_Modules() 	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='Magento Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Opencart Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Codeigniter Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='WordPress Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Big Commerce']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Shopify Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='CS-Cart Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Node JS Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Nop Commerce']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Woo Commerce']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Laravel Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Prestashop Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Drupal Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Wix Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Joomla Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='React JS Development']")).click();
		
		driver.findElement(By.xpath("(//li[@class='drop_down'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Express JS Development']")).click();
	}
	@Test(priority=3)
	void eCommerceDevelopment() throws InterruptedException 	
	{
		WebElement eCD =driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		Actions a= new Actions(driver);
		a.moveToElement(eCD).click().perform();
		Thread.sleep(2000);
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}
