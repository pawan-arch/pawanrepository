package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
		//Using JavaScriptExecuter to click on login Btn
		
		WebElement element= driver.findElement(By.name("Submit"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		System.out.println("Login successfully completed");
		//Using JavascriptExecutor to click on logout
		
		WebElement logout= driver.findElement(By.linkText("Logout"));
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();", logout);
		System.out.println("Logout Successfully completed");
		Thread.sleep(3000);
		driver.close();
	}
}
