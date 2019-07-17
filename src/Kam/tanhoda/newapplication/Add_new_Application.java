package Kam.tanhoda.newapplication;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Kam.Common.function.Loginsuccessful_with_validcredential;

public class Add_new_Application extends Loginsuccessful_with_validcredential{
	@Test
	public void newapplicationaddingsuccessful() throws AWTException, InterruptedException{
			PageFactory.initElements(driver,Pagefactory.newapplication.Newapplication_function.class);
			Pagefactory.newapplication.Newapplication_function.login.click();
			Pagefactory.newapplication.Newapplication_function.mobilenumber.sendKeys(loading.getProperty("mobilenumber"));
		//	Pagefactory.newapplication.Newapplication_function.password.sendKeys(loading.getProperty("password"));
			driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			Pagefactory.newapplication.Newapplication_function.singn.click();
			driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			
			Pagefactory.newapplication.Newapplication_function.otpsubmit.click();  
			
			String actual=driver.getTitle();
			System.out.println(actual);
			Assert.assertEquals(actual, "TANHODA");
			driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			
	 	   Pagefactory.newapplication.Newapplication_function.newapplication.click();
			
	 	   driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			Pagefactory.newapplication.Newapplication_function.Addnew.click();
			driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			
			Pagefactory.newapplication.Newapplication_function.land_ownership.click();
			Select select8=new Select (Pagefactory.newapplication.Newapplication_function.land_ownership);
			select8.selectByIndex(1);
			
			Pagefactory.newapplication.Newapplication_function.servey_no.sendKeys("1122");
			Pagefactory.newapplication.Newapplication_function.servey_no1.sendKeys("ASD");
			Pagefactory.newapplication.Newapplication_function.state.click();
			    Select select9=new Select(Pagefactory.newapplication.Newapplication_function.state);
			    select9.selectByIndex(1);
			    Pagefactory.newapplication.Newapplication_function.district.click();
			    Select select11=new Select(Pagefactory.newapplication.Newapplication_function.district);
			    select11.selectByValue("25");
			    Pagefactory.newapplication.Newapplication_function.block.click();
			    Select select12=new Select(Pagefactory.newapplication.Newapplication_function.block);
			    select12.selectByValue("315");
			    Thread.sleep(1000);
			    Pagefactory.newapplication.Newapplication_function.village.click();
			    Select select13=new Select(Pagefactory.newapplication.Newapplication_function.village);
			    select13.selectByIndex(10);;
			    Pagefactory.newapplication.Newapplication_function.total_area.sendKeys("4");
			    Pagefactory.newapplication.Newapplication_function.source_of_irrigation.click();
			    Select select14=new Select(Pagefactory.newapplication.Newapplication_function.source_of_irrigation);
			    select14.selectByIndex(2);
			    try{
			    Pagefactory.newapplication.Newapplication_function.patta_copy.click();
			    StringSelection selection4=new StringSelection("C:\\Users\\kavya\\Pictures\\Capture - Copy");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection4, null);
				Robot robot1111=new Robot();
				robot1111.keyPress(KeyEvent.VK_ENTER);
			    robot1111.keyRelease(KeyEvent.VK_ENTER);
			    robot1111.keyPress(KeyEvent.VK_CONTROL);
			    robot1111.keyPress(KeyEvent.VK_V);
			    robot1111.keyRelease(KeyEvent.VK_V);
			    robot1111.keyRelease(KeyEvent.VK_CONTROL);
			    robot1111.keyPress(KeyEvent.VK_ENTER);
			    robot1111.keyRelease(KeyEvent.VK_ENTER);
			    }catch (AWTException e) {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
			           }
			    driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
				Pagefactory.newapplication.Newapplication_function.submit.click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Thread.sleep(1000); 
//				String oldwindow=driver.getWindowHandle();
//			    Set<String> set =driver.getWindowHandles();
//			    Iterator<String> itr= set.iterator();
//			    while(itr.hasNext()){
//			    String childWindow=itr.next();
//				if(!oldwindow.equals(childWindow)){
//					driver.switchTo().window(childWindow);
//				}
				driver.switchTo().activeElement();
				Pagefactory.newapplication.Newapplication_function.scheme.click();
                Select scheme=new Select(Pagefactory.newapplication.Newapplication_function.scheme);
                scheme.selectByIndex(2);
            	Pagefactory.newapplication.Newapplication_function.category.click();
            	Select category=new Select(Pagefactory.newapplication.Newapplication_function.category);
            	category.selectByIndex(2);
            	Pagefactory.newapplication.Newapplication_function.component.click();
            	Select component=new Select(Pagefactory.newapplication.Newapplication_function.component);
            	component.selectByIndex(2);
            	Pagefactory.newapplication.Newapplication_function.area_proposed.sendKeys("1");
            	Pagefactory.newapplication.Newapplication_function.proposed_crop.click();
            	Select proposedcrop=new Select(Pagefactory.newapplication.Newapplication_function.proposed_crop);
            	proposedcrop.selectByIndex(1);
            	Pagefactory.newapplication.Newapplication_function.estimate_cost.sendKeys("100000");
            	Pagefactory.newapplication.Newapplication_function.relevant.sendKeys("nothing");
				Pagefactory.newapplication.Newapplication_function.passport_photo.click();
			    StringSelection selection5=new StringSelection("C:\\Users\\kavya\\Documents\\subbu2");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection5, null);
				Robot robot11111=new Robot();
				robot11111.keyPress(KeyEvent.VK_ENTER);
			    robot11111.keyRelease(KeyEvent.VK_ENTER);
			    robot11111.keyPress(KeyEvent.VK_CONTROL);
			    robot11111.keyPress(KeyEvent.VK_V);
			    robot11111.keyRelease(KeyEvent.VK_V);
			    robot11111.keyRelease(KeyEvent.VK_CONTROL);
			    robot11111.keyPress(KeyEvent.VK_ENTER);
			    robot11111.keyRelease(KeyEvent.VK_ENTER);
				Pagefactory.newapplication.Newapplication_function.adangal_copy.click();
			    StringSelection selection6=new StringSelection("C:\\Users\\kavya\\Pictures\\Capture 3");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection6, null);
				Robot robot111111=new Robot();
				robot11111.keyPress(KeyEvent.VK_ENTER);
			    robot11111.keyRelease(KeyEvent.VK_ENTER);
			    robot11111.keyPress(KeyEvent.VK_CONTROL);
			    robot11111.keyPress(KeyEvent.VK_V);
			    robot11111.keyRelease(KeyEvent.VK_V);
			    robot11111.keyRelease(KeyEvent.VK_CONTROL);
			    robot11111.keyPress(KeyEvent.VK_ENTER);
			    robot11111.keyRelease(KeyEvent.VK_ENTER);
			Pagefactory.newapplication.Newapplication_function.vao_certificate.click();
			    StringSelection selection7=new StringSelection("C:\\Users\\kavya\\Pictures\\Capture 2");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection7, null);
				Robot robot1111111=new Robot();
				robot11111.keyPress(KeyEvent.VK_ENTER);
			    robot11111.keyRelease(KeyEvent.VK_ENTER);
			    robot11111.keyPress(KeyEvent.VK_CONTROL);
			    robot11111.keyPress(KeyEvent.VK_V);
			    robot11111.keyRelease(KeyEvent.VK_V);
			    robot11111.keyRelease(KeyEvent.VK_CONTROL);
			    robot11111.keyPress(KeyEvent.VK_ENTER);
			    robot11111.keyRelease(KeyEvent.VK_ENTER);
			    Pagefactory.newapplication.Newapplication_function.fmb.click();
			    StringSelection selection8=new StringSelection("C:\\Users\\kavya\\Pictures\\Capture4");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection7, null);
				Robot robot11111111=new Robot();
				robot11111.keyPress(KeyEvent.VK_ENTER);
			    robot11111.keyRelease(KeyEvent.VK_ENTER);
			    robot11111.keyPress(KeyEvent.VK_CONTROL);
			    robot11111.keyPress(KeyEvent.VK_V);
			    robot11111.keyRelease(KeyEvent.VK_V);
			    robot11111.keyRelease(KeyEvent.VK_CONTROL);
			    robot11111.keyPress(KeyEvent.VK_ENTER);
			    robot11111.keyRelease(KeyEvent.VK_ENTER);
			    Pagefactory.newapplication.Newapplication_function.bank_loan.click();
			    StringSelection selection9=new StringSelection("C:\\Users\\kavya\\Pictures\\Capture 1");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection7, null);
				Robot robot111111111=new Robot();
				robot11111.keyPress(KeyEvent.VK_ENTER);
			    robot11111.keyRelease(KeyEvent.VK_ENTER);
			    robot11111.keyPress(KeyEvent.VK_CONTROL);
			    robot11111.keyPress(KeyEvent.VK_V);
			    robot11111.keyRelease(KeyEvent.VK_V);
			    robot11111.keyRelease(KeyEvent.VK_CONTROL);
			    robot11111.keyPress(KeyEvent.VK_ENTER);
			    robot11111.keyRelease(KeyEvent.VK_ENTER);
            	Pagefactory.newapplication.Newapplication_function.submit2.click();
            	
	}

	}


