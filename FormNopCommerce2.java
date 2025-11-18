import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormNopCommerce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new  ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Test");
		driver.findElement(By.id("LastName")).sendKeys("Test");
		
		Select date = new Select(driver.findElement(By.name("DateOfBirthDay")));
		date.selectByValue("12");
		Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		month.selectByVisibleText("January");
		Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
		year.selectByValue("1947");
		
		driver.findElement(By.id("Email")).sendKeys("test@test.com");
		driver.findElement(By.id("Company")).sendKeys("Testing Company");
		driver.findElement(By.id("Newsletter")).click();
		driver.findElement(By.id("Password")).sendKeys("test1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("test1234");
		driver.findElement(By.id("register-button")).click();
	}

}
