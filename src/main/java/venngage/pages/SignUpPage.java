package venngage.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import venngage.base.TestBase;

public class SignUpPage extends TestBase {

	public void signUpPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	WebElement firstName;

	@FindBy(name = "last_nameme")
	WebElement lastName;

	@FindBy(name = "email")
	WebElement Email;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(id = "btn_register")
	WebElement signUp;

	public Account signUpData(String firstname, String lastname, String email, String password) {

		firstName.sendKeys("firstname");
		lastName.sendKeys("lastname");
		Email.sendKeys("email");
		Password.sendKeys("password");
		signUp.click();
		return new Account();

	}

}
