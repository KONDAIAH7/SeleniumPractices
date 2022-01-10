package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firstscript {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");

		//System.setProperty("webdriver.gecko.driver", "E:\\TESTING\\Drivers\\geckodriver.exe");

		System.setProperty("webdriver.ie.driver", "E:\\\\TESTING\\\\Drivers\\\\iedriverserver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		
		WebDriver driver =new InternetExplorerDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
