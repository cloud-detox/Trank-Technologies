package com.UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class1 {

	public static WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test

	public void Dropdown() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement dropdown = driver
				.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));

		action.moveToElement(dropdown).perform();
		// dropdown.click();
		WebElement eComerce = driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		eComerce.click();

	}
	
	

	
	@Test
	 public

	@AfterClass
  void after() {
driver.quit();
	}

}
