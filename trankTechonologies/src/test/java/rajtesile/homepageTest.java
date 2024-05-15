package rajtesile;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class homepageTest {
	String driverPath = "C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	Boolean a,b,c;
	@BeforeTest
	void navigate_functionality() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver.navigate().to("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
		@Test(priority=1)
		void visibility_verticlas() throws InterruptedException {
			WebElement verticlas = driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
	        a=verticlas.isDisplayed();
	        b=verticlas.isEnabled();
	        if(a==true && b==true)
	        	verticlas.click();
	        Thread.sleep(3000);
	        System.out.println("verticlas is display");
		}      
	    @Test(priority=2)
	    void visbility_technologies()throws InterruptedException{
	    WebElement technologies = driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
	    a=technologies.isDisplayed();
	    b=technologies.isEnabled();
	    if(a==true && b==true)
	    	Thread.sleep(3000);
	    	technologies.click();
	    System.out.println("techonologies is displayed");
	    }
	    @Test(priority=3)
	    void visibility_aboutus()throws InterruptedException{
	    	WebElement aboutus = driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[3]"));
	    	a=aboutus.isDisplayed();
	    	b=aboutus.isEnabled();
	    	if(a==true && b ==true)
	    		Thread.sleep(3000);
	    		aboutus.click();
	    	System.out.println("about us is displayed");
	    }
	    @Test(priority=4)
	    void visibility_contactus()throws InterruptedException{
	    	WebElement contactus = driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='Contact us']"));
	    	a=contactus.isDisplayed();
	    	b=contactus.isEnabled();
	    	if(a==true && b==true)
	    		Thread.sleep(3000);
	    	contactus.click();
	    	System.out.println("contact us is display");
	    }
	    @Test(priority=5)
	    void visibility_portfolio()throws InterruptedException{
	    	WebElement portfolio = driver.findElement(By.xpath("//a[normalize-space()='Portfolio']"));
	    	a=portfolio.isDisplayed();
	    	b=portfolio.isEnabled();
	    	if(a==true && b ==true)
	    		Thread.sleep(3000);
	    	portfolio.click();
	    	System.out.println("portfolio is display");
	    }   
	    @Test(priority=6)
	    void visibility_getfreequotes()throws InterruptedException{
	    	WebElement getfreequotes = driver.findElement(By.xpath("//a[@class='scroll']"));
	    	a=getfreequotes.isDisplayed();
	    	b=getfreequotes.isEnabled();
	    	if(a==true && b==true)
	    		Thread.sleep(2000);
	    	getfreequotes.click();
	    	System.out.println("get free quotes is display");
	    }
	
@AfterTest
void quitFunctionality() {
	driver.close();
	    
}
}	    

		
			
			
			

