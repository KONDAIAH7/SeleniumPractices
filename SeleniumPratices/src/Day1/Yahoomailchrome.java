package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yahoomailchrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("persistent")).click();
		
		//We can also use Action class for clickable element
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
		
		

	}

}
