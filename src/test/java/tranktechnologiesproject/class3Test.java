package tranktechnologiesproject;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class class3Test {
	

String  psthway= ("C:\\\\Users\\\\ANUP KUMAR\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   @BeforeTest
   void login() throws InterruptedException {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   
	   driver.manage().window().maximize();
	   
   
 WebElement alert1= driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']"));
Thread.sleep(2000);




WebElement c= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
c.click();
Thread.sleep(2000);
Alert b=driver.switchTo().alert();

b.accept();



Thread.sleep(1000);
WebElement alert2= driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
alert2.click();




Thread.sleep(2000);
WebElement cl= driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']"));
cl.click();
  b.dismiss();
  
Thread.sleep(1000) ;
WebElement rc= driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
rc.click();

driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
Thread.sleep(2000);
   }
}
// driver.findElement(By.xpath("//button[@class='btn btn-info']"));
// driver.switchTo().alert().getText(())
// a.sendKeys("ravi");
// Thread.sleep(2000);  
// Thread.sleep(2000);
//b.accept();