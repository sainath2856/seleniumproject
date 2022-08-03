package com.tideselenium.pageobject;


import org.openqa.selenium.WebDriver;
import com.tideselenium.uistore.saleClass8;

public class TestCase8
{
	saleClass8 sc;
	
	public void wider3(WebDriver driver)
	{
		sc=new saleClass8(driver);
		sc.domain1.click();
		
	}

}
