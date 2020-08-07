package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRMTitleTest {
	WebDriver driver;

	@BeforeMethod
	 public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	}
	
	@Test
	public void orangeHRMTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "OrangeHRM", "Title not matched"); //Assertion Most important topic in TestNG
	}
	@Test
	public void orangeHRMLogoTest() {
		boolean b= driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/img")).isDisplayed();
		Assert.assertTrue(b);
		//OR
		Assert.assertEquals(b, true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
