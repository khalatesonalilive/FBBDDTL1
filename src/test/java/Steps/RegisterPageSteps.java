package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;

public class RegisterPageSteps extends BaseClass {
	public static RegisterPage registerPage;

	@Given("user is on Facebook Register Page and validate the RegisterPage URL")
	public void user_is_on_facebook_register_page_and_validate_the_register_page_url() {

		BaseClass.initialization();

		registerPage = new RegisterPage();
		String actualUrl = registerPage.getRegisterPageURL();
		boolean a = actualUrl.contains("reg");
		Assert.assertEquals(a, true);

	}

	@Given("user enters the valid firstname and lastname")
	public void user_enters_the_valid_firstname_and_lastname() {
		registerPage.validateFAndLName("Sonali", "Khalate");
	}

	@Given("user enters a valid emailId and Password")
	public void user_enters_a_valid_email_id_and_password() {
		registerPage.emailIDAndPass("khalatesonali@gmail.com", "khalatesonali123");
	}

	@Given("user enters a valid date , month and year")
	public void user_enters_a_valid_date_month_and_year() {

		registerPage.validateDOBFunctionality("14", "Mar", "2000");
	}
}