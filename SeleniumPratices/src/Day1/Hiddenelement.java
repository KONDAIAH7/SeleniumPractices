package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenelement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		//element is not interactable excption 
		//driver.findElement(By.xpath("//input[@id='male']")).click();
		
		List<WebElement> radio=driver.findElements(By.id("male"));
		int count= radio.size();
		System.out.println("total radio buttons"+count);
		for(int i=0;i<count;i++)
		{
			int x=radio.get(i).getLocation().getX();
			if(x!=0)
			{
				radio.get(i).click();
				break;
			}
		}
				

	}

}
