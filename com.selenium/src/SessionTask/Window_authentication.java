package SessionTask;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Window_authentication {
	WebDriver driver ;
	 WebDriver driver1;
	 WebDriver driver2 ;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver","C:/Users/jigar.desai/workspace/com.selenium/Driver/chromedriver.exe");

		// Runtime.getRuntime().exec("C:\\Users\\jigar.desai\\Downloads\\auth.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 WebDriver driver1 = new FirefoxDriver();
		 WebDriver driver2 = new  InternetExplorerDriver();
		 launch(driver);
		 launch(driver1);
		 launch(driver2);
	}
	public static void launch(WebDriver driver ) throws InterruptedException, IOException
	{
		Thread.sleep(3000);
	 Runtime.getRuntime().exec("C:\\Users\\jigar.desai\\Downloads\\auth.exe");
	 driver.manage().window().maximize();
	 driver.get("http://the-internet.herokuapp.com/basic_auth");
	 Thread.sleep(5000);
	 driver.quit();
	}

}
