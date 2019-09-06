package SessionTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_type
 {
      public static void main(String[] args) throws InterruptedException
     {	
    System.setProperty("webdriver.chrome.driver","C:/Users/jigar.desai/workspace/com.selenium/Driver/chromedriver.exe");


    	  WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com");
		
	WebElement form=driver.findElement(By.linkText("Dropdown"));
	form.click();
		
	Select dropdown = new Select(driver.findElement(By.id("dropdown")));
		
	dropdown.selectByIndex(1);
	Thread.sleep(2000);
		
	dropdown.selectByValue("2");
	Thread.sleep(2000);
		
	dropdown.selectByVisibleText("Option 1");
	Thread.sleep(2000);
	

	  //Navigate to the new Url 
	  driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
	
	//Perform DropDown in another Website 
	Select dropdown1=new Select(driver.findElement(By.name("continents")));
		
	dropdown1.selectByVisibleText("South America");
	Thread.sleep(2000);
		
	dropdown1.selectByIndex(2);
	Thread.sleep(2000);
		
	dropdown1.selectByValue("NA");
	Thread.sleep(2000);

	//Perform Muliple Select option
	WebElement multiple_select = driver.findElement(By.id("continentsmultiple"));
	dropdown = new Select(multiple_select);

	if(dropdown.isMultiple())
	{
	dropdown.selectByIndex(4);
	dropdown.selectByValue("AS");
	dropdown.selectByVisibleText("Antarctica");
	}
	
	Thread.sleep(5000);
	dropdown.deselectAll();	
	Thread.sleep(5000);

	driver.quit();
     }
	}

