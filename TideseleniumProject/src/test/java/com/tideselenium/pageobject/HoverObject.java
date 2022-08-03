package com.tideselenium.pageobject;

import org.openqa.selenium.WebDriver;

import com.tideselenium.uistore.HomePageLocator;

public class HoverObject
{
	HomePageLocator hp;
	
	public void hover(WebDriver driver) throws InterruptedException
	{
		hp=new HomePageLocator(driver);
		hp.search.sendKeys("cloths");
		
		hp.onclick.click();
		Thread.sleep(3000);
		
	}


}
