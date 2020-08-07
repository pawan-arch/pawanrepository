package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	//Selecting single value from DropDown
	WebElement day= driver.findElement(By.id("day"));
	WebElement month= driver.findElement(By.id("month"));
	WebElement year= driver.findElement(By.id("year"));
	
	Select select= new Select(day);
	select.selectByVisibleText("21");
	System.out.println("21 successfully printed");
	
	Select select1= new Select(month);
	select1.selectByVisibleText("Jul");
	System.out.println("Jul successfully printed");
	
	Select select2= new Select(year);
	select2.selectByVisibleText("1992");
	System.out.println("1992 successfully printed");
	
//	String dob="21-Jul-1992";
//	String dobArr[]= dob.split("_");
//	selectValueFromDropDown(day, dobArr[0]);
//	selectValueFromDropDown(month, dobArr[1]);
//	selectValueFromDropDown(year, dobArr[2]);
//	}
//	public static void selectValueFromDropDown(WebElement element, String value);
//	{
//	Select select= new Select(element);
//	select.selectByVisibleText(value);
	driver.close();
}
}