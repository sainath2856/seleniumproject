package com.tideselenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nullClass7
{	
	public WebElement rdx;
	
	
	public nullClass7(WebDriver driver)
	{
		this.rdx=driver.findElement(By.xpath("//a[@href='/en-us/latest-news']"));
		
	}

}
