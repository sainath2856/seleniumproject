package com.tideselenium.pageobject;

import org.openqa.selenium.WebDriver;
import com.tideselenium.uistore.RewardClass6;

public class MoverClass6
{
	RewardClass6 wc;
	
	public void wider(WebDriver driver)
	{
		wc=new RewardClass6(driver);
		wc.domain.click();
		
	}

}
