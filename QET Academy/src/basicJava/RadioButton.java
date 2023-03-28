package basicJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.xpath("//input[@name='group1']"));
		
		System.out.println(list.size());
		
		for(WebElement e:list) {
			
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
			
			if(e.getAttribute("value").equals("Cheese")) {
				e.click();
			}
		}
		
		
		
		

	}

}
