import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupdloadheroku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("file-upload")).sendKeys("/Users/rajiraj/Desktop/Screenshot 2022-11-04 at 2.26.45 PM.png");
		driver.findElement(By.id("file-submit")).click();
		
	}

}
