import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		@SuppressWarnings("unchecked")
		List<WebElement> AllLinks= (List<WebElement>) driver.findElements(By.xpath("//li[@class='gf-li']"));
		int Totallinks = AllLinks.size();
		
		
		AllLinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println(Totallinks);
		
		List<WebElement> ActiveLinks =new ArrayList<WebElement>();
		
		
		
		for(int i=0;i<AllLinks.size();i++)
		{
			System.out.println(AllLinks.get(i).getAttribute("href"));
		
			if(AllLinks.get(i).getAttribute("href")!=null && !AllLinks.get(i).getAttribute("href").equals(null))
			{
				ActiveLinks.add(AllLinks.get(i));
			}
		}
		
		System.out.println(ActiveLinks.size());
		
		for(int i=0;i<ActiveLinks.size();i++)
		{
			HttpURLConnection con= (HttpURLConnection) new URL(AllLinks.get(i).getAttribute("href")).openConnection();
			con.connect();
			int ResCode = con.getResponseCode();
			String ResMsg= con.getResponseMessage();
			System.out.println(AllLinks.get(i).getAttribute("href")+ResCode+ResMsg);
			con.disconnect();
		}

	}

}
