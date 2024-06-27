package com.UI;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {

	public static final boolean falsh = false;
	public static final String Throw = null;
	WebDriver driver; // Declare the WebDriver instance at the class level
	public String logoXpath = "/html/body/header/div[1]/div/div[2]/a/img"; // Public variable for the Logo xpath

	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 5)
	public void dropdown() {
		WebElement dropdown = driver
				.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions action = new Actions(driver);
		action.moveToElement(dropdown).perform();

		WebElement eCommerce = driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		eCommerce.click();
		throw new SkipException("Skip this");
	}

	@Test(priority = 1)
	public void homePage() {
		WebElement logo = driver.findElement(By.xpath(logoXpath));
		logo.click();
	}

	@Test(priority = 2)
	public void country() {
		WebElement countryDropdown = driver.findElement(By.xpath("//select[@id='countrySelector']"));
		countryDropdown.click();

		WebElement usaOption = driver.findElement(By.xpath("//option[@value='usa']"));
		usaOption.click();

		WebElement logo = driver.findElement(By.xpath(logoXpath));
		logo.click();

		WebElement uaeOption = driver.findElement(By.xpath("//option[@value='uae']"));
		uaeOption.click();

	}

	@Test(priority = 3)
	public void aboutus() throws InterruptedException {
		WebElement logo = driver.findElement(By.xpath(logoXpath));
		logo.click();

		WebElement Ab0utus = driver
				.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='About us']"));
		Ab0utus.click();

		WebElement eco_dev = driver.findElement(By.xpath(
				"//div[@class='cm-footer-links-wrapper cm-flex-type-1']//div[1]//ul[1]//li[3]//div[1]//div[1]//div[1]//span[2]//i[1]"));
		eco_dev.click();

		Thread.sleep(5000);

		WebElement drpp = driver.findElement(By.xpath("//a[normalize-space()='Website Development Delhi']"));
		drpp.click();
		Thread.sleep(5000);

		String pw = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String a : all) {
			if (!pw.equals(a)) {
				driver.switchTo().window(a);
				System.out.println("child" + a);

			}

		}

		driver.switchTo().window(pw);
		System.out.println("Switched back to parent window: " + pw);
		//Thread.sleep(5000);
		WebElement logo1 = driver.findElement(By.xpath(logoXpath));
		logo1.click();
		

	}

	@Test(priority = 4)
	
	public void icon() throws InterruptedException {
		
		WebElement Ab0utus = driver
				.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='About us']"));
		Ab0utus.click();
		//Thread.sleep(1000);

		WebElement fb = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		fb.click();
		//Thread.sleep(5000);

		String pw = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String a : all) {
			if (!pw.equals(a)) {
				driver.switchTo().window(a);
				System.out.println("child" + a);
				driver.close();				

			}
		}
		driver.switchTo().window(pw);
		System.out.println("Switched back to parent window: " + pw);
		//Thread.sleep(5000);
		
		WebElement insta = driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/Insta.png']"));
		insta.click();
		
		String pw1 = driver.getWindowHandle();
		Set<String> all1 = driver.getWindowHandles();
		for(String a1: all1){
			if(!pw1.equals(a1)) {
				driver.switchTo().window(a1);
				System.out.println("Child Insta" +a1);
				//Thread.sleep(5000);
				
			}
		}
		
		driver.switchTo().window(pw1);
		System.out.println("Switch bach to Parent window: " + pw1);
		//Thread.sleep(5000);

	}

	@AfterClass
	public void teardown() {

		driver.quit();

	}
}
