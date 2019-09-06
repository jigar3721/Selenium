package SessionTask;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cross_browsing {
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	WebDriver driver1= new FirefoxDriver();
	WebDriver driver2 = new InternetExplorerDriver();
	launch(driver);
	launch(driver1);
	launch(driver2);
}

public static void launch(WebDriver driver)
{
	System.setProperty("webdriver.chrome.driver","C:/Users/jigar.desai/workspace/com.selenium/Driver/chromedriver.exe");

	WebDriverWait wait = new WebDriverWait(driver,20);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.Gmail.com");
	WebElement email_field=	driver.findElement(By.xpath("//input[@id='identifierId']"));
	//sendKeys(driver, email_field, 10 ,"jigarbharatdesai@gmail.com");
	email_field.sendKeys("Jigardesai0005@gmail.com");
	
	//locator of next button in email page 
	WebElement email_next = driver.findElement(By.xpath("//div[@id='identifierNext']"));
	email_next.click();

	//Locator of Password Field
	WebElement email_password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	//sendKeys(driver, email_password, 10, "9724130702okdesai");
	email_password.sendKeys("9724130702");
	
	//Locator of next button
	WebElement password_next = driver.findElement(By.xpath("//div[@id='passwordNext']"));
	password_next.click();
	
	//Locator of Compose button
	WebElement compose = driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']"));
	compose.click();
}
}
