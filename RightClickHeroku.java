import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickHeroku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/context_menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.id("hot-spot"))).build().perform();
		Alert alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();

	}

}
