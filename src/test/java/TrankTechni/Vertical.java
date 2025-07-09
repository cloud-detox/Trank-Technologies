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

public class Vertical
{

	
    WebDriver driver = new ChromeDriver ();

    @BeforeClass
    void Vert() 
    {
    	
        driver.get("https://www.tranktechnologies.com/");                      //url
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test(priority=1)
     void Trading () throws InterruptedException
    {
       
        WebElement v1 = driver.findElement(By.xpath("(//a[@href=\"#\"])[2]"));//vertical
        WebElement v2 = driver.findElement(By.xpath("(//a[@href=\"#\"])[3]")); //Trading
        
        Actions a = new Actions(driver);
        a.moveToElement(v1).perform();
        a.moveToElement(v2).perform();
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Stock Trading']")).click();
    }
    @Test(priority=2)
    void retailECommerce () throws InterruptedException
    {
    	
      WebElement R1 = driver.findElement(By.xpath("(//a[@href=\"#\"])[2]"));
      WebElement R2 = driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
      Actions a = new Actions(driver);
      a.moveToElement(R1).perform();
      a.moveToElement(R2).perform();
      Thread.sleep(2000); 
      driver.findElement(By.xpath("//div[@id='retailEcommerce']//li[1]//a[1]")).click();
      
    }
    @Test(priority=3)
    void Healthcare () throws InterruptedException
    {
    	
         WebElement H1 = driver.findElement(By.xpath("(//a[@href=\"#\"])[2]"));
         WebElement H2 = driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
         Actions a = new Actions(driver);
         a.moveToElement(H1).perform();
         a.moveToElement(H2).perform();
         Thread.sleep(2000); 
         driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[contains(text(),'Diet &')]")).click();
    }
 
    @Test(priority=4)
    void Fintech () throws InterruptedException 
    {
    	
         WebElement F1 = driver.findElement(By.xpath("(//a[@href=\"#\"])[2]"));
         WebElement F2 = driver.findElement(By.xpath("//li[@data-id='fintech']//a"));
         Actions a = new Actions(driver);
         a.moveToElement(F1).perform();
         a.moveToElement(F2).perform();
         Thread.sleep(2000); 
         driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[contains(text(),'Pos Software')]")).click();
     }
    @Test(priority=5)
    void CustomeApp () throws InterruptedException 
    {
    	
         WebElement CA1 = driver.findElement(By.xpath("(//a[@href=\"#\"])[2]"));
         WebElement CA2 = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
         Actions a = new Actions(driver);
         a.moveToElement(CA1).perform();
         a.moveToElement(CA2).perform();
         Thread.sleep(2000); 
         driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[contains(text(),'Desktop App')]")).click();
         WebElement CA3 = driver.findElement(By.xpath("(//a[@href=\"#\"])[2]"));
         WebElement CA4 = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
         Actions b = new Actions(driver);
         b.moveToElement(CA3).perform();
         b.moveToElement(CA4).perform();
         driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='E-Learning']")).click();
    }
    @AfterClass
    public void close()
    {
        driver.quit();
    }}