package GlobalLogic;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Services {

	
	String driverPath = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";;
	WebDriver driver = new ChromeDriver(); 
	
	@Test
	void navigate() {
		driver.get("https://globallogistic.co.in/services.html");

	}

}


