package functions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import ObjectsRepository.ComposePageObj;
import Utilities.Utility;


public class ComposeMessageWithLable extends Utility 
{
	private ComposePageObj pageObj;

	public void sendMessage(WebDriver driver)
	{
		try
		{
		pageObj = PageFactory.initElements(driver, ComposePageObj.class);
		waifForElementClickable(pageObj.btnCompose,20);
		
		pageObj.btnCompose.click();
		
		pageObj.txtTo.clear();
		pageObj.txtTo.sendKeys(TMail);
		
		
		pageObj.txtSubject.clear();
		pageObj.txtSubject.sendKeys("This is Test");
		
		pageObj.lnkLable.click();
		
		}
		catch (Exception e) {
			System.out.println("Not able to post your message. Error Found: ****** "+e.getMessage()+" ******");
		}
	}

	public boolean vrfyComposeMsg() 
	{
		try 
		{
			//write verify compose code
			return true;			
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	
	
	
	

}
