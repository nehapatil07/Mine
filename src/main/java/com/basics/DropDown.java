package com.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	WebDriver driver;
/*
	@Test
	public void verifyDrpDwn() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,350)", "");
		List<WebElement> list=driver.findElements(By.xpath("//select[@name='country']"));
		for(int i=0; i<list.size(); i++) {
			String str=list.get(i).getText();
			if(list.get(i).getText().equals("INDIA")) {
			list.get(i).click();
			}	
		}		
	}
	*/
	@Test
	public void verifyDrpDwnUsingSelctCls() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		WebElement country=driver.findElement(By.name("country"));
		Select ss=new Select(country);
		ss.selectByVisibleText("INDIA");
		Thread.sleep(1000);
		ss.selectByIndex(2);
		Thread.sleep(1000);
		ss.selectByValue("KUWAIT");
		Thread.sleep(1000);
		ss.deselectByValue("KUWAIT");
	}
}
