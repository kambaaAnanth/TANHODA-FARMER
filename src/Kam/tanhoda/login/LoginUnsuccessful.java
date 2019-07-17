package Kam.tanhoda.login;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Kam.Common.function.Loginunsuccessful_with_invalidmobilenumber;
import Pagefactory.login.Loginunsuccessfulpage;

public class LoginUnsuccessful extends Loginunsuccessful_with_invalidmobilenumber{
@Test
public void unsuccessful(){
	try{
	PageFactory.initElements(driver, Loginunsuccessfulpage.class);
	Loginunsuccessfulpage.login.click();
	Loginunsuccessfulpage.mobilenumber.sendKeys(loading.getProperty("mobilenumber"));
	Loginunsuccessfulpage.singn.click();
	System.out.println("The number is Invalid");
	}catch(Exception e) {
        e.printStackTrace();
} 

}
 
}
