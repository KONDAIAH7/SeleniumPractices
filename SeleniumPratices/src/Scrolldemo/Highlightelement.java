package Scrolldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Helper;

public class Highlightelement {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
		Helper.highlightelement(driver, username);
		username.sendKeys("kondaiah");
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		Helper.highlightelement(driver, password);
		password.sendKeys("1234");
	}

}
