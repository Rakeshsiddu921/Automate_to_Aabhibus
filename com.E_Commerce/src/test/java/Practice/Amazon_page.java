package Practice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_page {

	public WebDriver driver;
	public WaitHelper wh;
	public ActionHelper ah;
	public Amazon_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		 wh= new WaitHelper(driver);
		 ah= new ActionHelper(driver);
		 
	}

	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;

	@FindBy(xpath = "//span[@class='s-heavy']")
	List<WebElement> suggestion;

	@FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
	WebElement result;
	
	@FindBy(xpath = "//span[@data-csa-c-id='yp3p6r-g3t39h-mw8018-2wpet8']//span[@class='a-size-base a-color-base']")
	List <WebElement> brand;
    
	@FindBy(xpath = "(//span[@class='a-size-base a-color-base'])[10]")
	WebElement checkbox1;
	
	@FindBy(xpath = "(//span[@class='a-size-base a-color-base'])[11]")
	WebElement checkbox2;
	
	@FindBy(xpath = "//span[text()='Featured']")
	WebElement sortby;
	
	@FindBy(linkText = "Newest Arrivals")
	WebElement newArraival;

	@FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement bagsName;
	
	@FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
	WebElement bagsprice;
	
	@FindBy(xpath = "(//span)[88]")
	WebElement bagsdiscount;



	public void search() {
		searchbox.sendKeys("bags");
	}
	public void findone() throws InterruptedException {
		Thread.sleep(5000);
		for(WebElement ele:suggestion) {
			
			if(ele.getText().equalsIgnoreCase("for boys")) {
				ele.click();
				break;
			}

		}
	}
	public void results() {
		String re=result.getText();
		System.out.println(re);

	}
	
	public void brand() {
		ah.act(checkbox1);
		//wh.waitforvisibility(checkbox1, 5);
		checkbox1.click();
		wh.waitforvisibility(checkbox2, 5);
		checkbox2.click();
		
	}
	
	public void Newest() {
		sortby.click();
		newArraival.click();
		System.out.println(bagsName.getText()+":"+bagsprice.getText()+":"+bagsdiscount.getText());
	}
	
	public void dearDown() {
		driver.close();
	}
	


}
