package Trank_Technologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Technologies {
	String driverPath = "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() {
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	void tech() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		}
	
	@Test(priority=2)
	void magento() {
		WebElement mag=driver.findElement(By.xpath("//a[normalize-space()='Magento Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(mag).perform();
		mag.click();
	}
	
	@Test(priority=3)
	void codeigniter() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement code=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Codeigniter Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(code).perform();
		code.click();
		}

	@Test(priority=4)
	void big_commerce() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement big=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Big Commerce']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(big).perform();
		big.click();
		}
	
	@Test(priority=5)
	void CS_cart() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement cs=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='CS-Cart Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(cs).perform();
		cs.click();
		}
	
	@Test(priority=6)
	void nop_commerce() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement nop=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Nop Commerce']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(nop).perform();
		nop.click();
		}
	
	@Test(priority=7)
	void laravel() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement lara=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Laravel Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(lara).perform();
		lara.click();
		}
	
	@Test(priority=8)
	void drupal() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement drup=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Drupal Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(drup).perform();
		drup.click();
		}
	
	@Test(priority=9)
	void joomla() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement joo=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Joomla Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(joo).perform();
		joo.click();
		}
	
	@Test(priority=10)
	void Express_JS() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement js=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Express JS Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(js).perform();
		js.click();
		}
	
	@Test(priority=11)
	void opencart() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement open=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Opencart Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(open).perform();
		open.click();
		}
	
	@Test(priority=12)
	void wordpress() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement wor=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='WordPress Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(wor).perform();
		wor.click();
		}
	
	@Test(priority=13)
	void shopify() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement sho=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Shopify Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(sho).perform();
		sho.click();
		}
	
	@Test(priority=14)
	void Node_JS() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement node=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Node JS Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(node).perform();
		node.click();
		}
	
	@Test(priority=15)
	void woo_commerce() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement woo=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='WordPress Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(woo).perform();
		woo.click();
		}
	
	@Test(priority=16)
	void Prestashop() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement pre=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Prestashop Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(pre).perform();
		pre.click();
		}
	
	@Test(priority=17)
	void Wix() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement wix=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Wix Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(wix).perform();
		wix.click();
		}
	
	@Test(priority=18)
	void React_JS() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement react=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='React JS Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(react).perform();
		react.click();
		}
	
	@Test(priority=19)
	void react_native() throws InterruptedException{
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement mob=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		Thread.sleep(2000);
		WebElement react=driver.findElement(By.xpath("//a[@href=\"https://www.tranktechnologies.com/react-native-mobile-app-development\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(mob).perform();
		a.moveToElement(react).perform();
		react.click();
		}
	
	@Test(priority=20)
	void xamarin() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement mob=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement xam=driver.findElement(By.xpath("//a[contains(text(),'Xamarin Mobile App Development')]"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(mob).perform();
		a.moveToElement(xam).perform();
		xam.click();
		}
	
	@Test(priority=21)
	void flutter() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement mob=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement flut=driver.findElement(By.xpath("//a[contains(text(),'Flutter Mobile App Development')]"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(mob).perform();
		a.moveToElement(flut).perform();
		flut.click();
		}
	
	@Test(priority=22)
	void swift() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement mob=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement swi=driver.findElement(By.xpath("//a[contains(text(),'Swift App Development')]"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(mob).perform();
		a.moveToElement(swi).perform();
		swi.click();
		}
	
	@Test(priority=23)
	void enterprise() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement mob=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement enter=driver.findElement(By.xpath("//a[contains(text(),'Enterprise Mobile App Development')]"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(mob).perform();
		a.moveToElement(enter).perform();
		enter.click();
		}
	
	@Test(priority=24)
	void kotlin() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement mob=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement kot=driver.findElement(By.xpath("//a[contains(text(),'Kotlin Mobile App Development')]"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(mob).perform();
		a.moveToElement(kot).perform();
		kot.click();
		}
	
	@Test(priority=25)
	void ionic() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement mob=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement ion=driver.findElement(By.xpath("//a[contains(text(),'Ionic App Development')]"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(mob).perform();
		a.moveToElement(ion).perform();
		ion.click();
		}
	
	@Test(priority=26)
	void appointment_booking() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement mob=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement app=driver.findElement(By.xpath("//a[contains(text(),'Appointment Booking Development')]"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(mob).perform();
		a.moveToElement(app).perform();
		app.click();
		}
	
	@Test(priority=27)
	void AI() {
		WebElement tech=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement AI=driver.findElement(By.xpath("//strong[normalize-space()='Artificial Intelligence']"));
		Actions a = new Actions(driver);
		a.moveToElement(tech).perform();
		a.moveToElement(AI).perform();
		AI.click();
		}
	
	@AfterTest
	void quit() {
		driver.quit();
	}
	
	
	
	
	
	
	

}
