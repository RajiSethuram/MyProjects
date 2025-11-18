import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropHeroku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		WebElement drag= driver.findElement(By.id("column-a"));
		WebElement drop=driver.findElement(By.id("column-b"));
		Actions act= new Actions(driver);
	//	act.dragAndDrop(drop, drag).build().perform();
		act.dragAndDrop(drag, drop).build().perform();
		
	}

}
