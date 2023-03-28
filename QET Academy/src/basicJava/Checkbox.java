package basicJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkbox {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		
	    List<WebElement> checkbox=driver.findElements(By.xpath("//div[@class='display'][2]//input[@name='sports']"));
		System.out.println(checkbox.size());
		
		
		for(WebElement e:checkbox) {
		     System.out.println(e.isSelected());
		     System.out.println(e.getAttribute("value"));
		     
		     if(e.getAttribute("value").equals("baseball")) {
		    	 e.click();
		     }
		}
		
		for(WebElement e:checkbox) {
		     System.out.println(e.isSelected());
		     System.out.println(e.getAttribute("value"));
		}
		
		
		

	}

}
