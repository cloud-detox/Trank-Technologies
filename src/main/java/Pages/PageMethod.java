package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageMethod {
private WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement fname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lname;
	@FindBy(xpath="//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")
	WebElement address;
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobile_num;
	@FindBy(xpath="//input[@value='FeMale']")
	WebElement gender;
	@FindBy(xpath="//input[@id='checkbox2']")
	WebElement hobby;
	@FindBy(xpath="//div[@id='msdd']")
	WebElement language;
	@FindBy(xpath="(//a[@style=\"text-decoration:none\"])[8]")
	WebElement selectlanguage;
	@FindBy(xpath="//select[@id='Skills']")
	WebElement skills;
    @FindBy(xpath="//span[@id='select2-country-container']")
    WebElement country;
    WebElement India;
    @FindBy(xpath="//b[@role='presentation']")
     WebElement count;
	@FindBy(xpath="(//input[@type=\"search\"])")
	WebElement selectCountry;
	@FindBy(xpath="//select[@id='yearbox']")
	WebElement year;
	@FindBy(xpath="//select[@placeholder='Month']")
	WebElement month;
	@FindBy(xpath="//select[@id='daybox']")
	WebElement day;
	@FindBy(xpath="//input[@id='firstpassword']")
	WebElement pwd;
	@FindBy(xpath="//input[@id='secondpassword']")
	WebElement confirmPwd;
	@FindBy(xpath="//button[@id='submitbtn']")
	WebElement submit;
	
	public PageMethod(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void firstName(String fn)  {
		fname.sendKeys(fn);
	}
	public void lastName(String ln)  {
		lname.sendKeys(ln);
	}
	public void type_address(String add)  {
		address.sendKeys(add);
	}
	public void typeEmail(String emaiId)  {
		email.sendKeys(emaiId);
	}
	public void typePhoneNum(String phone)  {
		mobile_num.sendKeys(phone);
	}
	public void selectGender()  {
		gender.click();
	}
	public void hobbies()  {
		hobby.click();
	}
	public void selectlang(String lan)  {
		Actions a = new Actions(driver);
		language.click();
		a.moveToElement(selectlanguage).click().perform();;
	}
	public void typeSkills(String s)  {
		skills.sendKeys(s);
	}
	public void selectCountry(String con)  {
		country.sendKeys(con);
}
	public void selectCountry2(String con2)  {
		Actions a = new Actions(driver);
	count.sendKeys(con2);
}
	public void selectYear(String y)  {
		year.sendKeys(y);
	}
	public void selectMonth(String m)  {
		month.sendKeys(m);
	}
	public void selectDay(String d)  {
		day.sendKeys(d);
	}
	public void enterPwd(String p)  {
		pwd.sendKeys(p);
	}
	public void confirmPassword(String cp)  {
		confirmPwd.sendKeys(cp);
	}
	public void enterSubmit()  {
		submit.click();
	}
}


