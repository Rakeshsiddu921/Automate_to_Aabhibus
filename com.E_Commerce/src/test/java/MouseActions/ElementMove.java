package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementMove {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=7995782456134553144&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9153049&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	WebElement link=	driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[]0.scrollIntoView(true)", link);

	}

}
