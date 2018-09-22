package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homePage;
	private RegisterPage registerPage;
	private RegisteredUserPage registeredUserPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = PageFactory.initElements(driver, HomePage.class);
		}
		return homePage;
	}
	
	public RegisterPage getRegisterPage() {
		if (registerPage == null) {
			registerPage = PageFactory.initElements(driver, RegisterPage.class);
		}
		return registerPage;
	}
	
	public RegisteredUserPage getRegisteredUserPage() {
		if (registeredUserPage == null) {
			registeredUserPage = PageFactory.initElements(driver, RegisteredUserPage.class);
		}
		return registeredUserPage;
	}

}
