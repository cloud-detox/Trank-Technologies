package tranktech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tranktech_technologies {
	String driverPath= "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
    @BeforeTest
	void navigate(){
		driver.get("https://www.tranktechnologies.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
    
    @Test(priority=0)
    void techno() {
		WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
	}
    
    @Test(priority=1)
    void ecommerce_dev() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		ecommerce_dev.click();
    }
    
    @Test(priority=2)
    void Codeigniter_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Codeigniter_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Codeigniter Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(Codeigniter_Development).perform();
		Codeigniter_Development.click();	
    }
    
    @Test(priority=3)
    void WordPress_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement WordPress_Development =driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='WordPress Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(WordPress_Development).perform();
		WordPress_Development.click();	
    }
    
    @Test(priority=4)
    void Big_Commerce() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Big_Commerce =driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Big Commerce']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(Big_Commerce).perform();
		Big_Commerce.click();	
    }
    
    @Test(priority=5)
    void Shopify_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Shopify_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Shopify Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(Shopify_Development).perform();
		Shopify_Development.click();	
    }
    
    @Test(priority=6)
    void CS_Cart_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement CS_Cart_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='CS-Cart Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(CS_Cart_Development).perform();
		CS_Cart_Development.click();	
    }
    
    @Test(priority=7)
    void Node_JS_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Node_JS_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Node JS Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(Node_JS_Development).perform();
		Node_JS_Development.click();	
    }
    
    @Test(priority=8)
    void Nop_Commerce() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Nop_Commerce=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Nop Commerce']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement( Nop_Commerce).perform();
		 Nop_Commerce.click();	
    }
    
    @Test(priority=9)
    void Woo_Commerce() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Woo_Commerce=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Woo Commerce']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement( Woo_Commerce).perform();
		Woo_Commerce.click();	
    }
    
    @Test(priority=10)
    void Laravel_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Laravel_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Laravel Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(Laravel_Development).perform();
		Laravel_Development.click();	
    }
    
    @Test(priority=11)
    void Prestashop_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Prestashop_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Prestashop Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(Prestashop_Development).perform();
		Prestashop_Development.click();	
    }
    
    @Test(priority=12)
    void Drupal_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Drupal_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Drupal Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(Drupal_Development).perform();
		Drupal_Development.click();	
    }
    
    @Test(priority=13)
    void Wix_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Wix_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Wix Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(Wix_Development).perform();
		Wix_Development.click();	
    }
    
    @Test(priority=14)
    void Joomla_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Joomla_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Joomla Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(Joomla_Development).perform();
		Joomla_Development.click();	
    }
    
    @Test(priority=15)
    void React_JS_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement React_JS_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='React JS Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(React_JS_Development).perform();
		React_JS_Development.click();	
    }
    
    @Test(priority=16)
    void Express_JS_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement ecommerce_dev=driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		WebElement Express_JS_Development=driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Express JS Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(ecommerce_dev).perform();
		a.moveToElement(Express_JS_Development).perform();
		Express_JS_Development.click();	
    }
    
    @Test(priority=17)
    void  Mobile_App_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		WebElement Mobile_App_Development=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(Mobile_App_Development).perform();
		 Mobile_App_Development.click();	
    }
    
    @Test(priority=18)
    void React_Native_Mobile_App_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
    	WebElement Mobile_App_Development=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement React_Native_Mobile_App_Development=driver.findElement(By.xpath("//a[contains(text(),'React Native Mobile App Development')]"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(Mobile_App_Development).perform();
		a.moveToElement(React_Native_Mobile_App_Development).perform();
		React_Native_Mobile_App_Development.click();	
    }
    
    @Test(priority=19)
    void Enterprise_Mobile_App_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
    	WebElement Mobile_App_Development=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement Enterprise_Mobile_App_Development=driver.findElement(By.xpath("//a[contains(text(),'Enterprise Mobile App Development')]"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(Mobile_App_Development).perform();
		a.moveToElement( Enterprise_Mobile_App_Development).perform();
		 Enterprise_Mobile_App_Development.click();	
    }
    
    @Test(priority=20)
    void Xamarin_Mobile_App_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
    	WebElement Mobile_App_Development=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement Xamarin_Mobile_App_Development=driver.findElement(By.xpath("//a[contains(text(),'Xamarin Mobile App Development')]"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(Mobile_App_Development).perform();
		a.moveToElement(Xamarin_Mobile_App_Development).perform();
		Xamarin_Mobile_App_Development.click();	
    }
		
    
    @Test(priority=21)
    void Kotlin_Mobile_App_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
    	WebElement Mobile_App_Development=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement Kotlin_Mobile_App_Development=driver.findElement(By.xpath("//a[contains(text(),'Kotlin Mobile App Development')]"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(Mobile_App_Development).perform();
		a.moveToElement(Kotlin_Mobile_App_Development).perform();
		Kotlin_Mobile_App_Development.click();	
    }
    
    
    @Test(priority=22)
    void Flutter_Mobile_App_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
    	WebElement Mobile_App_Development=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement Flutter_Mobile_App_Development=driver.findElement(By.xpath("//a[contains(text(),'Flutter Mobile App Development')]"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(Mobile_App_Development).perform();
		a.moveToElement(Flutter_Mobile_App_Development).perform();
		Flutter_Mobile_App_Development.click();	
    }
    
    
    @Test(priority=23)
    void Ionic_App_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
    	WebElement Mobile_App_Development=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement Ionic_App_Development=driver.findElement(By.xpath("//a[contains(text(),'Ionic App Development')]"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(Mobile_App_Development).perform();
		a.moveToElement(Ionic_App_Development).perform();
		Ionic_App_Development.click();	
    }
    
    
    @Test(priority=24)
    void Swift_App_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
    	WebElement Mobile_App_Development=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement Swift_App_Development=driver.findElement(By.xpath("//a[contains(text(),'Swift App Development')]"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(Mobile_App_Development).perform();
		a.moveToElement(Swift_App_Development).perform();
		Swift_App_Development.click();	
    }
    
    
    @Test(priority=25)
    void Appointment_Booking_Development() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
    	WebElement Mobile_App_Development=driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		WebElement Appointment_Booking_Development=driver.findElement(By.xpath("//a[contains(text(),'Appointment Booking Development')]"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(Mobile_App_Development).perform();
		a.moveToElement(Appointment_Booking_Development).perform();
		Appointment_Booking_Development.click();	
    }
    
    
    @Test(priority=26)
    void Artificial_Intelligence() {
    	WebElement techno=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
    	WebElement Artificial_Intelligence=driver.findElement(By.xpath("//strong[normalize-space()='Artificial Intelligence']"));
		Actions a=new Actions(driver);
		a.moveToElement(techno).perform();
		a.moveToElement(Artificial_Intelligence).perform();
		Artificial_Intelligence.click();	
    }
		
}
