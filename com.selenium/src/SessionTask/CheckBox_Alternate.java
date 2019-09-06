package SessionTask;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Alternate
{
public static void main(String[] args) throws InterruptedException 
{
	
		System.setProperty("webdriver.chrome.driver","C:/Users/jigar.desai/workspace/com.selenium/Driver/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com");
	Thread.sleep(2000);

	By input = By.xpath("//a[contains(text(),'Checkboxradio')]");
	WebElement form=driver.findElement(input);	
	form.click();
	Thread.sleep(2000);


	By input1= By.xpath("//label[@class='ui-checkboxradio-label ui-corner-all ui-button ui-widget']");
	List<WebElement> abc = driver.findElements(input1);
	
	for (WebElement webElement : abc) {
		
		if(webElement.isSelected())
		{
			webElement.click();
			System.out.println("All ready Selected");
		}
		
		
		else
		{
			webElement.click();
			System.out.println("Clicked");
			
		}
	}
	
	
}	
}
