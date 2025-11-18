import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsWebuniv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Actions/");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(drag, drop).build().perform();
		
		WebElement doubleclick= driver.findElement(By.id("double-click"));
		act.doubleClick(doubleclick).build().perform();
		
		WebElement hover1=driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
		act.moveToElement(hover1).build().perform();;
		driver.findElement(By.xpath("//a[text()='Link 1']")).click();
		Alert alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		WebElement hover2=driver.findElement(By.xpath("//button[text()='Hover Over Me Second!']"));
		act.moveToElement(hover2).build().perform();
		driver.findElement(By.xpath("//button[text()='Hover Over Me Second!']/following::a")).click();
		System.out.println(alt.getText());
		alt.accept();
		
		WebElement hover3= driver.findElement(By.xpath("//button[text()='Hover Over Me Third!']"));
		act.moveToElement(hover3).build().perform();
		driver.findElement(By.xpath("//button[text()='Hover Over Me Third!']/following::a[1]")).click();
		System.out.println(alt.getText());
		alt.accept();
		
		act.moveToElement(hover3).build().perform();
		driver.findElement(By.xpath("//button[text()='Hover Over Me Third!']/following::a[2]")).click();
		System.out.println(alt.getText());
		alt.accept();
		
		WebElement clkbx=driver.findElement(By.id("click-box"));
		act.clickAndHold(clkbx).build().perform();
		System.out.println(clkbx.getText());
		

		
		
	}
	

}
