package tranktech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tranktech_contact_us {
	String driverPath= "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
    @BeforeTest
	void navigate(){
		driver.get("https://www.tranktechnologies.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
    
    @Test(priority=0)
	void contact() {
		WebElement con=driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='Contact us']"));
		con.click();
	}
    
    @Test(priority=1)
	void name() {
		WebElement name=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Name']"));
		name.sendKeys("Krupa Nag");
	}	
    
    
    @Test(priority=2)
	void mail() {
		WebElement mail=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Mail']"));
		mail.sendKeys("krupanag07@gmail.com");
	}	
    
    
    @Test(priority=3)
   	void Your_Company() {
   		WebElement Your_Company=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Company']"));
   	    Your_Company.sendKeys("HP");
   	}	
    
    
    @Test(priority=4)
   	void select_ser() {
   		WebElement select_ser=driver.findElement(By.xpath("//div[@class='cm-form-field']//select[@name='service']"));
   	    select_ser.click();
   	}	
    
    @Test(priority=5)
   	void web_dev() {
   		WebElement web_dev=driver.findElement(By.xpath("//div[@class='cm-form-field']//option[contains(text(),'Web Development')]"));
   	    web_dev.click();
   	}
    
    @Test(priority=6)
   	void your_phone() {
    	WebElement your_phone=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Phone']"));
	    your_phone.sendKeys("9663716108");
   	}
    
    
    @Test(priority=7)
   	void message() {
    	WebElement message=driver.findElement(By.xpath("//form[@id='contact_form']//textarea[@placeholder='Message']"));
	    message.sendKeys("web development");
   	}
    
    
    @Test(priority=8)
   	void submit() {
    	WebElement submit=driver.findElement(By.xpath("//input[@name='contact']"));
	    submit.click();
   	}
    
    @AfterTest
    void quit(){
    driver.quit();
    }
    
    
    
    
    

}
