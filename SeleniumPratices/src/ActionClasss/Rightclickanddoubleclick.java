package ActionClasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickanddoubleclick {

	public static void main(String[] args) throws Exception 
	{

System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act = new Actions(driver);
		
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.quit();
		
		
		
		

	}

}
