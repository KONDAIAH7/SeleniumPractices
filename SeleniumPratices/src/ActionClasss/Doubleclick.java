package ActionClasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws Exception 
	{

System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/dblclick/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body//div"))).perform();
		
		
		
		//driver.quit();
		
		
		
		

	}

}
