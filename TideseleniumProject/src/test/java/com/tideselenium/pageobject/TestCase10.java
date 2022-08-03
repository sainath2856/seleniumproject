package com.tideselenium.pageobject;

import org.openqa.selenium.WebDriver;

import com.tideselenium.uistore.LastClass10;

public class TestCase10
{
	LastClass10 lc;
	
	public void single(WebDriver driver)
	{
		lc=new LastClass10(driver);
		lc.hcr.click();
		
		
	}

}
