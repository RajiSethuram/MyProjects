import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement hov = driver.findElement(By.xpath("//span[text()='Account & Lists']"));

		act.moveToElement(hov).build().perform();
		WebElement singin = driver.findElement(By.xpath("//span[text()='Sign in']"));
		act.click(singin).build().perform();

		WebElement username = driver.findElement(By.id("ap_email"));

		username.sendKeys("sbalasubramanian@uco.edu");
		username.sendKeys(Keys.RETURN);

		driver.findElement(By.id("ap_password")).sendKeys("idly2dosa1");
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");

		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.quit();
	}

}
