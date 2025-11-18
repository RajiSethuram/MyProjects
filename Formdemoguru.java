import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Formdemoguru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Select title = new Select(driver.findElement(By.id("user_title")));
		title.selectByValue("Ms");
		driver.findElement(By.id("user_firstname")).sendKeys("TestName");
		driver.findElement(By.id("user_surname")).sendKeys("Test Surname");
		driver.findElement(By.id("user_phone")).sendKeys("1234567891");
		Select year = new Select(driver.findElement(By.id("user_dateofbirth_1i")));
		year.selectByValue("1947");
		Select month= new Select(driver.findElement(By.id("user_dateofbirth_2i")));
		month.selectByVisibleText("March");
		Select date= new Select(driver.findElement(By.id("user_dateofbirth_3i")));
		date.selectByValue("3");
		driver.findElement(By.id("licencetype_f")).click();
		Select lperoid= new Select(driver.findElement(By.id("user_licenceperiod")));
		lperoid.selectByValue("3");
		Select occu =new Select(driver.findElement(By.id("user_occupation_id")));
		occu.selectByVisibleText("Student");
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("No.6");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Dubai Main Road");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("Dubai");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("6000028");
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("test@test.com");
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("Test1234");
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("Test1234");
		driver.findElement(By.name("submit")).click();
		
		
	}

}
