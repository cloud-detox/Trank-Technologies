package GetAFreeQuote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetAFreeQuote_Test 
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://www.tranktechnologies.com/"); 
	}
	@Test(priority=1)
	void Access_GetAFreeQuote() 	
	{
		WebElement GAFQ =driver.findElement(By.xpath("//a[@class='scroll']"));
		GAFQ.click();
	}
	@Test(priority=2)
	void GetInTouch() throws InterruptedException 	
	{
		WebElement YourName =driver.findElement(By.xpath("//input[@placeholder='Your Name']"));
		YourName.click();
		YourName.sendKeys("SHIVANI");
		WebElement YourMail =driver.findElement(By.xpath("//input[@placeholder='Your Mail']"));
		YourMail.click();
		YourMail.sendKeys("annukumariverma99@gmail.com");
		WebElement YourCompany =driver.findElement(By.xpath("//input[@placeholder='Your Company']"));
		YourCompany.click();
		YourCompany.sendKeys("abcd");
		WebElement ChooseAService =driver.findElement(By.xpath("//select[@name='service']"));
	   	Select s = new Select(ChooseAService);
	   	s.selectByVisibleText("Web Development");   
		WebElement YourPhone =driver.findElement(By.xpath("//input[@placeholder='Your Phone']"));
		YourPhone.click();
		YourPhone.sendKeys("8004624681");
		WebElement Message =driver.findElement(By.xpath("//textarea[@placeholder='Message']"));
		Message.click();
		Message.sendKeys("Hello");
		WebElement CheckBox =driver.findElement(By.xpath("(//div[@class='g-recaptcha'])[1]"));
		CheckBox.click();
		WebElement Submit =driver.findElement(By.xpath("//input[@name='getintouch']"));
		Submit.click();
		Thread.sleep(2000);
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}
