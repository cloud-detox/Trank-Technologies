package Verticals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verticals_Test
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://www.tranktechnologies.com/"); 
	}
	@Test(priority=1)
	void Access_Verticals() 	
	{
		WebElement Verticals =driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[1]"));
		Verticals.click();
	}
	@Test(priority=2)
	void Trading() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Stock Trading']")).click();                          //Stock Trading
		
		driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[1]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Algo Trading']")).click();                                           //Algo Trading
		
		driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[1]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Paper Trading']")).click();                         //Paper Trading
	
		driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[1]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Custom Trading']")).click();                         //Custom Trading
		
		driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[1]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='CFD Trading']")).click();                         //CFD Trading
		
		driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[1]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Web Portal Trading']")).click();                         //WebPortal Trading
		
		driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[1]")).click();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Trading App Development in Massachusetts']")).click();                         //Trading App Development in Massachusetts
		
		driver.findElement(By.xpath("(//li[@class=\"drop_down\"])[1]")).click();
		driver.findElement(By.xpath("//strong[normalize-space()='Trading']")).click();
	}
	@Test(priority=3)
	void RetailandEcommerce() 	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Verticals =driver.findElement(By.xpath("(//li[@class='drop_down'])[1]"));
		Verticals.click();
		WebElement RE =driver.findElement(By.xpath("///li[@data-id=\"retailEcommerce\"]"));
		RE.click();
	}
	@Test(priority=4)
	void RetailandEcommerce_Module1() 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement RE=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		a.moveToElement(RE).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='eCommerce Website Development']")).click();	
	}
	@Test(priority=5)
	void RetailandEcommerce_Module2() 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement RE=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		a.moveToElement(RE).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='eCommerce App Development']")).click();	
	}
	@Test(priority=6)
	void HealthCare() 	
	{
		WebElement Verticals =driver.findElement(By.xpath("(//li[@class='drop_down'])[1]"));
		Verticals.click();
		WebElement HC =driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		HC.click();
	}
	@Test(priority=7)
	void HealthCare_Module1() 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement HC=driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		a.moveToElement(HC).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Diet & Nutritions']")).click();	
	}
	@Test(priority=8)
	void HealthCare_Module2()	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement HC=driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		a.moveToElement(HC).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Health tracking App']")).click();	
	}
	@Test(priority=9)
	void Fintech() 
	{
		WebElement Verticals =driver.findElement(By.xpath("(//li[@class='drop_down'])[1]"));
		Verticals.click();
		WebElement F =driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		F.click();
	}
	@Test(priority=10)
	void Fintech_Module1() 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement F=driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		a.moveToElement(F).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Pos Software Development']")).click();	
	}
	@Test(priority=11)
	void Fintech_Module2()	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement F=driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		a.moveToElement(F).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Crypto']")).click();	
	}
	@Test(priority=12)
	void CustomApp() throws InterruptedException 
	{
		WebElement Verticals =driver.findElement(By.xpath("(//li[@class='drop_down'])[1]"));
		Verticals.click();
		WebElement CA =driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		CA.click();
		Thread.sleep(2000);
		}
	@Test(priority=13)
	void CustomApp_Module1()  	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();
		WebElement CA=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(CA).perform();
		driver.findElement(By.xpath("(//a[@href=\"https://www.tranktechnologies.com/desktop-application-development-company\"])[1]")).click();	
	}
	@Test(priority=14)
	void CustomApp_Module2()  	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement CA=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(CA).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='CRM Development']")).click();	
	}
	@Test(priority=15)
	void CustomApp_Module3()  	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement CA=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(CA).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='HRM Development']")).click();	
	}
	@Test(priority=16)
	void CustomApp_Module4() 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement CA=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(CA).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='ERP App Development']")).click();	
	}
	@Test(priority=17)
	void CustomApp_Module5()  	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement CA=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(CA).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Travel']")).click();	
	}
	@Test(priority=18)
	void CustomApp_Module6() 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement CA=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(CA).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='E-Learning']")).click();	
	}
	@Test(priority=19)
	void CustomApp_Module7() 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement CA=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(CA).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Dating App Development']")).click();	
	}
	@Test(priority=20)
	void CustomApp_Module8() 	
	{
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("(//li[@class='drop_down'])[1]")).click();		
		WebElement CA=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(CA).perform();
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Real Estate']")).click();	
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}
