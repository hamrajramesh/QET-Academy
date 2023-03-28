package basicJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("http://www.tizag.com/htmlT/htmlselect.php");
	
		
		WebElement dropdown=driver.findElement(By.xpath("(//select[@name='selectionField'])[1]"));
	    Select s= new Select(dropdown);
	    s.selectByValue("CN");
	    
	    
	    

	}

}
