package SessionTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/jigar.desai/workspace/com.selenium/Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://protonmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		WebElement sign_up = driver.findElement(By.xpath("//a[text()='SIGN UP']"));
		sign_up.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement tab= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-plan='free']")));
		tab.click();
		Thread.sleep(3000);
		
		WebElement select = driver.findElement(By.xpath("//div[@id='plan-free']//button"));
		Thread.sleep(3000);
		select.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@data-name='top']")));
		
		WebElement username = driver.findElement(By.xpath("//input[@iframename='top']"));
		username.sendKeys("JigarDessssajsssasjjjjii");
		
		driver.switchTo().parentFrame();
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("desai52333721Ok@");
		
		WebElement confirm_pwd = driver.findElement(By.id("passwordc"));
		confirm_pwd.sendKeys("desai52333721Ok@");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@data-name='bottom']")));
		driver.findElement(By.name("submitBtn")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("confirmModalBtn")).click();
		
		Thread.sleep(3000);
		
		
		
		
		driver.findElement(By.xpath("//input[@value='email']")).click();
		
		driver.findElement(By.id("emailVerification")).sendKeys("jigarbharatdesai@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='pm_button primary codeVerificator-btn-send']")).click();
		Thread.sleep(2000);
		String parent =driver.getWindowHandle();
		Robot robot = new Robot();                          
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_T); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyRelease(KeyEvent.VK_T);
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		
		driver.get("https://www.Gmail.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		Set<String>allIds=driver.getWindowHandles();
		System.out.println(allIds);
						
		ArrayList<String> list = new ArrayList<String>(allIds);
		for(String e:list)
		{
		    driver.switchTo().window(e);
		}
		
		//locator of Email id Field 	
		WebElement email_field=	driver.findElement(By.xpath("//input[@id='identifierId']"));
		email_field.sendKeys("jigarbharatdesai@gmail.com");
	
		//locator of next button in email page 
		WebElement email_next = driver.findElement(By.xpath("//div[@id='identifierNext']"));
		email_next.click();
	
	
		//Locator of Password Field
		WebElement email_password = driver.findElement(By.xpath("//input[@name='password']"));
		email_password.sendKeys("9724130702okdesai");
	
		//Locator of next button
		WebElement password_next = driver.findElement(By.xpath("//div[@id='passwordNext']"));
		password_next.click();
		Thread.sleep(3000);
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//table[@class='F cf zt']//tr[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//code[@style='font-size:2.5em;line-height:2em']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//input[@id='codeValue']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
