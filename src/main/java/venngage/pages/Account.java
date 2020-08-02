package venngage.pages;

import org.openqa.selenium.support.PageFactory;

import venngage.base.TestBase;

public class Account extends TestBase {

	public Account() {
		PageFactory.initElements(driver, this);
	}

	public void survey() {
		System.out.println(driver.getTitle());

	}

}
