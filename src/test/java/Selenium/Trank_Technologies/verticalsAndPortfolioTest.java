package Selenium.Trank_Technologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class verticalsAndPortfolioTest {
	String driverPath = "C:\\Users\\SONY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	Actions a =new Actions(driver);
	@BeforeTest
	void navigate() throws InterruptedException
	{
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1,enabled=true)
	void verticals() throws InterruptedException
	{
		WebElement vert = driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		Thread.sleep(5000);
		
		a.moveToElement(vert).perform();
	}
	
	@Test(priority=2)
	void stock_trading() throws InterruptedException 
	{
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Stock Trading']")).click();
		Thread.sleep(4000);
		
		boolean st = driver.findElement(By.xpath("//*[text()='Trading Mobile App Development Features']")).isDisplayed();
		if(st)
		{
			System.out.println("Trading Mobile App Development Features is getting displayed");
		}
		
		else
		{
			System.out.println("Trading Mobile App Development Features is not getting displayed");
		}
	}
	
	@Test(priority=3)
	void algo_trading() throws InterruptedException 
	{
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Algo Trading']")).click();
		Thread.sleep(4000);
		
		WebElement at = driver.findElement(By.xpath("//h3[normalize-space()='How Does Algo Trading Work?']"));
		if(at.isDisplayed())
		{
			System.out.println("Algo trading is working perfectly fine");
		}
		
		else
		{
			System.out.println("Algo trading is not working");
		}
	}
	@Test(priority=4)
	void paper_trading() throws InterruptedException 
	{
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Paper Trading']")).click();
		Thread.sleep(4000);
		
		WebElement pt = driver.findElement(By.xpath("//h3[normalize-space()='How Does Paper Trading or Simulated Trading Work?']"));
		if(pt.isDisplayed())
		{
			System.out.println("Paper trading is working perfectly fine");
		}
		
		else
		{
			System.out.println("Paper trading is not working");
		}
	}
	@Test(priority=5)
	void custom_trading() throws InterruptedException 
	{
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Custom Trading']")).click();
		Thread.sleep(4000);
		
		WebElement ct = driver.findElement(By.xpath("//body/section[3]/div[1]/div[1]/h3[1]"));
		if(ct.isDisplayed())
		{
			System.out.println("Custom trading is working perfectly fine");
		}
		
		else
		{
			System.out.println("Custom trading is not working");
		}
	}
	@Test(priority=6)
	void cfd_trading() throws InterruptedException 
	{
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='CFD Trading']")).click();
		Thread.sleep(4000);
		
		WebElement cfdt = driver.findElement(By.xpath("//h1[@class='cm-section-h']"));
		if(cfdt.isDisplayed())
		{
			System.out.println("CFD trading is working perfectly fine");
		}
		
		else
		{
			System.out.println("CFD trading is not working");
		}
	}
	@Test(priority=7)
	void webportal_trading() throws InterruptedException 
	{
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Web Portal Trading']")).click();
		Thread.sleep(4000);
		
		WebElement wpt = driver.findElement(By.xpath("//h2[normalize-space()='Trading Web Portal Design & Development Solutions']"));
		if(wpt.isDisplayed())
		{
			System.out.println("Web Portal trading is working perfectly fine");
		}
		
		else
		{
			System.out.println("Web Portal trading is not working");
		}
	}
	@Test(priority=8)
	void tradingappdevelopment() throws InterruptedException 
	{
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Trading App Development in Massachusetts']")).click();
		Thread.sleep(4000);
		
		WebElement tad = driver.findElement(By.xpath("//h1[@class='cm-section-h']"));
		if(tad.isDisplayed())
		{
			System.out.println("Trading App Development is working perfectly fine");
		}
		
		else
		{
			System.out.println("Trading App Development is not working");
		}
	}
	
	@Test(priority=9)
	void portfolio() throws InterruptedException 
	{
		driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='Portfolio']")).click();
		Thread.sleep(4000);
		
		WebElement p = driver.findElement(By.xpath("//div[normalize-space()='Development']']"));
		if(p.isDisplayed())
		{
			System.out.println("Portfolio tab is working perfectly fine");
		}
		
		else
		{
			System.out.println("Portfolio tab is not working");
		}
	}

}


