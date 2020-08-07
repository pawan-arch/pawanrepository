//Example to perform keyboard activities using WebDriver and Auto Complete Feature
package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("selenium suresh");
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		System.out.println("Firsttime down arrow pressed");
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		System.out.println("Second time Down Arrow pressed");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on Enter button");
		driver.quit();
	}
}