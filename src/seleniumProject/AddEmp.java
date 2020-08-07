////Example for Frames & VerifyText & Reading the data from Textbox//
package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddEmp {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@type='Submit']")).click();
Thread.sleep(2000);
//verifying text//
assertTrue(driver.findElement(By.xpath("//input[@id='standardView']/div[1]/h2"))).getText().matches("Employee Information");
driver.switchTo().frame("rightMenu");
//clicking on Add button
driver.findElement(By.xpath("//input[@id='standardView']/div[3]/div[1]/input[1]")).click();
Thread.sleep(2000);
//To retrieve data from EmpTextbox
String Empid=driver.findElement(By.xpath("//form[@id='frmEmp']/div/div/div[2]/input")).getAttribute("value");
System.out.println(Empid);
	driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("Babblu");
	driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("Verma");
	driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
	Thread.sleep(2000);
	System.out.println("New Employee Added");
	driver.switchTo().defaultContent(); //Exit from frame
	driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
	driver.quit();
	}
	private static WebElement assertTrue(WebElement findElement) {
		return null;
	}}