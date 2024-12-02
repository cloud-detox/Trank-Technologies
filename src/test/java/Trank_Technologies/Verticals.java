package Trank_Technologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verticals {
	
	String driverPath = "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() {
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	void verticals() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		}
	
	@Test(priority=2)
	void stock() {
		WebElement st=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Stock Trading']"));
		Actions a = new Actions(driver);
		a.moveToElement(st).perform();
		st.click();
		}
	
	@Test(priority=3)
	void paper() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement pa=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Paper Trading']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(pa).perform();
		pa.click();
		}
	
    @Test(priority=4)
	void CFD_trading() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cfd=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='CFD Trading']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cfd).perform();
		cfd.click();
		}
    
    @Test(priority=5)
    void trading_app_development() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement app=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Trading App Development in Massachusetts']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(app).perform();
		app.click();
		}
	
	@Test(priority=6)
	void algo() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement alg=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Algo Trading']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(alg).perform();
		alg.click();
		}
	
	@Test(priority=7)
	void Custom() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cus=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Custom Trading']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cus).perform();
		cus.click();
		}
	
	@Test(priority=8)
	void web_portal() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement web=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Web Portal Trading']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(web).perform();
		web.click();
		}
	
	@Test(priority=9)
	void retail() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement ret=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(ret).perform();
		ret.click();
		}
//	
	@Test(priority=10)
	void ecomm_app_deve() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement ret=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		WebElement app=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='eCommerce App Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(ret).perform();
		a.moveToElement(app).perform();
		app.click();
		}
//	
	@Test(priority=11)
	void healthcare() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement hlth=driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		WebElement diet=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Diet & Nutritions']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(hlth).perform();
		a.moveToElement(diet).perform();
		diet.click();
		}
//	
	@Test(priority=12)
	void health_tracking() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement hlth=driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		WebElement track=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Health tracking App']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(hlth).perform();
		a.moveToElement(track).perform();
		track.click();
		}
//	
	@Test(priority=13)
	void fintech() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement fin=driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		WebElement pos=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Pos Software Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(fin).perform();
		a.moveToElement(pos).perform();
		pos.click();
		}
//	
	@Test(priority=14)
	void fintech_crypto() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement fin=driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		WebElement cry=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Crypto']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(fin).perform();
		a.moveToElement(cry).perform();
		cry.click();
		}

	@Test(priority=15)
	void custom_desktop() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cus=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement desk=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Desktop App Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cus).perform();
		a.moveToElement(desk).perform();
		desk.click();
		}
	
	@Test(priority=16)
	void cus_hrm() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cus=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement hrm=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='HRM Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cus).perform();
		a.moveToElement(hrm).perform();
		hrm.click();
		}
	
	@Test(priority=17)
	void cus_travel() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cus=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement tra=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Travel']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cus).perform();
		a.moveToElement(tra).perform();
		tra.click();
		}
	
	@Test(priority=18)
	void cus_dating() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cus=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement dat=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Dating App Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cus).perform();
		a.moveToElement(dat).perform();
		dat.click();
		}
	
	@Test(priority=19)
	void cus_crm() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cus=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement crm=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='CRM Development USA']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cus).perform();
		a.moveToElement(crm).perform();
		crm.click();
		}
	
	@Test(priority=20)
	void cus_crm_development() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cus=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement crm1=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='CRM Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cus).perform();
		a.moveToElement(crm1).perform();
		crm1.click();
		}
	
    @Test(priority=21)
	void cus_erp() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cus=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement erp=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='ERP App Development']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cus).perform();
		a.moveToElement(erp).perform();
		erp.click();
		}
	
    @Test(priority=22)
	void cus_elearning() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cus=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement lea=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='E-Learning']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cus).perform();
		a.moveToElement(lea).perform();
		lea.click();
		}
	
    @Test(priority=23)
	void real_estate() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cus=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement real=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Real Estate']"));
		Actions a = new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cus).perform();
		a.moveToElement(real).perform();
		real.click();
		}
    
    @AfterTest()
    	void quit() {
    	driver.quit();
    }
 }
