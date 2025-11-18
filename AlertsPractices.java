import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPractices {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Java Script Alert
		driver.findElement(By.id("button1")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();

		// Modal Pop-up System.out.println(alt.getText());
		driver.findElement(By.id("button2")).click();

		WebElement clsbtn = driver.findElement(By.xpath("//button[text()='Close']"));
		wait.until(ExpectedConditions.visibilityOf(clsbtn)).click();
		System.out.println(driver.findElement(By.className("modal-body")).getText());

		// Ajax Loader driver.findElement(By.id("button3")).click();
		WebElement clickme = driver.findElement(By.id("button1"));
		wait.until(ExpectedConditions.visibilityOf(clickme)).click();
		System.out.println(driver.findElement(By.className("modal-body")).getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Close']")).click();

		// Java Script Alert
		driver.findElement(By.id("button4")).click();
		//Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println(driver.findElement(By.id("confirm-alert-text")).getText());

		driver.quit();

	}

}
