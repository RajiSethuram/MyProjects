import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsDemoQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(By.id("windowButton")).click();

		//driver.findElement(By.id("tabButton")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String MainWindow = it.next();
		String Window2 = it.next();

		driver.switchTo().window(Window2);
		System.out.println("New Tab" + driver.findElement(By.id("sampleHeading")).getText());

		driver.close();
		driver.switchTo().window(MainWindow);

		/*
		 * driver.findElement(By.id("windowButton")).click();
		 * driver.switchTo().window(Window2); System.out.println("New Window" +
		 * driver.findElement(By.id("sampleHeading")).getText());
		 */
		
	}

}
