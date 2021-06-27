package Javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsintro {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		WebElement ema= driver.findElement(By.xpath("//input[@name='email']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('email').value='kkondaiah';");
		
		//js.executeScript("arguments[0].value= 'kkondaiah123@gmail.com'",ema);
	}

}
