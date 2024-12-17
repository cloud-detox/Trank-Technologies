package GlobalLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contact {
	
	String driverPath = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";;
	WebDriver driver = new ChromeDriver(); 

@Test(priority = 0)
void navigate() {
	driver.get("https://globallogistic.co.in/contact.html");
}

@Test(priority = 1)
void name() {
	WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
	name.sendKeys("Rakesh");
}

@Test(priority = 2)
void email() {
	WebElement name = driver.findElement(By.xpath("//input[@id='email']"));
	name.sendKeys("Rakesh@mailinator.com");
}

@Test(priority = 3)
void number() {
	WebElement name = driver.findElement(By.xpath("//input[@id='number']"));
	name.sendKeys("1234567890");
}

@Test(priority = 4)
void subject() {
	WebElement name = driver.findElement(By.xpath("//input[@id='subject']"));
	name.sendKeys("English ");
}

@Test(priority = 5)
void message() {
	WebElement name = driver.findElement(By.xpath(""));
	name.sendKeys("Just check for the testing purpose");
}

@Test(priority = 6)
void submit() {
	WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	submit.click();
}

}


