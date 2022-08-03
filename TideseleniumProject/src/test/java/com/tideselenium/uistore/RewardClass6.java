package com.tideselenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RewardClass6
{
	public WebElement domain;
	
	
	public RewardClass6(WebDriver driver)
	{
		this.domain=driver.findElement(By.xpath("//a[@href='/en-us/coupons-and-rewards']"));
		
	}

}
