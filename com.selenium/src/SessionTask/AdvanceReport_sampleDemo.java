package SessionTask;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class AdvanceReport_sampleDemo {
	 
	static WebDriver driver;
	static String url ="https://www.Gmail.com";
	static ExtentReports extent;
	static ExtentTest test;

	
	public static void launch()
	{	System.setProperty("webdriver.chrome.driver","C:/Users/jigar.desai/workspace/com.selenium/Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void login() throws InterruptedException
	{
				
				WebElement email_field=	driver.findElement(By.xpath("//input[@id='identifierId']"));
				email_field.sendKeys("jigardesai0005@gmail.com");
			
				//locator of next button in email page 
				WebElement email_next = driver.findElement(By.xpath("//div[@id='identifierNext']"));
				email_next.click();
			
			
				//Locator of Password Field
				WebElement email_password = driver.findElement(By.xpath("//input[@name='password']"));
				email_password.sendKeys( "9724130702");
			
				//Locator of next button
				WebElement password_next = driver.findElement(By.xpath("//div[@id='passwordNext']"));
				password_next.click();
				Thread.sleep(3000);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{	
		extent = new ExtentReports(System.getProperty("user.dir")+"\\result.html",true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\config.xml"));
		launch();
		login();
		
	}
}
