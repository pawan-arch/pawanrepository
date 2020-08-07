package com.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
WebDriver driver;
@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
}
@Test
public void DragnDrop() throws InterruptedException {
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://jqueryui.com/droppable/");
	Thread.sleep(3000);
	//assertEquals("Draggable | jQuery UI", driver.getTitle());
	driver.switchTo().frame(0);
	Actions a= new Actions(driver);
	a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).release().build().perform();
	Thread.sleep(3000);
}

@AfterMethod
public void teardown() {
	driver.quit();
}
}
