package com.tideselenium.runner;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.tideselenium.pageobject.AlterClass;
import com.tideselenium.pageobject.HoldClass9;
import com.tideselenium.pageobject.HoverClass;
import com.tideselenium.pageobject.HoverObject;
import com.tideselenium.pageobject.LoadClass;
import com.tideselenium.pageobject.MoverClass6;
import com.tideselenium.pageobject.SampleTest;
import com.tideselenium.pageobject.TestCase10;
import com.tideselenium.pageobject.TestCase7;
import com.tideselenium.pageobject.TestCase8;
import com.tideselenium.utilities.BaseClass;
import com.tideselenium.utilities.ExcelDataProvider;
import com.tideselenium.utilities.ScreenShots;

public class Runner extends BaseClass
{
	ExcelDataProvider excel=new ExcelDataProvider();
	BaseClass bs=new BaseClass();
	
	ExtentHtmlReporter ext;
	ExtentReports er;
	ExtentTest et;
	@Test

	public void test() throws InterruptedException, IOException
	{
	//	driver.get(readconfig.getApplicationURL());
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase1.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
	
	driver.get(url);
	driver.manage().window().maximize();
	HoverObject hv=new HoverObject();
	hv.hover(driver);
	
	ScreenShots st1=new ScreenShots();
	st1.shot("image_001");
	
	er.flush();
	}
	
	@Test
	public void testCase2() throws IOException
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase2.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		driver.get(url);
		driver.manage().window().maximize();
		SampleTest st=new SampleTest();
		st.manage(driver);
		
		ScreenShots st2=new ScreenShots();
		st2.shot("image_002");
		
		er.flush();
	}
	
	@Test
	public void testCase3() throws InterruptedException, IOException
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase3.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		driver.get(url);
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		AlterClass as=new AlterClass();
		as.demo(driver);
		
		ScreenShots st3=new ScreenShots();
		st3.shot("image_003");
		
	//	Thread.sleep(2000);
		er.flush();
	}
	
	@Test
	public void testCase4() throws InterruptedException, IOException
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase4.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		driver.get(url);
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		LoadClass lc=new LoadClass();
		lc.handle(driver);
		
		ScreenShots st4=new ScreenShots();
		st4.shot("image_004");
		
//		Thread.sleep(2000);
		er.flush();
	}
	
	
	@Test
	public void testCase5() throws InterruptedException, IOException
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase5.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		driver.get(url);
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		HoverClass hc=new HoverClass();
		hc.passHover(driver);
		Thread.sleep(3000);
		
		ScreenShots st5=new ScreenShots();
		st5.shot("image_005");
		
		er.flush();
		
	}
	
	
	@Test
	public void testCase6() throws InterruptedException, IOException
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase6.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		driver.get(url);
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		MoverClass6 mv=new MoverClass6();
		mv.wider(driver);
		Thread.sleep(3000);
		
		ScreenShots st6=new ScreenShots();
		st6.shot("image_006");
		
		er.flush();
	}
	
	
	@Test
	public void testCase7() throws InterruptedException, IOException
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase7.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		driver.get(url);
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		TestCase7 mv=new TestCase7();
		mv.wider1(driver);
		Thread.sleep(3000);
		
		ScreenShots st7=new ScreenShots();
		st7.shot("image_007");
		
		er.flush();
	}
	
	
	
	
	@Test
	public void testCase8() throws InterruptedException, IOException
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase8.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		driver.get(url);
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		TestCase8 tc=new TestCase8();
		tc.wider3(driver);
		Thread.sleep(3000);
		
		ScreenShots st8=new ScreenShots();
		st8.shot("image_008");
		
		er.flush();
	}
	
	
	
	
	@Test
	public void testCase9() throws InterruptedException, IOException
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase9.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		driver.get(url);
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		HoldClass9 hc=new HoldClass9();
		hc.wind(driver);
		Thread.sleep(3000);
		
		ScreenShots st9=new ScreenShots();
		st9.shot("image_009");
		
		er.flush();
	}
	
	
	
	@Test
	public void testCase10() throws InterruptedException, IOException
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase10.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		driver.get(url);
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		TestCase10 tc=new TestCase10();
		tc.single(driver);
		Thread.sleep(3000);
		
		ScreenShots st10=new ScreenShots();
		st10.shot("image_010");
		
		er.flush();
	}

}
