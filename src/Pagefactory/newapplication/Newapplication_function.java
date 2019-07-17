package Pagefactory.newapplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newapplication_function {
	@FindBy(xpath="//a[contains(text(),'LOGIN')]")
	public static WebElement login;
	@FindBy(xpath="//input[@placeholder='Mobile Number*']")
	public static WebElement mobilenumber;
//	@FindBy(xpath="//input[@placeholder='Password*']")
//	public static WebElement password;
	@FindBy(xpath="//button[@class='btn-one thm-bg-clr']")
	public static WebElement singn;
	@FindBy(xpath="/html/body/div[1]/section[3]/div/div/div[2]/div[2]/div/div[1]/a/div/div[2]/h3")
	public static WebElement newapplication;
	@FindBy(xpath="//*[@id='blog-area']/div/div/div[2]/a")
	public static WebElement Addnew;
	@FindBy(xpath="//select[@id='state']")
	public static WebElement state;
	@FindBy(xpath=" //select[@id='district']")
	public static WebElement district;
	@FindBy(xpath="//select[@id='block']")
	public static WebElement block;
	@FindBy(xpath="//select[@id='village']")
	public static WebElement village;
	@FindBy(xpath="//select[@id='land_ownership']")
	public static WebElement land_ownership;
	@FindBy(xpath=" //input[@id='servey_no']")
	public static WebElement servey_no;
	@FindBy(xpath="//input[@id='subdivision']")
	public static WebElement servey_no1;
	@FindBy(xpath="//input[@id='patta_copy']")
	public static WebElement patta_copy;
	@FindBy(xpath="//input[@id='passport_photo']")
	public static WebElement passport_photo;
	@FindBy(xpath="//input[@id='bank_loan']")
	public static WebElement bank_loan;
	@FindBy(xpath=" //input[@id='adangal_copy']")
	public static WebElement adangal_copy;
	@FindBy(xpath="//input[@id='vao_certificate']")
	public static WebElement vao_certificate;
	@FindBy(xpath=" //input[@id='fmb']")
	public static WebElement fmb;
	@FindBy(xpath="//input[@id='total_area']")
	public static WebElement total_area;
	@FindBy(xpath="//select[@id='source_of_irrigation']")
	public static WebElement source_of_irrigation;
	@FindBy(xpath="//button[@class='btn-one thm-bg-clr']")
	public static WebElement submit;
	@FindBy(xpath=" //select[@id='scheme']")
	public static WebElement scheme;
	@FindBy(xpath="//select[@id='component']")
	public static WebElement component;
	@FindBy(xpath="//input[@id='area_proposed']")
	public static WebElement area_proposed;
	@FindBy(xpath="//select[@id='proposed_crop']")
	public static WebElement proposed_crop;
	@FindBy(xpath="//input[@id='estimate_cost']")
	public static WebElement estimate_cost;
	@FindBy(xpath=" //textarea[@id='relevant']")
	public static WebElement relevant;
	@FindBy(xpath=" //input[@class='btn-one thm-bg-clr submit']")
	public static WebElement submit2;
	@FindBy(xpath=" //select[@id='category']")
	public static WebElement category;
	@FindBy(xpath="//*[@id='blog-area']/div/div[2]/div[5]/div")
	public static WebElement applicationverified;
	@FindBy(xpath="//div[@class='col-md-7']")
	public static WebElement otpsubmit;
	
	
}
