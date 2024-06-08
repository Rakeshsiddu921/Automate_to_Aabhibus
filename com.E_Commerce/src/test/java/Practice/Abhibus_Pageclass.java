package Practice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Abhibus_Pageclass {
	
	public  WebDriver driver;
	
	public  Abhibus_Pageclass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy (xpath = "//input[@placeholder='From Station']") 
	WebElement from;
	@FindBy (xpath="//div[text()='Chennai']")
	WebElement fromlo;
	@FindBy(xpath = "//input[@placeholder='To Station']")
	WebElement to;
	@FindBy(xpath="//div[text()='Bangalore']")
	WebElement tolo;
	@FindBy(xpath="//button[text()='Tomorrow']")
	WebElement tmbutton;
	@FindBy(xpath="//div[@class='container card service  md ']")
	List<WebElement> firsttitle;
    @FindBy(xpath="//span[text()='Sleeper']")
    WebElement bustype;
    @FindBy(xpath="//div[@id='service-operator-select-seat-2085462924']//small")
    WebElement Availableseat;
    @FindBy(xpath="(//button[text()='Show Seats'])[1]")
    WebElement showseat;
    
    
    public void from(){
    	
    	
    	from.sendKeys("che");
        fromlo.click();
       
    }
    public void to() {
       	
       	to.sendKeys("bang");
    	tolo.click();
            	
    }
	

}
