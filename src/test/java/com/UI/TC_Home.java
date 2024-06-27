package com.UI;

import org.testng.annotations.Test;

public class TC_Home extends BaseClass {
@Test
	
	public void Trank() {
//		String title= driver.getTitle();
		if( driver.getTitle().equalsIgnoreCase("IT and Software Solutions Company in India | Trank Technologies"))
				{
			System.out.println("tittle matched");
		}else {
			System.out.println("tittle is not machted");
		}
		
		
	}

}
