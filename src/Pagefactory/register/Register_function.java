package Pagefactory.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_function {
@FindBy(xpath=" //a[contains(text(),'New Registration')]")
public static WebElement registerbutton;
@FindBy(xpath=" //input[@id='aadhaar_id']")
public static WebElement aadhaar_id;
@FindBy(xpath="//input[@id='hotnet_id']")
public static WebElement hotnet_id;
@FindBy(xpath="//input[@id='ulavanapp_id']")
public static WebElement ulavanapp_id;
@FindBy(xpath=" //select[@id='farmer_type']")
public static WebElement farmer_type;
@FindBy(xpath="//input[@id='mobile_number']")
public static WebElement mobile_number;
@FindBy(xpath="//input[@id='name']")
public static WebElement name;
@FindBy(xpath="//input[@id='email']")
public static WebElement email;
@FindBy(xpath="//input[@name='gname']")
public static WebElement gname;
@FindBy(xpath=" //select[@id='gender']")
public static WebElement gender;
@FindBy(xpath="//select[@id='social_status']")
public static WebElement social_status;
@FindBy(xpath="//input[@id='password']")
public static WebElement password;
@FindBy(xpath="//input[@id='age']")
public static WebElement age;
@FindBy(xpath="//select[@id='qualification']")
public static WebElement qualification;
@FindBy(xpath="//input[@id='income']")
public static WebElement income;
@FindBy(xpath="//input[@id='pan_no']")
public static WebElement pan_no;
@FindBy(xpath=" //input[@id='ration_card']")
public static WebElement ration_card;
@FindBy(xpath="//input[@id='profile_pic']")
public static WebElement profile_pic;
@FindBy(xpath="//select[@id='state']")
public static WebElement state;
@FindBy(xpath=" //select[@id='district']")
public static WebElement district;
@FindBy(xpath="//select[@id='block']")
public static WebElement block;
@FindBy(xpath="//select[@id='village']")
public static WebElement village;
@FindBy(xpath="//input[@id='habitation']")
public static WebElement habitation;
@FindBy(xpath="//input[@id='house_no']")
public static WebElement house_no;
@FindBy(xpath=" //input[@id='street']")
public static WebElement street;
@FindBy(xpath="//input[@id='pincode']")
public static WebElement pincode;
@FindBy(xpath="//input[@id='phone_number']")
public static WebElement phone_number;
@FindBy(xpath="//input[@id='bank_name']")
public static WebElement bank_name;
@FindBy(xpath="//input[@id='branch_name']")
public static WebElement branch_name;
@FindBy(xpath=" //input[@id='ifsc_code']")
public static WebElement ifsc_code;
@FindBy(xpath=" //input[@id='bank_account_no']")
public static WebElement bank_account_no;
@FindBy(xpath="//input[@id='bank_passbook_copy']")
public static WebElement bank_passbook_copy;
@FindBy(xpath=" //input[@id='aadhaar_copy']")
public static WebElement aadhaar_copy;
@FindBy(xpath="//input[@id='ration_copy']")
public static WebElement ration_copy;
@FindBy(xpath="//select[@id='land_ownership']")
public static WebElement land_ownership;
@FindBy(xpath=" //input[@id='servey_no']")
public static WebElement servey_no;
@FindBy(xpath="//input[@id='servey_no1']")
public static WebElement servey_no1;
@FindBy(xpath=" //select[@id='land_state']")
public static WebElement land_state;
@FindBy(xpath="//select[@id='land_district']")
public static WebElement land_district;
@FindBy(xpath="//select[@id='land_block']")
public static WebElement land_block;
@FindBy(xpath="//select[@id='land_village']")
public static WebElement land_village;
@FindBy(xpath="//input[@id='total_area']")
public static WebElement total_area;
@FindBy(xpath="//select[@id='source_of_irrigation']")
public static WebElement source_of_irrigation;
@FindBy(xpath="//input[@id='patta_copy']")
public static WebElement patta_copy;
@FindBy(xpath="//input[@id='chitta_copy']")
public static WebElement chitta_copy;
@FindBy(xpath=" //input[@id='adangal_copy']")
public static WebElement adangal_copy;
@FindBy(xpath="//input[@id='vao_certificate']")
public static WebElement vao_certificate;
@FindBy(xpath="//button[@class='btn-one thm-bg-clr']")
public static WebElement submit;

}
