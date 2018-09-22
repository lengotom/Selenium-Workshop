package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText = "REGISTER")
	private WebElement registerLink;
		
	public void clickOnRegisterLink() {
		registerLink.click();
	}
	
}
