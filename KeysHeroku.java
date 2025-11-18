import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysHeroku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/key_presses");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("target")).sendKeys(Keys.chord("a"));
		driver.findElement(By.id("target")).sendKeys(Keys.DIVIDE);
		driver.findElement(By.id("target")).sendKeys(Keys.chord("d"));
		driver.findElement(By.id("target")).sendKeys(Keys.RETURN);
		driver.findElement(By.id("target")).sendKeys(Keys.chord(Keys.SHIFT,"3"));
		driver.findElement(By.id("target")).sendKeys(Keys.NUMPAD4);
	}

}
