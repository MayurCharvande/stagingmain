package stagingmain.legalops.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginPage {
@Test
public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver fiels\\109\\chromedriver.exe");
	ChromeOptions option = new ChromeOptions();
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://stagingmain.legalops.com/login");
	driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("mayur.charvande+25.2@fxbytes.com"); //email
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Fxbytes@123"); //password
	driver.findElement(By.xpath("//button[@id='submitLoginForm']")).click(); //submit
}
}
