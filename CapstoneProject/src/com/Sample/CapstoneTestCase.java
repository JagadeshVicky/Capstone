package com.Sample;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.PomFile.PomClass;
import com.PomFile.PomClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.time.Duration;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CapstoneTestCase {
public WebDriver driver;
	
    PomClass pf;
	
	@BeforeMethod
	
	public void StartBrowser() throws MalformedURLException, InterruptedException 
	{
		System.setProperty("WebDriver.chome.driver", ".\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(GlobalVariable.url);
		Thread.sleep(2000);
		pf = new PomClass(driver);
		
		}
	
   @Test
	
	public void LoginTestcase() throws InterruptedException
	{
		pf.clickonLogin();
		
		pf.EnterUserID("mum@user.com");
		
		pf.EnterPassword("12345");
		
		pf.ClickOnLoginButton();
		
		Thread.sleep(4000);
		pf.ViewProduct();
		
		Thread.sleep(4000);
		pf.Tablet();
		
		Thread.sleep(4000);
		pf.CheckOut();
		
		Thread.sleep(4000);
		pf.Select();
		
		Thread.sleep(4000);
		pf.Pay();
		
		Thread.sleep(2000);
		
	}
	
	@AfterMethod()
	
	public void closeBrowser() throws InterruptedException
	{
		
		driver.quit();
	}
}
