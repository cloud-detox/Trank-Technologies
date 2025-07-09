package TrankTechni;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Technology
{

	
    WebDriver driver = new ChromeDriver ();

    @BeforeClass
    void Tech() 
    {
    	
        driver.get("https://www.tranktechnologies.com/");                      //url
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    
    @Test(priority=1)
    
    void Ecommer() throws InterruptedException
    {
    	WebElement E1 = driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[2]"));    //technology
    	WebElement E2 = driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));     //ecom
    	Actions a= new Actions(driver);
        a.moveToElement(E1).perform();
        a.moveToElement(E2).perform();
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//a[normalize-space()='Magento Development']")).click();
    }
    @Test(priority=2)
    void Mobile() throws InterruptedException
    {
    	WebElement M1 = driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[2]"));    //technology
    	WebElement M2 = driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));     //react native
    	Actions a= new Actions(driver);
        a.moveToElement(M1).perform();
        a.moveToElement(M2).perform(); 
        driver.findElement(By.xpath("//a[contains(text(),'React Native Mobile')]")).click();
    }
   
    @Test(priority=3)
    void AI() throws InterruptedException
    {
    	WebElement AI1 = driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[2]"));    //technology
    	WebElement AI2 = driver.findElement(By.xpath("//strong[normalize-space()='Artificial Intelligence']"));     //AI
    	Actions a= new Actions(driver);
        a.moveToElement(AI1).perform();
        a.moveToElement(AI2).perform(); 
        driver.findElement(By.xpath("//strong[normalize-space()='Artificial Intelligence']")).click();
    }

    @AfterClass
    public void close() 
    {
        driver.quit();
    }
 }

