package Javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsdemo1 {

	public static void main(String[] args) throws Exception 
	{
System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kk");
		 Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("document.getElementById('persistent').click()");
		
		WebElement checkbox =driver.findElement(By.xpath("//input[@id='persistent']"));
		js.executeScript("arguments[0].click()",checkbox);
		
			}

}
