package stepDefination;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.tideselenium.pageobject.TestCase7;
import com.tideselenium.uistore.HandleClass;
import com.tideselenium.uistore.HomePageLocator;
import com.tideselenium.uistore.LastClass10;
import com.tideselenium.uistore.ManageClass;
import com.tideselenium.uistore.PassHover;
import com.tideselenium.uistore.RewardClass6;
import com.tideselenium.uistore.UserClass;
import com.tideselenium.uistore.hiddenClass9;
import com.tideselenium.uistore.nullClass7;
import com.tideselenium.uistore.saleClass8;
import com.tideselenium.utilities.ReadConfig;
import com.tideselenium.utilities.ScreenShots;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination
{
	public WebElement hcr;
	public WebElement http;
	public WebElement domain1;
	public WebElement rdx;
	public WebElement domain;
	public WebElement fail;
	public WebElement attempt;
	public WebElement reuse;
	public WebElement handle;
	public WebElement location;
	public WebElement search;
	public WebElement onclick;
	ReadConfig rd=new ReadConfig();
	ExtentHtmlReporter ext;
	ExtentReports er;
	ExtentTest et;
	
	WebDriver driver;
	@Before
	public void extent()
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase1.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
	}
	@After(order=1)
	public void screen() throws IOException
	{
		et.pass("executed ",MediaEntityBuilder.createScreenCaptureFromPath(ScreenShots.shot(driver)).build());
	
		driver.close();
		er.flush();
	}
	@After(order=0)
	public void screen1()
	{
		driver.quit();
		
	}
	//TestCase_1
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() throws IOException
	{

		System.setProperty("webdriver.chrome.driver",rd.getchromePath());
		driver=new ChromeDriver();
		
	}
	
	@And("I open Tide home page")
	public void i_open_tide_home_page()
	{
		
		driver.get(rd.getApplicationURL());
		driver.manage().window().maximize();	
		}
	
	@When("I verify search Functionality on Tide web page")
	public void i_verify_search_functionality_on_tide_web_page()
	{
		
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		HomePageLocator hp;
		hp=new HomePageLocator(driver);
		hp.search.sendKeys("cloths");
		hp.onclick.click();
		
		this.search=driver.findElement(By.xpath("//input[@type='search']"));
		this.onclick=driver.findElement(By.xpath("//button[@type='submit']"));
		
	}

	
	
	//TestCase_2
	@When("I verify P&G icon on Tide web page")
	public void i_verify_p_g_icon_on_tide_web_page() throws IOException
	{
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		UserClass uc;
		this.location=driver.findElement(By.xpath("//img[@alt='P&G icon']"));
		uc=new UserClass(driver);
		uc.location.click();	
	}
	
	
	//TestCase_3
	@When("I verify P&G Goodeveryday icon on Tide web page")
	public void i_verify_p_g_goodeveryday_icon_on_tide_web_page() throws IOException
	{
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		ManageClass mc;
		this.handle=driver.findElement(By.xpath("//a[@href='https://www.pggoodeveryday.com/']"));
		mc=new ManageClass(driver);
		mc.handle.click();	
		
	}
	
	//TestCase_4
	@When("I verify How to wash cloths icon on Tide web page")
	public void i_verify_how_to_wash_cloths_icon_on_tide_web_page() throws IOException
	{
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		HandleClass hc;
		this.reuse=driver.findElement(By.xpath("//a[@href='/en-us/how-to-wash-clothes']"));
		hc=new HandleClass(driver);
		hc.reuse.click();
		
	}
	
	//TestCase_5
	@When("I hover on our commitment on Tide home page")
	public void i_hover_on_our_commitment_on_tide_home_page()
	{
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		this.fail=driver.findElement(By.xpath("//a[contains(text(),'Our Commitment')]"));
		
		PassHover ph;
		ph=new PassHover(driver);
		Actions act=new Actions(driver);
		act.moveToElement(ph.fail).build().perform();
	}
	
	@Then("I click on Turn to Cold")
	public void i_click_on_turn_to_cold() throws IOException
	{
		PassHover ph;
		ph=new PassHover(driver);
		this.attempt=driver.findElement(By.xpath("//span[contains(text(),'Turn to Cold')]"));
		ph.attempt.click();
		

	}
	
	//TestCase_6
	@When("I click and verify Coupons and Rewards icon on Tide web page")
	public void i_click_and_verify_coupons_and_rewards_icon_on_tide_web_page() throws IOException
	{
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		this.domain=driver.findElement(By.xpath("//a[@href='/en-us/coupons-and-rewards']"));
		RewardClass6 wc;
		wc=new RewardClass6(driver);
		wc.domain.click();

	}
	
	//TestCase_7
	@When("I click and verify Whats's New icon on Tide web page")
	public void i_click_and_verify_whats_s_new_icon_on_tide_web_page() throws IOException
	{
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		this.rdx=driver.findElement(By.xpath("//a[@href='/en-us/latest-news']"));
		nullClass7 nc;
		nc=new nullClass7(driver);
		nc.rdx.click();	

	}
	
	
	//TestCase_8
	@When("I click and verify Downy icon on Tide web page")
	public void i_click_and_verify_downy_icon_on_tide_web_page() throws IOException
	{
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		this.domain1=driver.findElement(By.xpath("//img[@src='/images/header_logo_downy.png']")); 
		saleClass8 sc;
		sc=new saleClass8(driver);
		sc.domain1.click();
		
	}
	
	//TestCase_9
	@When("I click and verify Contact-us icon on Tide web page")
	public void i_click_and_verify_contact_us_icon_on_tide_web_page() throws IOException
	{
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		this.http=driver.findElement(By.xpath("//a[@href='/en-us/contact-us']"));
		hiddenClass9 hd;
		hd=new hiddenClass9(driver);
		hd.http.click();

	}
	
	//TestCase_10
	@When("I click and verify Bounce icon on Tide web page")
	public void i_click_and_verify_bounce_icon_on_tide_web_page() throws IOException
	{
		
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		
		this.hcr=driver.findElement(By.xpath("//img[@src='/images/header_logo_bounce.png']"));
		LastClass10 lc;
		lc=new LastClass10(driver);
		lc.hcr.click();

	}
	
}
