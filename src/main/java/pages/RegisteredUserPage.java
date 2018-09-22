package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisteredUserPage {

	@FindBy(linkText = "SIGN-OFF")
	private WebElement signOffLink;
	
	public boolean verifyLoggedStatus() {
		return signOffLink.isDisplayed();
	}

}
