package com.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCs {
WebDriver driver;
	/*@Test
	public void withSelectCls() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp=driver.findElement(By.xpath("//select[@name='country']"));
		Select ss=new Select(drp);
		ss.selectByIndex(1);
		ss.selectByVisibleText("BARBADOS");
		
	}*/

	@Test
	public void withoutselectcls() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		List<WebElement> drp=driver.findElements(By.xpath("//select[@name='country']"));
		List<WebElement> list=driver.findElements(By.xpath("//select[@name='country']"));
		for(int i=0; i<list.size(); i++) {
			String str=list.get(i).getText();
			if(list.get(i).getText().equals("INDIA")) {
			list.get(i).click();
			}	
		}
	}
}
