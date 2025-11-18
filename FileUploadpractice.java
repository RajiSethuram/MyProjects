import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement toscroll=driver.findElement(By.xpath("//input[@value='submit']"));

		jse.executeScript("arguments[0].scrollIntoView", toscroll);
		driver.findElement(By.id("fileupload")).sendKeys("/Users/rajiraj/Desktop/Screenshot 2022-11-04 at 2.26.45 PM.png");
		toscroll.click();
	}

}
