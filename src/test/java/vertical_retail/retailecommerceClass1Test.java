package vertical_retail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class retailecommerceClass1Test {
	
	String driverPath = "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";	
	WebDriver driver = new ChromeDriver();
	Actions a = new Actions(driver);
	
	@BeforeTest
	void navigate () throws InterruptedException {
		driver.get("https://www.tranktechnologies.com/ecommerce-web-development-company-in-india");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void verticals () throws InterruptedException {
	WebElement vertical = driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
	a.moveToElement(vertical).perform();
	Thread.sleep(2000);
	}
		
    @Test(priority=2)
    void retail () throws InterruptedException {	
	WebElement retail = driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
	a.moveToElement(retail).perform();
	Thread.sleep(2000);
    }
    
    @Test(priority=3)
    void ecom() throws InterruptedException {   	
	WebElement ecom = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='eCommerce Website Development']"));
	ecom.click();
	Thread.sleep(2000);
    }
    
    @Test(priority=4)
    void text () throws InterruptedException {  	
	WebElement text = driver.findElement(By.xpath("//h1[normalize-space()='Top eCommerce Website Development Company in India']"));
	text.isDisplayed();
	Thread.sleep(2000);
	
	}
    
    @Test(priority=5)
	void verticals2 () throws InterruptedException {
	WebElement vertical = driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
	a.moveToElement(vertical).perform();
	Thread.sleep(2000);
	}
    
    @Test(priority=6)
    void retail2 () throws InterruptedException {	
	WebElement retail = driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
	a.moveToElement(retail).perform();
	Thread.sleep(2000);
    }
    
    @Test(priority=7)
    void ecomdev () throws InterruptedException {  	
	WebElement ecomdev = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='eCommerce App Development']"));
	ecomdev.click();
	Thread.sleep(2000);
    }
	
	@AfterTest
	void close () {
		driver.quit();
	}

}
