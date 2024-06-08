package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Find_lowest_Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lowest price mobiles"+Keys.ENTER);
		
		List<WebElement> price=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		ArrayList<Integer> str= new ArrayList<Integer>();
		
		for(WebElement ele:price) {
			String s=ele.getText().replace(",", "");
			int n=Integer.parseInt(s);
			str.add(n);
		}
		Collections.sort(str);
		System.out.println(str);
		System.out.println(str.get(0));
		driver.close();
		
		
		
		
		
	}

}
