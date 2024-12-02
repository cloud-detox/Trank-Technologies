package Trank_Technologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Contact_us {
	
	String driverPath = "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() {
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	void about() {
		WebElement contact=driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='Contact us']"));
		contact.click();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollintoview(false)", driver);	
		}
	
	@Test(priority=2)
	void consultation() {
		WebElement name=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Name']"));
		name.sendKeys("Shivani");
	}
	@Test(priority=3)
	void email() {
		WebElement email=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Mail']"));
		email.sendKeys("shivaniagrawal11@gmail.com");
	}
	@Test(priority=4)
	void company() {
		WebElement com=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Company']"));
		com.sendKeys("tech");
	}
	@Test(priority=5)
	void choose_service() {
		WebElement service=driver.findElement(By.xpath("//div[@class='cm-form-field']//select[@name='service']"));
		service.click();
	}
	
	@Test(priority=6)
	void service() {
		WebElement ser=driver.findElement(By.xpath("//div[@class='cm-form-field']//option[contains(text(),'App Development')]"));
		ser.click();
	}
	
	@Test(priority=7)
	void phone() {
		WebElement ph=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Phone']"));
		ph.sendKeys("9537084578");
	}
	
	@Test(priority=8)
	void message() {
		WebElement mes=driver.findElement(By.xpath("//form[@id='contact_form']//textarea[@placeholder='Message']"));
		mes.sendKeys("message");
	}
	
	@Test(priority=9)
	void captcha() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollintoview(false)", driver);		
		WebElement cap=driver.findElement(By.xpath(""));
		cap.click();
	}
	
	@Test(priority=10)
	void submit() {
		WebElement submit=driver.findElement(By.xpath("//input[@name='contact']"));
		submit.click();
		}
	
	@AfterTest
	void quit() {
		driver.quit();
	}

}
