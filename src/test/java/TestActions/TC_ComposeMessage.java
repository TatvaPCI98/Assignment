package TestActions;



import org.testng.annotations.Test;

import Utilities.Utility;
import functions.Login;
import functions.ComposeMessageWithLable;

public class TC_ComposeMessage extends Utility {

	private ComposeMessageWithLable actions = new ComposeMessageWithLable();
	private Login loginAction = new Login();
	

	//Precondition to setup browser and URL
	@Override
	public void preConditions() {
		super.preConditions();
		loginAction.loginAction(driver);
	}

	@Test(description = "This test will Compose message with lable ")
	public void composeMessage() {
		
		actions.sendMessage(driver);
		
		
	}
	
	//Post condition will run after test execution
	@Override
	public void postConditions() {
		super.postConditions();
		
	}

}
