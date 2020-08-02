package venngage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import venngage.base.TestBase;

public class TemplatesPage extends TestBase {
	public TemplatesPage() {
		PageFactory.initElements(driver, this);
	}

	public void buttonValidation() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//span[text()='Create']"));

		action.moveToElement(we).build().perform();
		Thread.sleep(2000);

		String create = driver.findElement(By.xpath("//button[@class='templates__signUp--2DvEL']")).getText();
		System.out.println(create);

		if (create.equals("CREATE")) {
			System.out.println("passed");

		} else {
			System.out.println("failed");
		}

		WebElement createButton = driver.findElement(By.xpath("//button[@class='templates__signUp--2DvEL']"));
		action.moveToElement(createButton).build().perform();
		Thread.sleep(2000);

		String signUPText = driver.findElement(By.xpath("//button[@class='templates__signUp--2DvEL']")).getText();
		System.out.println(signUPText);

		if (signUPText.equals("")) {
			System.out.println("passed");

		} else {
			System.out.println("failed");
		}

		driver.findElement(By.xpath("//button[@class='templates__signUp--2DvEL']")).click();
	}

}
