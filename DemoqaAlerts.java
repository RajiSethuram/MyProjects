import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoqaAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Simple alert
		driver.findElement(By.id("alertButton")).click();
		Alert alt= driver.switchTo().alert();
		alt.accept();
		
		//timer alert -> alert will appeat after 5 seconds
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		if(wait.until(ExpectedConditions.alertIsPresent())!=null)
		{
			alt.accept();
		}
		else
		{
			System.out.println("No Alerts Found");
		}
		
		//Confirm Alert
		driver.findElement(By.id("confirmButton")).click();
		alt.accept();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		//Prompt Alert
		driver.findElement(By.id("promtButton")).click();
		alt.sendKeys("Raji");
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		driver.quit();

		
	}
	

}
