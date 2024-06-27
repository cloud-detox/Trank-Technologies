package com.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_Header extends BaseClass{
	
	@Test
	
	public void Dropdown() {
		Actions action = new Actions(driver);
		WebElement dropdown = driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		
		action.moveToElement(dropdown).perform();
		//dropdown.click();
		WebElement eComerce = driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		eComerce.click();
	}

}
