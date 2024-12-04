package tranktech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tranktech_blog {
	String driverPath= "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
    @BeforeTest
	void navigate(){
		driver.get("https://www.tranktechnologies.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
    
    @Test(priority=0)
    void blog() throws InterruptedException {
		WebElement blog=driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='Blog']"));
		blog.click();
		Thread.sleep(2000);
	}
    
    @Test(priority=1)
    void app_dev() throws InterruptedException {
		WebElement app_dev=driver.findElement(By.xpath("//a[@href='/blog/category/app-development/']"));
		app_dev.click();
		Thread.sleep(2000);
    }
    
    @Test(priority=2)
    void web_dev() {
		WebElement web_dev=driver.findElement(By.xpath("//a[@href='/blog/category/web-development/']"));
		web_dev.click();
    }
    
    @Test(priority=3)
    void software_dev() throws InterruptedException {
		WebElement software_dev=driver.findElement(By.xpath("//a[@href='/blog/category/software-development/']"));
		software_dev.click();
		Thread.sleep(2000);
    }
    
    @Test(priority=4)
    void digital_marketing() throws InterruptedException {
		WebElement digital_marketing=driver.findElement(By.xpath("//a[@href='/blog/category/digital-marketing/']"));
		digital_marketing.click();
		Thread.sleep(2000);
    }
    
    @Test(priority=5)
    void email_marketing() throws InterruptedException {
		WebElement email_marketing=driver.findElement(By.xpath("//a[@href='/blog/category/email-marketing/']"));
		email_marketing.click();
		Thread.sleep(2000);
    }
    
    @Test(priority=6)
    void Ai() throws InterruptedException {
		WebElement Ai=driver.findElement(By.xpath("//a[@href='/blog/category/artificial-intelligence/']"));
		Ai.click();
		Thread.sleep(2000);
    }
    
    @Test(priority=7)
    void ui_ux_design() throws InterruptedException {
		WebElement ui_ux_design=driver.findElement(By.xpath("//a[@href='/blog/category/ui-ux-design/']"));
		ui_ux_design.click();
		Thread.sleep(2000);
    }

}
