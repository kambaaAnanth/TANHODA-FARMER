package Kam.tanhoda.login;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Kam.Common.function.Loginsuccessful_with_validcredential;

public class Loginfunction extends Loginsuccessful_with_validcredential{
@Test
public void Loginsuccessful(){
	try{
		PageFactory.initElements(driver,Pagefactory.login.Loginfunction.class);
		Pagefactory.login.Loginfunction.login.click();
		Pagefactory.login.Loginfunction.mobilenumber.sendKeys(loading.getProperty("mobilenumber"));
//		Pagefactory.login.Loginfunction.password.sendKeys(loading.getProperty("password"));
		Pagefactory.login.Loginfunction.singn.click();
		Pagefactory.login.Loginfunction.otpsubmit.click();
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "TANHODA");
	}catch(Exception e) {
        e.printStackTrace();
}
}

}



