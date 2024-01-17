package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {

	@FindBy(name = "firstname")
	private WebElement fname;

	@FindBy(name = "lastname")
	private WebElement lname;
	
	@FindBy(name = "reg_email__")
	private WebElement emailiD ;
	
	@FindBy(name = "reg_passwd__")
	private WebElement pass ;

	public RegisterPage() {

		PageFactory.initElements(driver, this);
	}

	public String getRegisterPageURL() {

		return driver.getCurrentUrl();
	}

	public void validateFAndLName(String Fname, String Lname) {
		fname.sendKeys(Fname);
		lname.sendKeys(Lname);

	}
	
	public void emailIDAndPass(String emailID, String PassWord)
	{
		emailiD.sendKeys(emailID);
		pass.sendKeys(PassWord);
		
	}
}
