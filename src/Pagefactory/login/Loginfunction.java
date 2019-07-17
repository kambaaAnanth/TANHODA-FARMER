package Pagefactory.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Kam.Common.function.Loginsuccessful_with_validcredential;

public class Loginfunction extends Loginsuccessful_with_validcredential{
@FindBy(xpath="//a[contains(text(),'LOGIN')]")
public static WebElement login;
@FindBy(xpath="//input[@placeholder='Mobile Number*']")
public static WebElement mobilenumber;
//@FindBy(xpath="//input[@placeholder='Password*']")
//public static WebElement password;
@FindBy(xpath="//button[@class='btn-one thm-bg-clr']")
public static WebElement singn;
@FindBy(xpath="//button[@name='submitotp']")
public static WebElement otpsubmit;
////button[@name='submitotp']
}
