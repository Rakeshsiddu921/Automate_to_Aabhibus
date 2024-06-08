package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abhibus_Ticket_Booking {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 * Abhibus_Pageclass abhibus= new Abhibus_Pageclass(driver);
		 * driver.navigate().refresh(); abhibus.from(); abhibus.to();
		 */
		
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From Station']"));
		from.click();
		
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		

	}

}
