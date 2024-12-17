package GlobalLogic;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class AboutUs {

		String driverPath = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";;
		WebDriver driver = new ChromeDriver();

		@Test
		void navigate() {
			driver.get("https://globallogistic.co.in/About.html");

		}

	}


