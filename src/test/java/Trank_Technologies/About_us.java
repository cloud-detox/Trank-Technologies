package Trank_Technologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class About_us {
	
	public class Verticals {
		
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
			WebElement about=driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='About us']"));
			about.click();
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("arguments[0].scrollintoview(false)", driver);	
			}
		
		@Test(priority=2)
		void we_serve() {
			WebElement we=driver.findElement(By.xpath("//button[@aria-label='Next']"));
			we.click();
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("arguments[0].scrollintoview(false)", driver);	
			}
		
		@Test(priority=3)
		void web_development() {
			WebElement web=driver.findElement(By.xpath("//a[normalize-space()='Web Development']"));
			web.click();
			driver.navigate().back();
			WebElement cms=driver.findElement(By.xpath("//a[normalize-space()='CMS Website Development']"));
			cms.click();
			driver.navigate().back();
			WebElement ecomm=driver.findElement(By.xpath("//a[contains(text(),'eCommerce Development')]"));
			ecomm.click();
			driver.navigate().back();
			WebElement custom=driver.findElement(By.xpath("//a[normalize-space()='Custom Web Portal Development']"));
			custom.click();
			driver.navigate().back();
		}
		@Test(priority=4)
		void UI() {
			WebElement ui=driver.findElement(By.xpath("//a[normalize-space()='UI UX Design']"));
			ui.click();
			driver.navigate().back();
			WebElement mob=driver.findElement(By.xpath("//a[normalize-space()='Mobile App Design']"));
			mob.click();
			driver.navigate().back();
			WebElement web=driver.findElement(By.xpath("//a[normalize-space()='Responsive Web Design']"));
			web.click();
			driver.navigate().back();
			WebElement brand=driver.findElement(By.xpath("//a[normalize-space()='Brand Identity Design']"));
			brand.click();
			driver.navigate().back();
		}
		
		@Test(priority=5)
		void app() {
			WebElement app=driver.findElement(By.xpath("//a[normalize-space()='App Development']"));
			app.click();
			driver.navigate().back();
			WebElement ios=driver.findElement(By.xpath("//a[normalize-space()='iOS App Development']"));
			ios.click();
			driver.navigate().back();
			WebElement android=driver.findElement(By.xpath("//a[normalize-space()='Android App Development']"));
			android.click();
			driver.navigate().back();
			WebElement hybrid=driver.findElement(By.xpath("//a[normalize-space()='Hybrid Mobile App Development']"));
			hybrid.click();
			driver.navigate().back();
			WebElement cross=driver.findElement(By.xpath("//a[normalize-space()='Cross-Platform App Development']"));
			cross.click();
			WebElement prog=driver.findElement(By.xpath("//a[normalize-space()='Progressive Web App Development']"));
			prog.click();
			driver.navigate().back();
			}
		
		@Test(priority=6)
		void graphic() {
			WebElement grap=driver.findElement(By.xpath("//a[normalize-space()='Graphic Design']"));
			grap.click();
			driver.navigate().back();
			WebElement logo=driver.findElement(By.xpath("//a[normalize-space()='Logo Design']"));
			logo.click();
			driver.navigate().back();
			WebElement banner=driver.findElement(By.xpath("//a[normalize-space()='Banner Design']"));
			banner.click();
			driver.navigate().back();
			WebElement pac=driver.findElement(By.xpath("//a[normalize-space()='Packaging Design']"));
			pac.click();
			driver.navigate().back();
			WebElement bus=driver.findElement(By.xpath("//a[normalize-space()='Business cards Design']"));
			bus.click();
			driver.navigate().back();
		}
		@AfterTest
		void quit() {
			driver.quit();
		}
		

	}
}
