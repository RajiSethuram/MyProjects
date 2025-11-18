import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver1= new WebDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor jse=(JavascriptExecutor)driver;

		Dimension d= new Dimension(500,1000);
		driver.manage().window().setSize(d);
		driver.findElement(By.id("firstName")).sendKeys("Raji");
		driver.findElement(By.id("lastName")).sendKeys("SethuRam");
		driver.findElement(By.id("userEmail")).sendKeys("test@test.com");
		

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Female']"))).click();;
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567891");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		jse.executeScript("arguments[0].scrollIntoView(true)", submit);
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		Select month =new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		month.selectByValue("2");
		
		Select year= new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		year.selectByValue("1960");
		
		driver.findElement(By.xpath("//div[contains(@class,'024')]")).click();
		driver.findElement(By.id("subjectsInput")).sendKeys("P");
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//label[text()='Music']")).click();
		jse.executeScript("arguments[0].scrollIntoView", submit);
		
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("/Users/rajiraj/Desktop/Screenshot 2022-11-29 at 10.45.00 AM.png");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Address");
		driver.findElement(By.xpath("//div[contains(text(),'Select State')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'NCR')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Select City')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Delhi')]")).click();
		submit.click();
	
	//	driver.findElements(By.xpath("//div[@class='table-responsive']//tr"));
		
	//	List vals= new List();
	//	driver.findElements(By.xpath("//div[@class='table-responsive']//tr"));
	
		ArrayList<WebElement> val= (ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='table-responsive']//tr"));
		for(int i=0;i<=val.size()-1;i++)
		{
			System.out.println(val.get(i).getText());
		}
		
		driver.findElement(By.id("closeLargeModal")).click();
			}

}
