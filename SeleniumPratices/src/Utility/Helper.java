package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper
{	
	
	public static void highlightelement(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:green;border:2px solid black;')", ele);
		
		try {
			Thread.sleep(500);
			} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		js.executeScript("arguments[0].setAttribute('style','border:2px solid white;')", ele);
	
	}

}
