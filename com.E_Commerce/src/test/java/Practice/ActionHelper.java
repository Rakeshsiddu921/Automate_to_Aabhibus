package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionHelper {
	WebDriver driver;
	
	public ActionHelper(WebDriver driver) {
		this.driver=driver;
		
		
	}
	public void act(WebElement element) {
		Actions actions= new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

}
