package tranktechnologiesproject;

import org.testng.annotations.Test;
import java.io.File;
import java.nio.file.Files;
import java.util.Set;

import javax.swing.text.DocumentFilter.FilterBypass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class class2Test {
String  psthway= ("C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
   WebDriver driver= new ChromeDriver() ;
   Actions a=new Actions(driver);

@BeforeTest
void login() throws InterruptedException {
driver.get("https://www.tranktechnologies.com/");
driver.manage().window().maximize();
//Thread.sleep(2000);
   }
@Test(priority=0)

void ecoomerceclick() {
	WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
	a.moveToElement(TECHNOLOGIES).perform();
	driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']")).click();
}
void technologies ()throws InterruptedException{
Thread.sleep(2000);


WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
a.moveToElement(TECHNOLOGIES).build().perform();   
   }
@Test(priority=1)

void megento() throws Exception{
	//Thread.sleep(4000);

driver.findElement(By.xpath("//a[normalize-space()='Magento Development']")).click();
WebElement ravi=driver.findElement(By.xpath("//h1[@class='aos-init aos-animate']"));
ravi.isDisplayed();
driver.navigate().back();
}
@Test(priority=2)

 void opencart() throws InterruptedException {
	// Thread.sleep(4000);

	 WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
		a.moveToElement(TECHNOLOGIES).build().perform(); 


WebElement t=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Opencart Development']"));
t.click();
WebElement r=driver.findElement(By.xpath("//div[@class='header-center cm-flex-type-1 cm-pos-relative']"));
r.isDisplayed();
 }
 
	@Test(priority=3)

 void codeinginter() throws InterruptedException{
	// Thread.sleep(4000);

WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
a.moveToElement(TECHNOLOGIES).build().perform(); 
 driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Codeigniter Development']")).click();
driver.findElement(By.xpath("//h1[contains(text(),'CodeIgniter Development')]")).isDisplayed();

 }
	@Test(priority=4)


 void wordpress() throws InterruptedException{
	// Thread.sleep(4000);

WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
a.moveToElement(TECHNOLOGIES).build().perform(); 
 driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='WordPress Development']")).click();
driver.findElement(By.xpath("//h1[contains(text(),'WordPress Web Development')]")).isDisplayed();

}

	@Test(priority=5)

	void bigCommerce() throws InterruptedException {
		//Thread.sleep(4000);

		WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
		a.moveToElement(TECHNOLOGIES).build().perform(); 
		driver.findElement(By.linkText("Big Commerce")).click();
		driver.findElement(By.xpath("//h1[contains(text(),'BigCommerce Development')]")).isDisplayed();

	}
	@Test(priority=6)

	void Shopfy() throws InterruptedException {
		//Thread.sleep(4000);
		WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));

		a.moveToElement(TECHNOLOGIES).build().perform(); 
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Shopify Development']")).click();
		driver.findElement(By.xpath("//h1[normalize-space()='Shopify Web Design & Development Company']")).isDisplayed();

	}
	
	@Test(priority=7)

	void CSCart() throws InterruptedException {
		//Thread.sleep(4000);

		WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
		a.moveToElement(TECHNOLOGIES).build().perform(); 
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='CS-Cart Development']")).click();
		driver.findElement(By.xpath("//h1[contains(text(),'CS-Cart Development')]")).isDisplayed();
	}
	@Test(priority=8)

	void NodeJS() throws InterruptedException {
		//Thread.sleep(4000);

		WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
		a.moveToElement(TECHNOLOGIES).build().perform(); 
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Node JS Development']")).click();
		driver.findElement(By.xpath("//h1[contains(text(),'Fast-Growing NodeJS')]")).isDisplayed();
	}

	@Test(priority=9)

	void Nope() throws InterruptedException {
		//Thread.sleep(4000);

		WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
		a.moveToElement(TECHNOLOGIES).build().perform(); 
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Nop Commerce']")).click();
		driver.findElement(By.xpath("//h1[contains(text(),'NopCommerce Design & Development Company for All-E')]")).isDisplayed();
	}
	@Test(priority=10)

	void wooCommerce() throws InterruptedException {
		//Thread.sleep(4000);

		WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
		a.moveToElement(TECHNOLOGIES).perform(); 
		driver.findElement(By.linkText("Woo Commerce")).click();
		driver.findElement(By.xpath("//h1[normalize-space()='WooCommerce Design & Development Company']")).isDisplayed();
	}
	@Test(priority=11)

	void LaravelDevlopment() throws InterruptedException {
	//	Thread.sleep(4000);

		WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
		a.moveToElement(TECHNOLOGIES).build().perform(); 
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Laravel Development']")).click();
		driver.findElement(By.xpath("//h1[normalize-space()='Laravel Web DevelopmentCompany in India']")).isDisplayed();
	}
	@Test(priority=12)

	void PrestashopDevelopment() throws InterruptedException {
		//Thread.sleep(4000);

		WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
		a.moveToElement(TECHNOLOGIES).build().perform(); 
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Prestashop Development']")).click();
		driver.findElement(By.xpath("//h1[contains(text(),'PrestaShop Web Design &')]")).isDisplayed();
	}
	@Test(priority=13)


	void DrupalDevelopment()throws InterruptedException {
	//	Thread.sleep(4000);

		WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
		a.moveToElement(TECHNOLOGIES).perform(); 
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Drupal Development']")).click();
		driver.findElement(By.xpath("//h1[normalize-space()='Drupal Development Company in India']")).isDisplayed();
	
	}
	
	
	@Test(priority=14)
	void WxxDevelopment() throws InterruptedException {
	//	Thread.sleep(4000);

		WebElement TECHNOLOGIES=driver.findElement(By.xpath("//body/header/div[@class='menu']/ul[@class='cm-flex-type-2']/li[2]"));
		a.moveToElement(TECHNOLOGIES).perform(); 
		driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Wix Development']")).click();
		driver.findElement(By.xpath("//h1[normalize-space()='Wix Website Development Company']")).isDisplayed();
	driver.navigate().back();
	}
	@Test(priority=15,enabled=false)

