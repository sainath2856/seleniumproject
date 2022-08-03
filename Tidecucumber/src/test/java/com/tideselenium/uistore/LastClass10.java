package com.tideselenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LastClass10
{
	
	public WebElement hcr;
	
	public LastClass10(WebDriver driver)
	{
		this.hcr=driver.findElement(By.xpath("//img[@src='/images/header_logo_bounce.png']"));
		
		
	}

}
