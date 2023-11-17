package com.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capstone {
	public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("WebDriver.chome.driver", ".\\Driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://localhost:8080/medicare/");
driver.manage().window().maximize();
	
	WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
	
	Login.click();
WebElement Username = driver.findElement(By.id("username"));
Username.sendKeys("dummy@user.com");
WebElement Password = driver.findElement(By.id("password"));
Password.sendKeys("Vicky7017!");
WebElement Button = driver.findElement(By.xpath("//input[@value='Login']"));
Button.click();
WebElement Viewproducts = driver.findElement(By.xpath("//a[text()='View Products']"));
Viewproducts.click();
WebElement Tablet = driver.findElement(By.xpath("//a[@class=\"btn btn-success\"][1]"));
Tablet.click();
Thread.sleep(4000);
WebElement Checkout = driver.findElement(By.xpath("//a[@class=\"btn btn-success btn-block\"]"));
Checkout.click();
Thread.sleep(4000);
WebElement Select = driver.findElement(By.xpath("//a[text()='Select']"));
Select.click();
Thread.sleep(4000);
WebElement Pay = driver.findElement(By.xpath("//a[text()='Pay']"));
Pay.click();
	}
	}
