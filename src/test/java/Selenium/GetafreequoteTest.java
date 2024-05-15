package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class GetafreequoteTest {
  
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver.navigate().to("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	}
	@Test(priority=1)
	void getafreequotes() throws InterruptedException {
		Thread.sleep(3000);
		WebElement GetTab= driver.findElement(By.xpath("//a[@class='scroll']"));
		boolean a = GetTab.isDisplayed();
		
		if(a=true) {
			GetTab.click();
		}
		else {
			driver.navigate().refresh();
		}
	}
		
	@Test(priority=2)
	void name() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Namefield = driver.findElement(By.xpath("//input[@placeholder='Your Name']"));
		boolean b = Namefield.isDisplayed();
		if (b=true) {
			Namefield.sendKeys("Neha");
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=3)
	void mailfield() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Mail = driver.findElement(By.xpath("//input[@placeholder='Your Mail']"));
		boolean c = Mail.isDisplayed();
		if (c=true) {
		  Mail.sendKeys("chaudharyneha410@gmail.com");
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=4)
	void companyfield() throws InterruptedException {
		Thread.sleep(3000);
		WebElement company = driver.findElement(By.xpath("//input[@placeholder='Your Company']"));
		boolean d = company.isDisplayed();
		if (d=true) {
		  company.sendKeys("uncodemy private ltd.");
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=5)
	void servicedropdown() throws InterruptedException {
		Thread.sleep(3000);
		WebElement service = driver.findElement(By.xpath("//select[@name='service']"));
		boolean e = service.isDisplayed();
		if (e=true) {
		  service.click();
		  driver.findElement(By.xpath("//option[normalize-space()='Web Development']")).click();		
		  }
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=6)
	void phonefield() throws InterruptedException {
		Thread.sleep(3000);
		WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Your Phone']"));
		boolean f = phone.isDisplayed();
		if (f=true) {
		  phone.sendKeys("9876543210");
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=7)
	void messagetextarea() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Message= driver.findElement(By.xpath("//textarea[@placeholder='Message']"));
		boolean g = Message.isDisplayed();
		if (g=true) {
		  Message.sendKeys("Hi");
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=8)
	void robotcheckbox() throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		WebElement robot = driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]"));
		boolean h = robot.isDisplayed();
		if (h=true) {
		  robot.click();
		  driver.switchTo().parentFrame();
		  }
		else {
			driver.navigate().refresh();
		}
	}
	@Test(priority=9)
	void submitbutton() throws InterruptedException {
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("//input[@name=\"getintouch\"]"));
		boolean i = submit.isDisplayed();
		if (i=true) {
		  submit.click();
		}
		else {
			driver.navigate().refresh();
		}
	}
}
