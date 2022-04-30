package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	
	public static void initalization()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
	
	}

}
