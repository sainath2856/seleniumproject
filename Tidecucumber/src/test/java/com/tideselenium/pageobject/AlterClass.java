package com.tideselenium.pageobject;

import org.openqa.selenium.WebDriver;

import com.tideselenium.uistore.ManageClass;

public class AlterClass
{
	ManageClass mc;
	
	public void demo(WebDriver driver)
	{
		mc=new ManageClass(driver);
		mc.handle.click();
	}
}
