import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesNestedHeroku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");

		WebElement top = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(top);

		
		WebElement topleft = driver.findElement(By.name("frame-left"));
		driver.switchTo().frame(topleft);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(top);
		WebElement topmiddle = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(topmiddle);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(top);
		WebElement topright = driver.findElement(By.name("frame-right"));
		driver.switchTo().frame(topright);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().defaultContent();


		WebElement bottom= driver.findElement(By.name("frame-bottom"));
		driver.switchTo().frame(bottom);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		

	}

}
