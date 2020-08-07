package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General {
	WebDriver driver;
public void oppenApplication() {
	Log.info("*****Started Execution********");
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
driver.manage().window().maximize();
Log.info("Application Opened Successfully");
System.out.println(driver.getTitle());
}

public void closeapplication() {
	driver.quit();
	Log.info("Application closed Successfully");
	Log.info("*****End Execution********");
}
}