package job;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testi {
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\job\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		driver.get("https://www.cricbuzz.com/");
		String s=driver.getCurrentUrl();
		System.out.println("url inforr"+s);
		
	}
	
}
