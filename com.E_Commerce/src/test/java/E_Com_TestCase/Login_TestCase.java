package E_Com_TestCase;

import org.testng.annotations.Test;

import E_com_Page.First_Test;
import E_com_Page.Login_page;

public class Login_TestCase extends First_Test {
	
	@Test
	public void login() {
		
		Login_page log = new Login_page(driver);
		String user="Admin";
		String pass="admin123";
		log.loginPortal(user,pass );
		
	}

}
