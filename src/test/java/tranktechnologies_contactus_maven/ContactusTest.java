package tranktechnologies_contactus_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactusTest {
        String driverPath = "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
@BeforeTest

void navigate() throws InterruptedException {
	driver.get("https://www.tranktechnologies.com/");
	Thread.sleep(4000);			
}

			@Test(priority=1)	
			void Ganesh() throws InterruptedException {
		    WebElement kde=driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='Contact us']"));
		    kde.click(); 
		    Thread.sleep(4000);
		    System.out.println(driver.getTitle());
			
			}
@Test(priority=2)	
       void call() throws InterruptedException {
	WebElement up=driver.findElement(By.xpath("//*[name()='path' and @id='Path_4533']"));
	up.click();
	Thread.sleep(4000);
	WebElement what=driver.findElement(By.xpath("//a[@id='action-button']"));
	what.click();
	driver.navigate().back();
	Thread.sleep(4000);
	
}
@Test(priority=3)

void get() throws InterruptedException {
	Actions a=new Actions(driver);
	WebElement ckg=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Name']"));
	ckg.sendKeys("Prajakta");
	WebElement mkg=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Mail']"));
	mkg.sendKeys("prajakta01@gmail.com");
	WebElement dkg=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Company']"));
	dkg.sendKeys("vodafone");
	WebElement categary=driver.findElement(By.xpath("//div[@class='cm-form-field']//select[@name='service']"));
	categary.click();
	Thread.sleep(1000);
	WebElement drop=driver.findElement(By.xpath("//select[@class='form-control valid']//option[contains(text(),'App Development')]"));
	drop.click();
	
	//select[@class='form-control valid']//option[contains(text(),'App Development')]
	WebElement phone=driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Phone']"));
	phone.sendKeys("7775049253");
	WebElement msg=driver.findElement(By.xpath("//form[@id='contact_form']//textarea[@placeholder='Message']"));
	msg.sendKeys("Okay");
	Thread.sleep(4000);
	WebElement check=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
	check.click();
	
}
@Test(priority=4)
void whatsup() throws InterruptedException {
	WebElement ftg=driver.findElement(By.xpath("//div[@class='cm-right-col']//p//a[@href='mailto:info@tranktechnologies.com'][normalize-space()='info@tranktechnologies.com']"));
	ftg.click();
	driver.navigate().back();
	Thread.sleep(4000);
}

}

