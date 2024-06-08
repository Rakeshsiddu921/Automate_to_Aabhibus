package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lowest_in_flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Lowest price mobiles"+Keys.ENTER);
		
		List<WebElement> price=driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		ArrayList<Integer> str= new ArrayList<Integer>();
		
		for(WebElement ele:price) {
		String s=	ele.getText().replace("₹","").replace(",", "");
		int n=Integer.parseInt(s);
			str.add(n);
			
		}
		Collections.sort(str);
		System.out.println(str);
//		int num=str.get(0);
//		for(int i=0;i<str.size();i++) {
//			if(str.get(i)<num) {
//				num=str.get(i);
//				}
//	
		System.out.println(str.get(0));
		driver.close();


	}

}
