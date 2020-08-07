package com.test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CapScreenShot {
	WebDriver driver;
@BeforeMethod
public void setUp() {
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
driver= new ChromeDriver();
}
@AfterMethod
public void teardown() {
	driver.quit();
}
@Test
public void Screenshot() throws IOException {
	try {
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")).click();
	Thread.sleep(2000);
	//driver.findElement(By.linkText("Logout")).click();
	WebElement element= driver.findElement(By.linkText("PIM"));
	Actions action= new Actions(driver);
	action.moveToElement(element).perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee123")).click();
	Thread.sleep(3000);
	System.out.println("Clicked on Submenu");
	}
	catch(Exception e) {
		
		 // File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile, new File("D:\\TestResults.png"));
		//FileUtils.copyFile(file, new File("D:\\Sotware\\HRMS\\src\\com\\test"+fileName+".jpg"));
	}
	driver.quit();
}}