package com.tideselenium.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots extends BaseClass
{
	public void shot(String filename) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,new File("./ScreenShots/"+filename+".png"));
	}
	

}
