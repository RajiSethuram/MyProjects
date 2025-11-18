import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoguru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/V1/index.php");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement here = driver.findElement(By.xpath("//a[text()='here']"));
		jse.executeScript("arguments[0].scrollIntoView(true)", here);
		here.click();
		
		//d.dismissalert(driver);
		driver.findElement(By.name("emailid")).sendKeys("test@test.com");
		driver.findElement(By.name("btnLogin")).click();

		String username = driver.findElement(By.xpath("//td[@class='accpage']/following-sibling::td")).getText();
		System.out.println(username);
		String password =driver.findElement(By.xpath("//td[@class='accpage']/following::td[3]")).getText();
		System.out.println(password);
		
		driver.findElement(By.xpath("//a[text()='Bank Project']")).click();
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement logout=driver.findElement(By.xpath("//a[text()='Log out']"));
		jse.executeScript("arguments[0].scrollIntoView(true)", logout);
		logout.click();
		
		Alert alt=driver.switchTo().alert();
		String alertmessage=alt.getText();
		alt.accept();
		System.out.println(alertmessage);
		driver.quit();

	}
	
}
