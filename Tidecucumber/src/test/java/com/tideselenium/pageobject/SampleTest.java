package com.tideselenium.pageobject;

import org.openqa.selenium.WebDriver;

import com.tideselenium.uistore.UserClass;

public class SampleTest
{
	UserClass uc;
	
	public void manage(WebDriver driver)
	{
		uc=new UserClass(driver);
		uc.location.click();
	}

}
