import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverHeroku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/hovers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		Actions act=new Actions(driver);
		WebElement avatar1=driver.findElement(By.xpath("//div[@class='figure'][1]"));
		act.moveToElement(avatar1).build().perform();
		System.out.println(driver.findElement(By.xpath("//div[@class='figure'][1]//following::h5")).getText());
		driver.findElement(By.xpath("//div[@class='figure'][1]//following-sibling::a")).click();
		driver.navigate().back();
		
		
		WebElement avatar2=driver.findElement(By.xpath("//div[@class='figure'][2]"));
		act.moveToElement(avatar2).build().perform();
		System.out.println(driver.findElement(By.xpath("//div[@class='figure'][2]//following::h5")).getText());
		driver.findElement(By.xpath("//div[@class='figure'][2]//following-sibling::a")).click();
		driver.navigate().back();

		WebElement avatar3=driver.findElement(By.xpath("//div[@class='figure'][3]"));
		act.moveToElement(avatar3).build().perform();
		System.out.println(driver.findElement(By.xpath("//div[@class='figure'][3]//following::h5")).getText());
		driver.findElement(By.xpath("//div[@class='figure'][3]//following-sibling::a")).click();
		driver.navigate().back();

		
	}

}
