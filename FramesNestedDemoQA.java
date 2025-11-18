

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesNestedDemoQA {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		int size =driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total iFrames in this Pages  :"+size);
		WebElement ParentFrame= driver.findElement(By.id("frame1"));
		driver.switchTo().frame(ParentFrame);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		WebElement ChildFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(ChildFrame);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		
	}

}
