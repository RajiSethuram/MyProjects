import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormDemoGuruRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("firstName")).sendKeys("test");
		driver.findElement(By.name("lastName")).sendKeys("Test");
		driver.findElement(By.name("phone")).sendKeys("1234567891");
		driver.findElement(By.id("userName")).sendKeys("test@test.com");
		WebElement submit=driver.findElement(By.name("submit"));
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeAsyncScript("arguments[0].scrollIntoView(true)", jse);
		driver.findElement(By.name("address1")).sendKeys("No 6, Dubai main road");
		driver.findElement(By.name("city")).sendKeys("kk Sand");
		driver.findElement(By.name("state")).sendKeys("Dubai");
		driver.findElement(By.name("postalCode")).sendKeys("112345");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByValue("UNITED ARAB EMIRATES");
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.name("password")).sendKeys("test1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("test1234");
		submit.click();
	}

}
