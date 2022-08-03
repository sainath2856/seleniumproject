package com.tideselenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageClass
{
	public WebElement handle;
	
	
	public ManageClass(WebDriver driver)
	{
		this.handle=driver.findElement(By.xpath("//a[@href='https://www.pggoodeveryday.com/']"));
		
	}

}
