package com.venngage.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import venngage.base.TestBase;
import venngage.pages.Account;
import venngage.pages.SignUpPage;
import venngage.pages.TemplatesPage;

public class TestSignUp extends TestBase {
	
	TestSignUp testSignUp;
	SignUpPage signUpPage;
	TemplatesPage templatePage;
	Account accountPage;


	public TestSignUp() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testSignUp = new TestSignUp();

	}
	
	@Test
	public void signUpWithAllInput() {
		Account accountPage = new SignUpPage().signUpData(prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("email"),prop.getProperty("password") );
		
	}
	// Validating Signup with all field values:
	@Test (dataProvider = "sign")
	public void signUpTestWithMissingInputs(String firstname, String lastname, String email, String password) {
		
	}
	
	
	@DataProvider
	 public Object[][] sign() {
	    return new Object[][] {
	    
	      new Object[] { "lastname", "email", "password", "" },
	      new Object[] { "firstname", "email", "password", "" },
	      new Object[] { "", "", "", "" },
	     	      
	    };
	  }
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
