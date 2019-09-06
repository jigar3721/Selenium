package SessionTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/jigar.desai/workspace/com.selenium/Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		Thread.sleep(2000);
		
		WebElement form=driver.findElement(By.xpath("//a[contains(text(),'Selectmenu')]"));
		form.click();
		
		Select s= new Select(driver.findElement(By.xpath("//select[@id='files']")));
		s.selectByVisibleText("ui.jQuery.js");
		
		Select s1=new Select(driver.findElement(By.xpath("//span[@id='speed-button']//span[2]")));
		s1.selectByVisibleText("Slow");
		
	}

}

