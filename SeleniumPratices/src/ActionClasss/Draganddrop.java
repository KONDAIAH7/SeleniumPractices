package ActionClasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws Exception 
	{

System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(5000);

		Actions act = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
	
		act.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")), 300, 150).perform();
				
		
		//driver.quit();
		
		
		
		

	}

}
