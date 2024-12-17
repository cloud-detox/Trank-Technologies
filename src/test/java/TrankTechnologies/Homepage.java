package TrankTechnologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepage {
	
	String driverPath = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";;
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() {

		driver.get("https://www.tranktechnologies.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	void we_are_here() throws InterruptedException {
		Thread.sleep(2000);
		WebElement we=driver.findElement(By.xpath("//img[@alt='Chat attention grabber']"));
		we.click();
		}
	
	@Test(priority=2)
	void message() {
		driver.findElement(By.xpath("This element is in iframe - //div[@class='tawk-flex tawk-flex-column tawk-flex-1']//textarea[@placeholder='Write a reply..']"));
		driver.switchTo().alert().sendKeys("hy");
		WebElement send=driver.findElement(By.xpath("//i[@class='tawk-icon tawk-icon-mobile-send']"));
		send.click();
	}
	
	@Test(priority=3)
	void explore() {
		WebElement ex=driver.findElement(By.xpath("//div[@class='cm-home-slide slick-slide slick-current slick-active']//a[@class='cm-slider-btn cm-prim-bg'][normalize-space()='Explore More']"));
		ex.click();
	}
	@Test(priority=4)
	void name() {
		WebElement name=driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//input[@placeholder='Your Name']"));
		name.sendKeys("Priya Hatewar");
		}
	
	@Test(priority=5)
	void email() {
		WebElement email=driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//input[@placeholder='Your Mail']"));
		email.sendKeys("priyahatewar52@gmail.com");
	}
	
	@Test(priority=6)
	void company() {
		WebElement com=driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//input[@placeholder='Your Company']"));
		com.sendKeys("TBS");
	}
	
	@Test(priority=7)
	void choose_a_serive(){
		WebElement choose=driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//select[@name='service']"));
		choose.click();
		WebElement choos=driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//option[contains(text(),'eCommerce Development')]"));
		choos.click();
	}
	
	@Test(priority=9)
	void phone() {
		WebElement ph=driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//input[@placeholder='Your Phone']"));
		ph.sendKeys("7841092530");
	}
	
	@Test(priority=10)
	void mess() {
		WebElement mes=driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//textarea[@placeholder='Message']"));
		mes.sendKeys("Web development");
		driver.navigate().back();
	}
	
	@Test(priority=13)
	void know_more() {
		WebElement know=driver.findElement(By.xpath("//a[normalize-space()='Know More']"));
	    know.click();
	    driver.navigate().back();
	    }
	
	@Test(priority=14)
	void get_in_touch() {
		WebElement get=driver.findElement(By.xpath("//a[normalize-space()='Get in Touch']"));
	    get.click();
	    driver.navigate().back();
	}
	
	@Test(priority=15)
	void see_more() {
		WebElement see=driver.findElement(By.xpath("//span[@class='cm-prim-bg cm-white-col box-shadow-1 aos-init aos-animate']"));
	    see.click();
		}
	
	@Test(priority=16)
	void view_all() {
		WebElement view=driver.findElement(By.xpath("//a[contains(text(),'View All →')]"));
	    view.click();
		}
	
	@AfterTest
	void quit() {
		driver.quit();
	}
	}
	
	
	
	
	
	


