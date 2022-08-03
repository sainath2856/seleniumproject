package com.tideselenium.uistore;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageLocator
{
	public WebElement search;
	public WebElement onclick;
	public HomePageLocator(WebDriver driver)
	{
		
		
		this.search=driver.findElement(By.xpath("//input[@type='search']"));
		this.onclick=driver.findElement(By.xpath("//button[@type='submit']"));
		
	}

	
}

