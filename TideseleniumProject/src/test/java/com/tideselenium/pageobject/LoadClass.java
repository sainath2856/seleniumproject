package com.tideselenium.pageobject;

import org.openqa.selenium.WebDriver;

import com.tideselenium.uistore.HandleClass;

public class LoadClass
{
	HandleClass hc;
	
	public void handle(WebDriver driver)
	{
		hc=new HandleClass(driver);
		hc.reuse.click();
		
	}

}
