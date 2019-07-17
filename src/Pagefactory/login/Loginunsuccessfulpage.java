package Pagefactory.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Kam.Common.function.Loginunsuccessful_with_invalidmobilenumber;

public class Loginunsuccessfulpage extends Loginunsuccessful_with_invalidmobilenumber{
	@FindBy(xpath="//a[contains(text(),'LOGIN')]")
	public static WebElement login;
	@FindBy(xpath="//input[@placeholder='Mobile Number*']")
	public static WebElement mobilenumber;
	@FindBy(xpath="//button[@class='btn-one thm-bg-clr']")
	public static WebElement singn;
}
