package E_com_Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import E_Com_Utilities.ConfigDataProvider;
import E_Com_Utilities.Driver_Factory;

public class First_Test {
	
	public WebDriver driver;
	public ConfigDataProvider config;
	
	@BeforeClass
	
	public void setup() throws IOException {
		config=new ConfigDataProvider();
		driver=Driver_Factory.startApplication(driver, config.getBrowser(), config.getbaseURL());
		
	}
	//@AfterClass
	public void tearDown() {
		driver.close();
		
	}

}
