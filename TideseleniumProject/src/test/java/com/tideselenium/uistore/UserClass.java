package com.tideselenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserClass
{
	public WebElement location;
	public WebElement find;

	public UserClass(WebDriver driver)
	{
		this.location=driver.findElement(By.xpath("//img[@alt='P&G icon']"));
	}
}
