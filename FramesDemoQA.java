

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemoQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		WebElement frame1= driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		//driver.switchTo().defaultContent();
	
		
	}

}
