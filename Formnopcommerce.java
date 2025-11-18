


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Formnopcommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fget-started");
		driver.manage().window().maximize();
		driver.findElement(By.id("FirstName")).sendKeys("Test");
		driver.findElement(By.id("LastName")).sendKeys("Testing");
		driver.findElement(By.id("Email")).sendKeys("test@test.com");
		driver.findElement(By.id("ConfirmEmail")).sendKeys("test@test.com");
		driver.findElement(By.id("Username")).sendKeys("Test");
		
		Select country= new Select(driver.findElement(By.id("CountryId")));
		country.selectByVisibleText("India");
		
		Select timezone= new Select(driver.findElement(By.id("TimeZoneId")));
		timezone.selectByValue("India Standard Time");
		
		driver.findElement(By.xpath("//label[contains(text(),'I would like to receive newsletters:')]")).click();
		driver.findElement(By.id("Password")).sendKeys("Test1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Test1234");
		Select Company = new Select(driver.findElement(By.id("Details_CompanyIndustryId")));
		Company.selectByVisibleText("Other");
		
		Select nopcommerceneed = new Select(driver.findElement(By.id("Details_NopCommerceIntendedUseId")));
		nopcommerceneed.selectByVisibleText("Other");
		driver.findElement(By.id("Details_NopCommerceIntendedUseText")).sendKeys("test");
		Select role= new Select(driver.findElement(By.id("Details_CompanyRoleId")));
		role.selectByVisibleText("Technical developer");
		Select sized = new Select(driver.findElement(By.id("Details_CompanySizeId")));
		sized.selectByVisibleText("More than 15");
		driver.findElement(By.id("Details_CompanyWebsiteUrl")).sendKeys("test.com");
		driver.findElement(By.id("register-button")).click();;
		
		
	}

}
