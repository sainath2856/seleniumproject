package com.tideselenium.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.tideselenium.uistore.PassHover;

public class HoverClass
{
	PassHover ph;
	
	public void passHover(WebDriver driver)
	{
		ph=new PassHover(driver);
		Actions act=new Actions(driver);
		act.moveToElement(ph.fail).build().perform();
		ph.attempt.click();

		
	}

}
