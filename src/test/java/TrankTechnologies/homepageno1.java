package TrankTechnologies;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.Iterator;
import java.util.Set;

  public class homepageno1 {
	 String driverPath = "C:\\Users\\guess\\Downloads\\chromedriver-win64\\chromedriver.exe";
	 WebDriver driver= new ChromeDriver();
	
  @BeforeTest
	public void navigate() throws InterruptedException
	   {  
		 driver.get("https://www.tranktechnologies.com/"); 
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
       }
  
 /*  //Contact
  @Test(priority=0)
 void contact() throws InterruptedException 
    { 
 	 WebElement contact = driver.findElement(By.xpath("//div[@class='cm-page-center']//li[1]//a[1]"));contact.click(); 
      Thread.sleep(5000); 
   
	   driver.switchTo().alert().dismiss();  
	  Thread.sleep(2000);
    }      */
  
  //WhatsApp
@Test(priority=1) 
 void whatsapp() throws InterruptedException 
  {
	 Thread.sleep(2000);
	 WebElement WApp = driver.findElement(By.xpath("//a[@class='cm-wa-btn box-shadow-2']")); WApp.click();
		Thread.sleep(5000); 
		 String pw =driver.getWindowHandle();
	     Set<String> all=driver.getWindowHandles();
	          for(String a : all )
	                 {
		                  if (!(pw.equals(a))) {
			              driver.switchTo().window(a);
		                 // Thread.sleep(3000);
	                 }
		                  driver.switchTo().alert().dismiss();  
		    	          driver.switchTo().defaultContent();   
	                 }
	          
  }
  
 //Country selector
   @Test(priority=2)
   public void Country() throws InterruptedException 
     {
		 WebElement country = driver.findElement(By.xpath("//select[@id='countrySelector']")); country.click();
		 Actions a = new Actions (driver);
		 a.moveToElement(country).perform();
		 		 
		 WebElement IND = driver.findElement(By.xpath("//option[@value='india']"));IND.click();
		 Thread.sleep(2000);
		 
		 WebElement USA = driver.findElement(By.xpath("//option[@value='usa']"));USA.click();
		 Thread.sleep(2000);
		 
		 WebElement UAE = driver.findElement(By.xpath("//option[@value='uae']"));UAE.click();
		 Thread.sleep(2000);
      }
   
 // Free Quote
    @Test(priority=3)
    public void FreeQuote() throws InterruptedException 
     { 	
        WebElement Quote = driver.findElement(By.xpath("//a[@class='scroll']")); Quote.click();
        Thread.sleep(2000);	

        WebElement close = driver.findElement(By.xpath("//div[@class='cm-close-btn']"));close.click();
     }	
  
 //Explore
	@Test(priority=4)
    public void Explore()
    {
	   driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
	   WebElement Explore = driver.findElement(By.xpath("//div[@class='cm-home-slide slick-slide slick-current slick-active']//a[@class='cm-slider-btn cm-prim-bg'][normalize-space()='Explore More']")); Explore.click();  
    }

 //Know More
   @Test(priority=5)
   public void knowmore() 
     {
	  driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
	  WebElement KnowMore = driver.findElement(By.xpath("//a[normalize-space()='Know More']"));KnowMore.click();
     }
 
 //What We Offer
   @Test(priority=6)
   void whatweoffer() throws InterruptedException
   { 
     WebElement RightArrow = driver.findElement(By.xpath("//div[@class='cm-home-offer-right-col cm-home-offer-slider cm-lr-pad slick-initialized slick-slider']//button[@aria-label='Next'][normalize-space()='Next']"));RightArrow.click();
     Thread.sleep(5000);
	    		 
     WebElement LeftArrow = driver.findElement(By.xpath("//div[@class='cm-home-offer-right-col cm-home-offer-slider cm-lr-pad slick-initialized slick-slider']//button[@aria-label='Previous'][normalize-space()='Previous']"));LeftArrow.click();
     Thread.sleep(5000);
   }

//Researching,planning & Results
   @Test(priority=7)
    void Research() throws InterruptedException 
    {
       WebElement market = driver.findElement(By.xpath("//div[@class='cm-col cm-col1 cm-wd-50']//div[1]"));
       Actions a = new Actions(driver);
       a.moveToElement(market).perform();
       Thread.sleep(5000);

       WebElement Roadmap = driver.findElement(By.xpath("//div[@class='cm-col cm-col2 cm-wd-50']//div[1]"));
       a.moveToElement(Roadmap).perform();
       Thread.sleep(5000);
   
       WebElement Customer = driver.findElement(By.xpath("//div[@class='cm-col cm-col2 cm-wd-50']//div[2]"));
       a.moveToElement(Customer).perform();
       Thread.sleep(5000);
   
       WebElement Planning = driver.findElement(By.xpath("//div[@class='cm-col cm-col1 cm-wd-50']//div[2]"));
       a.moveToElement(Planning).perform();
       Thread.sleep(5000);    
    }

 //Refund & Cancellation Policy
   @Test(priority=8)
   void RCP() throws InterruptedException 
   {
       WebElement careers=driver.findElement(By.xpath("//a[normalize-space()='Careers']"));careers.click();

       Thread.sleep(2000);
       driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
       WebElement Terms=driver.findElement(By.xpath("//a[normalize-space()='Terms & Conditions']"));Terms.click();

       Thread.sleep(2000);
       driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
       WebElement privacy=driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']"));privacy.click();

       Thread.sleep(2000);
       driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
       WebElement Refund = driver.findElement(By.xpath("//a[normalize-space()='Refund and Cancellation Policy']"));Refund.click();
   }

 //Web Development
   @Test(priority=9)
    void WebDev() throws InterruptedException
   {
        WebElement CMSWebDev = driver.findElement(By.xpath("//a[normalize-space()='CMS Website Development']"));CMSWebDev.click();
        Thread.sleep(2000);
	
        driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
        WebElement eCommDev  = driver.findElement(By.xpath("//a[contains(text(),'eCommerce Development')]"));eCommDev.click();
        Thread.sleep(2000);
 
        driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
        WebElement DropDown = driver.findElement(By.xpath("//div[@class='cm-footer-links-wrapper cm-flex-type-1']//div[1]//ul[1]//li[3]//div[1]//div[1]//div[1]//span[2]//i[1]"));DropDown.click();
        Thread.sleep(2000);

        WebElement Delhi = driver.findElement(By.xpath("//a[normalize-space()='Website Development Delhi']"));Delhi.click();
        driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
        Thread.sleep(2000);
        driver.switchTo().defaultContent();   //New Tab
        
        WebElement Custom = driver.findElement(By.xpath("//a[normalize-space()='Custom Web Portal Development']"));Custom.click();
        Thread.sleep(2000);
   }

 //UI UX Design
   @Test(priority=10)
    void UIUX() throws InterruptedException 
   {
         WebElement UIUX = driver.findElement(By.xpath("//a[normalize-space()='UI UX Design']"));UIUX.click();
         Thread.sleep(2000);
	
         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
         WebElement mobile= driver.findElement(By.xpath("//a[normalize-space()='Mobile App Design']"));mobile.click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
         WebElement WebDesign = driver.findElement(By.xpath("//a[normalize-space()='Responsive Web Design']"));WebDesign.click();
         Thread.sleep(2000);

         WebElement BrandId = driver.findElement(By.xpath("//a[normalize-space()='Brand Identity Design']"));BrandId.click();
    }

 //APP Development
    @Test(priority=11)
    void APPDEV() throws InterruptedException 
    {
         WebElement AppDev =driver.findElement(By.xpath("//a[normalize-space()='App Development']"));AppDev.click();
         Thread.sleep(5000);

         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
         WebElement iOSAD =driver.findElement(By.xpath("//a[normalize-space()='iOS App Development']"));iOSAD.click();
         Thread.sleep(5000);

         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
         WebElement AndroidAD =driver.findElement(By.xpath("//a[normalize-space()='Android App Development']"));AndroidAD.click();
         Thread.sleep(5000);
	
         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
         WebElement DropD = driver.findElement(By.xpath("//div[2]//ul[1]//li[3]//div[1]//div[1]//div[1]//span[2]//i[1]"));DropD.click(); 
         WebElement AADD = driver.findElement(By.xpath("//a[normalize-space()='Android App Development Delhi']"));AADD.click();
         Thread.sleep(5000);
         driver.switchTo().defaultContent();   //New Tab

         WebElement DropDown = driver.findElement(By.xpath("//div[2]//ul[1]//li[3]//div[1]//div[1]//div[1]//span[2]//i[1]"));DropDown.click(); 
         WebElement AADelhi= driver.findElement(By.xpath("//a[normalize-space()='App Development Delhi']"));AADelhi.click();
         Thread.sleep(5000);
         driver.switchTo().defaultContent();   //New Tab
     
         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
         WebElement Hybrid = driver.findElement(By.xpath("//a[normalize-space()='Hybrid Mobile App Development']"));Hybrid.click();
         Thread.sleep(5000);
    
         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();   
         WebElement Cross = driver.findElement(By.xpath("//a[normalize-space()='Cross-Platform App Development']"));Cross.click();
         Thread.sleep(5000);
    
         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();   
         WebElement Progressive = driver.findElement(By.xpath("//a[normalize-space()='Progressive Web App Development']"));Progressive.click();
         Thread.sleep(5000);
    }

  //Graphic Design
    @Test(priority=12)
     void Graphic() throws InterruptedException 
    {	
	     WebElement GraphicD =driver.findElement(By.xpath("//a[normalize-space()='Graphic Design']"));GraphicD.click();
         Thread.sleep(5000);

         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
         WebElement LogoD=driver.findElement(By.xpath("//a[normalize-space()='Logo Design']"));LogoD.click();
         Thread.sleep(5000);

         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
         WebElement BannerD =driver.findElement(By.xpath("//a[normalize-space()='Banner Design']"));BannerD.click();
         Thread.sleep(5000);
	
         driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
         WebElement PackagingD = driver.findElement(By.xpath("//a[normalize-space()='Packaging Design']"));PackagingD.click();
         Thread.sleep(5000);

         WebElement BCardsD= driver.findElement(By.xpath("//a[normalize-space()='Business cards Design']"));BCardsD.click();
         Thread.sleep(5000);
   }

  //Follow Us
     @Test(priority=13)
      void follow() throws InterruptedException 
     {
         WebElement Location= driver.findElement(By.xpath("//li[3]//address[1]"));Location.click();
         Thread.sleep(10000);
         driver.switchTo().defaultContent();   
     }

  // Website Icons
  @Test(priority=14)
 void WebIcons() throws InterruptedException
     {       
	        JavascriptExecutor JS =  (JavascriptExecutor)driver;
    		 WebElement Facebook = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]/parent::a"));
    		 JS.executeScript("window.scrollBy(0,1000);", Facebook);
    		 Facebook.click();
    		 //Thread.sleep(2000);
    		 
    		 Set<String> allwindow = driver.getWindowHandles();
    		 Iterator <String> IT = allwindow.iterator();
    		 String parent = IT.next();
    		 System.out.println(parent);
    		 
    		 String child=IT.next();
    		 System.out.println(child);
    		 
    		 driver.switchTo().window(child);
    		 driver.close();
    		 driver.switchTo().window(parent);   
    		
    		 driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
    	     WebElement LinkedIn = driver.findElement(By.xpath("//img[@alt='LinkedIn']"));
    	     LinkedIn.click();
    		 Thread.sleep(2000);
    		 JS.executeScript("window.scrollBy(0,1000);", LinkedIn);
    		 driver.switchTo().window(child);
    		 driver.close();
    		 //driver.switchTo().defaultContent();  
    		 
    		 driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
    	     WebElement Instagram = driver.findElement(By.xpath("//img[@alt=\"Instagram\"]"));
    	     Instagram.click();
    		 Thread.sleep(2000);
    		 JS.executeScript("window.scrollBy(0,1000);", Instagram);
    		 driver.switchTo().window(child);
    		 driver.close();
    		// driver.switchTo().defaultContent();   
    		 
    		 driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
    	     WebElement Pinterest = driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/pinterest.png']"));
    	     Pinterest.click();
    		 Thread.sleep(2000);
    		 JS.executeScript("window.scrollBy(0,1000);", Pinterest);
    		 driver.switchTo().window(child);
    		 driver.close();
    		 //driver.switchTo().defaultContent();   
    		 
    		 driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
    	     WebElement Twitter = driver.findElement(By.xpath("//img[@alt='Twitter']"));
    	     Twitter.click();
    		 Thread.sleep(2000);
    		 JS.executeScript("window.scrollBy(0,1000);", Twitter);
    		 driver.switchTo().window(child);
    		 driver.close();
    		// driver.switchTo().defaultContent();   
    		 
    		 driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
    		 WebElement YouTube = driver.findElement(By.xpath("//img[@alt='Youtube']"));
    		 YouTube.click();
    		 Thread.sleep(2000);
    		 JS.executeScript("window.scrollBy(0,1000);", YouTube);
    		 driver.switchTo().window(child);
    		 driver.close();
    		 //driver.switchTo().defaultContent();   
    		 
             driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
    	     WebElement Quora = driver.findElement(By.xpath("//img[@alt='Quora']"));
    	     Quora.click();
    	     JS.executeScript("window.scrollBy(0,1000);", Quora);
    	     driver.switchTo().window(child);
    	    Thread.sleep(2000);
     }
  
  //ChatBox
  @Test(priority=15)
    void chatBox() throws InterruptedException {
	  Thread.sleep(5000);
         WebElement ChatBox = driver.findElement(By.xpath("//*[name()='path' and contains(@fill-rule,'evenodd')]"));ChatBox.click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//div[@isroundwidget='true']//div//*[name()='svg']")).click();
    } 

//Connect With Us
 @Test(priority=16)
  void connect() throws InterruptedException 
   {   Thread.sleep(5000);
	 WebElement MailUs = driver.findElement(By.xpath("//a[contains(text(),'info@tranktechnologies.com')]"));MailUs.click();
		 
	 driver.findElement(By.xpath("//img[@src='https://www.tranktechnologies.com/assets/new-assets/logo/trank-logo.webp']")).click();  
	 Thread.sleep(2000);
	 
	 WebElement SkypeWithUs = driver.findElement(By.xpath("//a[normalize-space()='Trank Technologies']"));SkypeWithUs.click();  
	 //Not working 
  }
 
   @AfterTest
    public void close() throws InterruptedException
    {
		 driver.quit();
    } 

 }




 

 

 

 
	   

 
 
 