void Geta() throws InterruptedException {
	driver.findElement(By.xpath("//a[@class='scroll']")).click();
	driver.findElement(By.xpath("//div[@class='cm-form-field']//input[@placeholder='Your Name']")).sendKeys("ravi");
	driver.findElement(By.xpath("//div[@class='cm-form-field']//input[@placeholder='Your Mail']")).sendKeys("ravi");
	driver.findElement(By.xpath("//div[@class='cm-form-field']//input[@placeholder='Your Company']")).sendKeys("ravi");
	WebElement name=driver.findElement(By.xpath("//select[@name='service']"));
	Select select= new Select(name);
	Thread.sleep(3000);

	select.selectByVisibleText("Graphic Design")
;	driver.findElement(By.xpath("//div[@class='cm-form-field']//input[@placeholder='Your Phone']")).sendKeys("76767676767");
	driver.findElement(By.xpath("//div[@class='cm-form-field']//textarea[@placeholder='Message']")).sendKeys("hell world");
		//Thread.sleep(5000);
	//	driver.findElement(By.xpath("//div[@class='g-recaptcha']")).click();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//div[@class='cm-close-btn']")).click();
}	@Test(priority=16)

	void contury() throws InterruptedException {
	WebElement m=driver.findElement(By.xpath("//select[@id='countrySelector']"));m	.click();
	Select a= new Select(m);
	a.selectByVisibleText("USA");
	Thread.sleep(3000);
		JavascriptExecutor d= (JavascriptExecutor)driver;
	d.executeScript("window.scrollBy(0,7000)");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//img[@alt='Youtube']")).click();
	String parentwindow= driver.getWindowHandle();
	Set<String> allwindow=driver.getWindowHandles();
	for(String allwindow1:allwindow) {
	if(!(parentwindow.contentEquals(allwindow1))){
		driver.switchTo().window(allwindow1);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("uncodemy");
		driver.findElement(By.xpath("	//button[@id='search-icon-legacy']")).click();

	}
	}
}
@AfterTest
	void close() throws InterruptedException {
		Thread.sleep(4000);

		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

}
