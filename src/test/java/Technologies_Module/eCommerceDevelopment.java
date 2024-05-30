package Technologies_Module;

//import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class eCommerceDevelopment {
	String driverPath = "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver=new ChromeDriver();
	
	@BeforeTest
	void navigateTo() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
	    driver.get("https://www.tranktechnologies.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}
	@AfterTest
	void exit() {
		driver.quit();
	}
	@Test(priority=1)
	void Technologiesdropdown() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		if(tech.isDisplayed() && tech.isEnabled())
		{
			Actions act=new Actions(driver);
			act.moveToElement(tech).perform();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Technologies dropdown is either not displayed or not enabled");
		}
				
	}
	@Test(priority=2)
	void eCommercedropdown() throws InterruptedException {
		WebElement eComm=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		if(eComm.isDisplayed() && eComm.isEnabled())
		{
			Actions act=new Actions(driver);
			act.moveToElement(eComm).perform();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("eCommerce dropdown is either not displayed or not enabled");
		}
				
	}
	@Test(priority=3)
	void MagentoDev() throws InterruptedException {
		WebElement mag=driver.findElement(By.xpath("//a[normalize-space()='Magento Development']"));
		if(mag.isDisplayed() && mag.isEnabled())
		{
			mag.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Magento Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=4)
	void CodeigniterDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement cod=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Codeigniter Development']"));
		if(cod.isDisplayed() && cod.isEnabled())
		{
			cod.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Codeigniter Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=5)
	void BigCom() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement big=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Big Commerce']"));
		if(big.isDisplayed() && big.isEnabled())
		{
			big.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Big Commerce is either not displayed or not enabled");
		}
				
	}
	@Test(priority=5)
	void CSCart() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement cs=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='CS-Cart Development']"));
		if(cs.isDisplayed() && cs.isEnabled())
		{
			cs.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("CS-Cart Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=6)
	void NopCom() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement nop=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Nop Commerce']"));
		if(nop.isDisplayed() && nop.isEnabled())
		{
			nop.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Nop Commerce is either not displayed or not enabled");
		}
				
	}
	@Test(priority=7)
	void LaravelDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement lar=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Laravel Development']"));
		if(lar.isDisplayed() && lar.isEnabled())
		{
			lar.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Laravel Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=8)
	void DrupalDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement dru=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Drupal Development']"));
		if(dru.isDisplayed() && dru.isEnabled())
		{
			dru.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Drupal Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=9)
	void JoomlaDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement joo=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Joomla Development']"));
		if(joo.isDisplayed() && joo.isEnabled())
		{
			joo.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Joomla Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=10)
	void ExpressJSDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement exp=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Express JS Development']"));
		if(exp.isDisplayed() && exp.isEnabled())
		{
			exp.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Express JS Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=11)
	void OpencartDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement ope=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Opencart Development']"));
		if(ope.isDisplayed() && ope.isEnabled())
		{
			ope.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Opencart Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=12)
	void WordPressDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement wor=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='WordPress Development']"));
		if(wor.isDisplayed() && wor.isEnabled())
		{
			wor.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("WordPress Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=13)
	void ShopifyDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement sho=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Shopify Development']"));
		if(sho.isDisplayed() && sho.isEnabled())
		{
			sho.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Shopify Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=14)
	void NodeJSDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement nod=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Node JS Development']"));
		if(nod.isDisplayed() && nod.isEnabled())
		{
			nod.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("NodeJS Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=15)
	void WooCom() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement woo=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Woo Commerce']"));
		if(woo.isDisplayed() && woo.isEnabled())
		{
			woo.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Woo commerce is either not displayed or not enabled");
		}
				
	}
	@Test(priority=16)
	void PrestashopDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement pre=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Prestashop Development']"));
		if(pre.isDisplayed() && pre.isEnabled())
		{
			pre.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Prestashop Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=17)
	void WixDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement wix=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Wix Development']"));
		if(wix.isDisplayed() && wix.isEnabled())
		{
			wix.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Wix Development is either not displayed or not enabled");
		}
				
	}
	@Test(priority=18)
	void ReactJSDev() throws InterruptedException {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions act=new Actions(driver);
		act.moveToElement(tech).perform();
		Thread.sleep(2000);
		WebElement rea=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='React JS Development']"));
		if(rea.isDisplayed() && rea.isEnabled())
		{
			rea.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("ReactJS Development is either not displayed or not enabled");
		}
				
	}

}
