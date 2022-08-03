package com.tideselenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PassHover
{
	
	public WebElement fail;
	public WebElement attempt;

	
	
	public PassHover(WebDriver driver)
	{
		
		this.fail=driver.findElement(By.xpath("//a[contains(text(),'Our Commitment')]"));
		this.attempt=driver.findElement(By.xpath("//span[contains(text(),'Turn to Cold')]"));
		
		
	}

}
