package tranktech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tranktech_about_us {
	String driverPath= "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
    @BeforeTest
	void navigate(){
		driver.get("https://www.tranktechnologies.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
    
    @Test
    void about() {
		WebElement about=driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='About us']"));
		about.click();
	}
}