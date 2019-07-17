package Kam.Common.function;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Loginunsuccessful_with_invalidmobilenumber {
	public static WebDriver driver;
	public static Properties loading;
	public Properties loadproperty() throws IOException{
		FileInputStream Stream=new FileInputStream("Config.properties.invalidmobilenumber"); 
		loading=new Properties();
		loading.load(Stream);
		return loading;
	}
@BeforeSuite
public void launchbrowser() throws IOException{	
	try{
	loadproperty();
	String username=loading.getProperty("mobilenumber");
	//String password=property.getProperty("password");
	String browser=loading.getProperty("browser");
	String driverlocation=loading.getProperty("driverlocation");
	String url=loading.getProperty("url");
	if(browser.equalsIgnoreCase("Firefox")){
		System.setProperty("Webdriver.chrome.driver", driverlocation);
		driver=new ChromeDriver();
		
	}else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("Webdriver.gecko.driver", driverlocation);
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get(url);
	}catch(Exception e) {
        e.printStackTrace();
	}
}

@AfterSuite
public void teardown(){
	driver.close();
}

}
 








