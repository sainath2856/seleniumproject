package com.tideselenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class saleClass8
{
	public WebElement domain1;
	
	
	public saleClass8(WebDriver driver)
	{
		this.domain1=driver.findElement(By.xpath("//img[@src='/images/header_logo_downy.png']")); 
		
	}

}
