package com.tideselenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hiddenClass9
{
	public WebElement http;
	
	
	public hiddenClass9(WebDriver driver)
	{
		this.http=driver.findElement(By.xpath("//a[@href='/en-us/contact-us']"));
		
	}

}
