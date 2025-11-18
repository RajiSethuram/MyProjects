import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAumationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Login form
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		  WebElement iframe1= driver.findElement(By.tagName("iframe"));
		  driver.switchTo().frame(iframe1);
		  driver.findElement(By.xpath("//input[contains(@id,'TextField-1')]")).sendKeys("Test");
		  driver.findElement(By.id("RESULT_TextField-1")).sendKeys("test");
		  driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Test");
		  driver.findElement(By.id("RESULT_TextField-3")).sendKeys("1234567891");
		  driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
		  driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Chennai");
		  JavascriptExecutor jse=(JavascriptExecutor)driver;
		  WebElement submit= driver.findElement(By.id("FSsubmit"));

		  jse.executeScript("arguments[0].scrollIntoView(true)", submit);

		  driver.findElement(By.id("RESULT_TextField-6")).sendKeys("test@test.com");
		  driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']")).click();
		  driver.findElement(By.xpath("//label[text()='Friday']")).click();
		  
		  
		  Select time= new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
		  time.selectByVisibleText("Evening");
		  driver.findElement(By.id("RESULT_FileUpload-10")).
		  sendKeys("/Users/rajiraj/Desktop/Screenshot 2022-11-04 at 2.26.45 PM.png");
		  submit.click();
				
	}

}
