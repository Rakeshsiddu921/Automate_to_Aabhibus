package E_Com_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro=new Properties();
	
	public ConfigDataProvider() throws IOException {
		
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\com.E_Commerce\\Configuration\\Config.properties");
		
		
			FileInputStream fileinput=new FileInputStream(file);
	        pro.load(fileinput);
			
		
		}
	public String getBrowser() {
		
	    return pro.getProperty("browser");
	}
	public String getbaseURL() {
		return pro.getProperty("baseURl");
	}
	

}
