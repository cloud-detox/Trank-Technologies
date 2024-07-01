package tranktechnologiesproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1Test {
	
	

String driverpath=("C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		
		@BeforeTest
	void Navigate() throws InterruptedException {
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(3000);
	driver.manage().window().maximize();
		}
		@Test(priority=1)
		void login () throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
		}
		
	@Test(priority=2)
	void click() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']")).click()
;		
	}
	@Test (priority=3) 
	void sauce () {
	driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
	
	driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
	driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]")).click();
	driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
	}
	@Test (priority=4)
	void order ()throws InterruptedException {
		
	driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("ravi");
	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("shrivastav");
	
	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("110032");
	driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		
	driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']")).click();
	}
	@Test(priority= 5)
	void down () throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
	}
	@Test (priority=6)
	void about ()throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();
		Actions a=new Actions(driver);
		WebElement Products=driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']"));

		a.moveToElement(Products).perform();
		
	
	
}  
	
	}	
	
	
		
		
		
		
		
		
		
	////span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']
	
	
	
	
	
	















































































































































































































































































































































































































































































































	
	
	
	


