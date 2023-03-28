package basicJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
	   // List<WebElement> list=driver.findElements(By.tagName("iframe"));
	   // System.out.println(list.size());
	    
	    driver.switchTo().frame(0);
	    WebElement element=driver.findElement(By.xpath("//div[@id='draggable']"));
	    System.out.println(element.getText());
	    
	    
	    driver.switchTo().defaultContent();
	    WebElement element1=driver.findElement(By.xpath("//h1[text()='Draggable']"));
	    System.out.println(element1.getText());
	    driver.close();
	    
	    
	    
	    
		
		

	}

}
