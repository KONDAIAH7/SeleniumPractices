package Scrolldemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpage {

	public static void main(String[] args) throws Exception 
	{
System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com");
		
		Thread.sleep(4000);
		
		((JavascriptExecutor)(driver)).executeScript("scroll(0,400)");
	}

}
