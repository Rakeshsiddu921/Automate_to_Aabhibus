package E_com_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	public WebDriver driver;
	public Login_page(WebDriver driverl) {
		this.driver=driverl;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//input[@name='username']") WebElement username;
	@FindBy(xpath = "//input[@name='password']") WebElement password;
	@FindBy(xpath = "//button[@type='submit']") WebElement submit;

	public void loginPortal(String use,String pas) {
		username.sendKeys(use);
		password.sendKeys(pas);
		submit.click();

	}
}

