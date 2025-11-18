import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowdemoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		driver.findElement(By.id("messageWindowButton")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String MainWindow = it.next();
		String Window2 = it.next();

		driver.switchTo().window(Window2);
		System.out.println("New Window Message : \n"+ driver.findElement(By.tagName("body")).getText()); // driver.close();
	//	System.out.println(driver.findElement(By.tagName("body")).getText());

		driver.switchTo().window(MainWindow);

	}

}
