package tranktech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tranktech_verticals {
	String driverPath= "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
    @BeforeTest
	void navigate(){
		driver.get("https://www.tranktechnologies.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
    
    @Test(priority=0)
    void ver() {
		WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
	}
    
    @Test(priority=1)
    void trading() {
		WebElement trading=driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
		Actions a=new Actions(driver);
		a.moveToElement(trading).perform();
    }
    
    @Test(priority=1)
    void stocktrading() {
    	WebElement stocktrading=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Stock Trading']"));
		Actions a=new Actions(driver);
		a.moveToElement(stocktrading).perform();
		stocktrading.click();
    }
    
    @Test(priority=2)
    void algotrading() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement algotrading=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Algo Trading']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(algotrading).perform();
		algotrading.click();
    }
    
    @Test(priority=3)
    void papertrading() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement papertrading=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Paper Trading']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(papertrading).perform();
		papertrading.click();
    }
    
    @Test(priority=4)
    void customtrading() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement customtrading=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Custom Trading']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(customtrading).perform();
		customtrading.click();
    }
    
    @Test(priority=5)
    void cfdtrading() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement cfdtrading=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='CFD Trading']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(cfdtrading).perform();
		cfdtrading.click();
    }
    
    @Test(priority=6)
    void web_portal_trading() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement web_portal_trading=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Web Portal Trading']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(web_portal_trading).perform();
		web_portal_trading.click();
    }
    
    @Test(priority=7)
    void trading_app_dev_in_mass() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement trading_app_dev_in_mass=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Trading App Development in Massachusetts']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(trading_app_dev_in_mass).perform();
		trading_app_dev_in_mass.click();
    }
    
    @Test(priority=8)
    void retail_and_ecommerce() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement retail_and_ecommerce=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(retail_and_ecommerce).perform();
		retail_and_ecommerce.click();
    }
    
    @Test(priority=9)
    void ecomm_web_dev() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement retail_and_ecommerce=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		WebElement ecomm_web_dev=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='eCommerce Website Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(retail_and_ecommerce).perform();
		a.moveToElement(ecomm_web_dev).perform();
		ecomm_web_dev.click();
    }
    
    @Test(priority=10)
    void ecomm_app_dev() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement retail_and_ecommerce=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		WebElement ecomm_app_dev=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='eCommerce App Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(retail_and_ecommerce).perform();
		a.moveToElement(ecomm_app_dev).perform();
		ecomm_app_dev.click();
    }
    
    @Test(priority=11)
    void health_care() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement health_care=driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(health_care).perform();
		health_care.click();
    }
    
    
    @Test(priority=12)
    void diet_and_nutrition() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement health_care=driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		WebElement diet_and_nutrition=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Diet & Nutritions']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(health_care).perform();
		a.moveToElement(diet_and_nutrition).perform();
		diet_and_nutrition.click();
    }
    
    
    @Test(priority=13)
    void health_tracking_app() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement health_care=driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		WebElement health_tracking_app=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Health tracking App']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(health_care).perform();
		a.moveToElement(health_tracking_app).perform();
		health_tracking_app.click();
    }
    
    
    @Test(priority=14)
    void fintech() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		WebElement fintech=driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(fintech).perform();
		fintech.click();
    }
    
    
    @Test(priority=15)
    void pos_software_dev() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement fintech=driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		WebElement pos_software_dev=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Pos Software Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(fintech).perform();
		a.moveToElement(pos_software_dev).perform();
		pos_software_dev.click();
    }
    
    
    @Test(priority=16)
    void crypto() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement fintech=driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		WebElement crypto=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Crypto']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(fintech).perform();
		a.moveToElement(crypto).perform();
		crypto.click();
    }
    
    @Test(priority=17)
    void custom_app() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement custom_app=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement( custom_app).perform();
		 custom_app.click();
    }
    
    
    @Test(priority=18)
    void des_app_dev() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement custom_app=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
   		WebElement des_app_dev=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Desktop App Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(custom_app).perform();
		a.moveToElement(des_app_dev).perform();
		des_app_dev.click();
    }
    
    
    @Test(priority=19)
    void crm_dev() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement custom_app=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement crm_dev=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='CRM Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(custom_app).perform();
		a.moveToElement(crm_dev).perform();
		crm_dev.click();
    }
    
    
    @Test(priority=20)
    void HRM_Development() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement custom_app=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement HRM_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='HRM Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(custom_app).perform();
		a.moveToElement(HRM_Development).perform();
		HRM_Development.click();
    }
    
    
    @Test(priority=21)
    void ERP_App_Development() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement Custom_App=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
    	WebElement ERP_App_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='ERP App Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(Custom_App).perform();
		a.moveToElement(ERP_App_Development).perform();
		ERP_App_Development.click();
    }
    
    
    @Test(priority=22)
    void Travel() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement Custom_App=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement Travel=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Travel']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(Custom_App).perform();
		a.moveToElement(Travel).perform();
		Travel.click();
    }
    
    
    
    @Test(priority=23)
    void E_Learning() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement Custom_App=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement E_Learning=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='E-Learning']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(Custom_App).perform();
		a.moveToElement(E_Learning).perform();
		E_Learning.click();
    }
    
    
    @Test(priority=24)
    void Dating_App_Development() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement Custom_App=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement Dating_App_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Dating App Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(Custom_App).perform();
		a.moveToElement(Dating_App_Development).perform();
		Dating_App_Development.click();
    }
    
    
    @Test(priority=25)
    void Real_Estate() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement Custom_App=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement Real_Estate=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Real Estate']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(Custom_App).perform();
		a.moveToElement(Real_Estate).perform();
		Real_Estate.click();
    }
    
    
    @Test(priority=26)
    void CRM_Development_USA() {
    	WebElement ver=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
    	WebElement Custom_App=driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		WebElement CRM_Development_USA=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='CRM Development USA']"));
		Actions a=new Actions(driver);
		a.moveToElement(ver).perform();
		a.moveToElement(Custom_App).perform();
		a.moveToElement(CRM_Development_USA).perform();
		CRM_Development_USA.click();
    }
}
