package GlobalLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Career {
	
	String driverPath = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";;
	WebDriver driver = new ChromeDriver();
	
	@Test(priority = 1)
	void navigate() throws InterruptedException {
		driver.get("https://globallogistic.co.in/careers.html");

		Thread.sleep(2000);
	}

	@Test(priority = 2)

	void name() {

		WebElement name = driver.findElement(By.xpath("//input[@name='your-name']"));
		name.sendKeys("Sachin");

	}

	@Test(priority = 3)

	void email() {
		WebElement email = driver.findElement(By.xpath("//input[@name='your-email']"));
		email.sendKeys("sachin@mailinator.com");
	}

	@Test(priority = 4)
	void contact() {
		WebElement contact = driver.findElement(By.xpath("//input[@name='tel-345']"));
		contact.sendKeys("1234567890");

	}

	@Test(priority = 5)
	void subject() {
		WebElement subject = driver.findElement(By.xpath("//input[@name='your-subject']"));
		subject.sendKeys("Math");

	}

	@Test(priority = 6)
	void message() {
		WebElement message = driver.findElement(By.xpath("//textarea[@name='your-message']"));
		message.sendKeys("Check the testing data in the field");

	}

	@Test(priority = 7)

	void choosefile() {
		WebElement choosefile = driver.findElement(By.xpath("//input[@name='file-877']"));
		choosefile.sendKeys("/Users/vipandhalaria/Downloads/screenshot/s1.png");
	}

	@Test(priority = 8)

	void send() {
		WebElement send = driver.findElement(By.xpath("//input[@value='Send']"));
		send.click();
	}

}


