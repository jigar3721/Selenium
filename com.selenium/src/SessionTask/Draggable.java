package SessionTask;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Draggable
{
 public static void main(String[] args) 
     {
		System.setProperty("webdriver.chrome.driver","C:/Users/jigar.desai/workspace/com.selenium/Driver/chromedriver.exe");

       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://demoqa.com/droppable");
       
       WebElement source = driver.findElement(By.id("draggable"));
       WebElement dest = driver.findElement(By.id("droppable"));
       Actions act = new Actions(driver);
       act.dragAndDrop(source,dest).perform();
       
       driver.quit();
     }
}

