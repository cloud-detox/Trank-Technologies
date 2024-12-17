package GlobalLogic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepage {


		
		String driverPath = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		@BeforeTest
		 
			void Navigate() throws InterruptedException 
			{
			
			driver.get("https://globallogistic.co.in/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			}
		 
		 @Test(priority=1)
			void TopNavAbout() throws InterruptedException
			{
			 
			    
				WebElement About = driver.findElement(By.xpath("//span[normalize-space()='About']")); 
				boolean displayed = About.isDisplayed();
				System.out.println(displayed);
				About.click();
				Thread.sleep(2000);
				driver.navigate().back();
			}

		 @Test(priority=2)
			void TopNavService() throws InterruptedException
			{
			 
			WebElement Service = driver.findElement(By.xpath("//span[normalize-space()='Services']"));
			 boolean displayed1 = Service.isDisplayed();
			 System.out.println(displayed1);
			 Service.click();
				Thread.sleep(2000);
				driver.navigate().back();
			}
		 
		 @Test(priority=3)
			void TopNavCareers() throws InterruptedException
			{
			 
			 WebElement Careers = driver.findElement(By.xpath("//span[normalize-space()='Careers']"));
			 boolean displayed2 = Careers.isDisplayed();
			 System.out.println(displayed2);
			 Careers.click();
				Thread.sleep(2000);
				driver.navigate().back();
			 
			}
		 
		 @Test(priority=4)
			void TopNavContact() throws InterruptedException
			
			{
			 WebElement Contact = driver.findElement(By.xpath("//span[normalize-space()='Contact']"));
			 boolean displayed3 = Contact.isDisplayed();
			 System.out.println(displayed3);	
			 
			 Contact.click();
				Thread.sleep(2000);
				driver.navigate().back();
			}
		 
		 @Test(priority=5)
			void FaceBookIcon() throws InterruptedException
			
			{
			 WebElement FaceBook = driver.findElement(By.xpath("//body/div[@id='wrap_all']/header[@id='header']/div[@id='header_main']/div[@class='container av-logo-container']/div[@class='inner-container']/ul[@class='noLightbox social_bookmarks icon_count_2']/li[@class='social_bookmarks_facebook av-social-link-facebook social_icon_1']/a[1]"));
			 boolean displayed4 = FaceBook.isDisplayed();
			 System.out.println(displayed4);	
			 
		    //	 FaceBook.click();
	    	//	 Thread.sleep(2000);
			}
		  
		 @Test(priority=6)
			void TwitterIcon() throws InterruptedException
			
			{
			 WebElement Twitter = driver.findElement(By.xpath("//body/div[@id='wrap_all']/header[@id='header']/div[@id='header_main']/div[@class='container av-logo-container']/div[@class='inner-container']/ul[@class='noLightbox social_bookmarks icon_count_2']/li[@class='social_bookmarks_twitter av-social-link-twitter social_icon_2']/a[1]"));
			 boolean displayed5 = Twitter.isDisplayed();
			 System.out.println(displayed5);	
			 
		    //	 Twitter.click();
	 	    //	 Thread.sleep(2000);
			 
			 
			}
		 @Test(priority=7)
			void SearchIcon() throws InterruptedException
			
			{
			 WebElement SearchIcon = driver.findElement(By.xpath("//div[@class='avia-menu av-main-nav-wrap']//ul[@id='avia-menu']//li[@id='menu-item-search']//a[@href='?s=']"));
			 SearchIcon.click();
			 WebElement Searchbox = driver.findElement(By.xpath("//input[@id='s']"));
			 Searchbox.sendKeys("Test");
			 Thread.sleep(2000);
			 WebElement SearchSubmit = driver.findElement(By.xpath("//input[@id='searchsubmit']"));
			 SearchSubmit.click();
			}
		 
		 @Test(priority=8)
			void Banner() throws InterruptedException
			{
			 
			    WebElement BannerHeading = driver.findElement(By.xpath("//h2[@class='avia-caption-title ']")); 
				boolean displayed6 = BannerHeading.isDisplayed();
				System.out.println(displayed6);
				
				WebElement BannerSubHeading = driver.findElement(By.xpath("//p[normalize-space()='Delivering Solutions at your doorstep.']")); 
				boolean displayed7 = BannerSubHeading.isDisplayed();
				System.out.println(displayed7);
				
				WebElement WhoWeAreBtn = driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-light avia-multi-slideshow-button']"));			
				boolean displayed8 = WhoWeAreBtn.isDisplayed();
				System.out.println(displayed8);
				WhoWeAreBtn.click();
				Thread.sleep(2000);
				driver.navigate().back();
				
				WebElement WhatWeDoBtn = driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-theme-color avia-multi-slideshow-button avia-slideshow-button-2']"));			
				boolean displayed9 = WhatWeDoBtn.isDisplayed();
				System.out.println(displayed9);
				WhatWeDoBtn.click();
				Thread.sleep(2000);
				driver.navigate().back();	
			}
		
		 @Test(priority=9)
			void Blog() throws InterruptedException
			{
			 
			    WebElement LandTransportBlog = driver.findElement(By.xpath("//h3[normalize-space()='Land Transportation']")); 
				boolean displayed10 = LandTransportBlog.isDisplayed();
				System.out.println(displayed10);
				
				 WebElement AirFrightBlog = driver.findElement(By.xpath("//h3[normalize-space()='Air Freight']")); 
				 boolean displayed11 = AirFrightBlog.isDisplayed();
				 System.out.println(displayed11);
					
					 WebElement WareHousePackagingBlog = driver.findElement(By.xpath("//h3[normalize-space()='Warehouse Packaging']")); 
					 boolean displayed12 = WareHousePackagingBlog.isDisplayed();
					 System.out.println(displayed12);	 
					
			}
		 
		 @Test(priority=10)
			void QuickOverView() throws InterruptedException
			{
			   
			    WebElement QuickOverViewHeading = driver.findElement(By.xpath("//h2[normalize-space()='Quick Overview']")); 
				boolean displayed13 = QuickOverViewHeading.isDisplayed();
				System.out.println(displayed13);
			 
			 
			    WebElement WelComeNote = driver.findElement(By.xpath("//h3[normalize-space()='Welcome Note']")); 
				boolean displayed14 = WelComeNote.isDisplayed();
				System.out.println(displayed14);
				
				 WebElement WeGotTech = driver.findElement(By.xpath("//h3[contains(text(),'We got the')]")); 
				 boolean displayed15 = WeGotTech.isDisplayed();
				 System.out.println(displayed15); 
				 
				 WebElement CertificateFirm = driver.findElement(By.xpath("//h3[normalize-space()='Certified Firm']")); 
				 boolean displayed16 = CertificateFirm.isDisplayed();
				 System.out.println(displayed16);
				 
				 WebElement InterNationalExposer = driver.findElement(By.xpath("//h3[contains(text(),'International')]")); 
				 boolean displayed17 = InterNationalExposer.isDisplayed();
				 System.out.println(displayed17);
				 
				 WebElement WhatCanWeHold = driver.findElement(By.xpath("//h3[normalize-space()='What can we hold?']")); 
				 boolean displayed18 = WhatCanWeHold.isDisplayed();
				 System.out.println(displayed18);
				 
				 WebElement GreatSupport = driver.findElement(By.xpath("//h3[normalize-space()='Great Support']")); 
				 boolean displayed19 = GreatSupport.isDisplayed();
				 System.out.println(displayed19);	
			}
		 
	            @Test(priority=11)
		void OtherSayAboutUs() throws InterruptedException
		{
		WebElement WhatAboutOtherSayAboutusHeading = driver.findElement(By.xpath("//h2[normalize-space()='What Others Say About Us']")); 
		boolean displayed20 = WhatAboutOtherSayAboutusHeading.isDisplayed();
		System.out.println(displayed20);
		
		WebElement RajanMehta = driver.findElement(By.xpath("//strong[contains(text(),'Rajan')]")); 
		boolean displayed21 = RajanMehta.isDisplayed();
		System.out.println(displayed21);
		
		WebElement ShantanuDwivedi = driver.findElement(By.xpath("//strong[contains(text(),'Shantanu')]")); 
		boolean displayed22 = ShantanuDwivedi.isDisplayed();
		System.out.println(displayed22);
		
		WebElement RamCharan = driver.findElement(By.xpath("//strong[contains(text(),'Ram')]")); 
		boolean displayed23 = RamCharan.isDisplayed();
		System.out.println(displayed23);
		
		WebElement AnkitSaxena = driver.findElement(By.xpath("//strong[contains(text(),'Ankit')]")); 
		boolean displayed24 = AnkitSaxena.isDisplayed();
		System.out.println(displayed24);
		}

	     @Test(priority=12)
	      void SpecialHeading() throws InterruptedException
	      {
		
	       WebElement SpecialHeadingText = driver.findElement(By.xpath("//h3[contains(text(),'Just send us your')]")); 
	       boolean displayed25 = SpecialHeadingText.isDisplayed();
	       System.out.println(displayed25);

	       WebElement QuoteBtn = driver.findElement(By.xpath("//span[contains(@class,'avia_iconbox_title')]")); 
	       boolean displayed26 = QuoteBtn.isDisplayed();
	       System.out.println(displayed26);
	       QuoteBtn.click();
	       Thread.sleep(2000);
	       driver.navigate().back();	
	       }
	     
	     @Test(priority=13)
	     void Footer() throws InterruptedException
	     {

	    	 WebElement GlobalLogisticService = driver.findElement(By.xpath("//h3[normalize-space()='Global Logistic Service']")); 
	         boolean displayed27 = GlobalLogisticService.isDisplayed();
	         System.out.println(displayed27);
	         
	         WebElement ContactInfo = driver.findElement(By.xpath("//h3[normalize-space()='Contact Information']")); 
	         boolean displayed28 = ContactInfo.isDisplayed();
	         System.out.println(displayed28);
	         
	         WebElement OfficeHour = driver.findElement(By.xpath("//h3[normalize-space()='Office Hours']")); 
	         boolean displayed29 = OfficeHour.isDisplayed();
	         System.out.println(displayed29);
	         
	         WebElement HappyToHelp = driver.findElement(By.xpath("//h3[normalize-space()='Happy To Help']")); 
	         boolean displayed30 = HappyToHelp.isDisplayed();
	         System.out.println(displayed30);
	         
	         driver.quit();
	         
	     

	}
		
}
	

	


