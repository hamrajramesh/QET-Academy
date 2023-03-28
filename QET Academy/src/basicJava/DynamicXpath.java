package basicJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicXpath {
	
	public static void main(String[]args) throws InterruptedException {
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("//b[starts-with(text(),'selenium')]"));
		System.out.println(list.size());
		
		list.get(4).click();
		

		
		
		
		
		
	}

}
