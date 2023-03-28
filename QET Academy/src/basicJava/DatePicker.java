package basicJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		
		
		driver.findElement(By.xpath("//table[@class='days-head day-container-table']//tr[1]//td[@id='25/03/2023']")).click();
		


	}

}
