package ObjectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

 
public class ComposePageObj 
{
	@FindBy(how = How.XPATH, using = " .//div[contains(text(),'Compose')]")
	public WebElement btnCompose ;
	
	
	@FindBy(how = How.XPATH, using = "(//textarea[@name='to'])[2]")
	public WebElement txtTo ;
	
	
	@FindBy(how = How.XPATH, using = "(.//input[@name='subjectbox'])[2]")
	public WebElement txtSubject ;
	
	
	@FindBy(how = How.XPATH, using = "(.//div[@class='J-J5-Ji J-JN-M-I-JG'])[6]")
	public WebElement lnkLable ;
	

	@FindBy(how = How.XPATH, using = ".//div[contains(text(),'Label')]")
	public WebElement bntLable ;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(text(),'Create new')]")
	public WebElement newLable ;
	
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create')]")
	public WebElement btncreateNewLabel ;
	
	
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[5]")
	public WebElement txtNewLable ;
	
}
