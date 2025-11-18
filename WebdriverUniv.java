import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverUniv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Login-Portal/fail.html");
		driver.findElement(By.id("text")).sendKeys("Test");
		driver.findElement(By.id("password")).sendKeys("Test");
		driver.findElement(By.id("login-button")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println(alt.getText());
		driver.quit();
	}

}
