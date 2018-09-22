package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	@FindBy(name = "firstName")
	private WebElement firstNameTextfield;
	
	@FindBy(name = "lastName")
	private WebElement lastNameTextfield;
	
	@FindBy(name = "phone")
	private WebElement phoneTextfield;
	
	@FindBy(name = "userName")
	private WebElement emailTextfield;
	
	@FindBy(name = "address1")
	private WebElement address1Textfield;
	
	@FindBy(name = "address2")
	private WebElement address2Textfield;
	
	@FindBy(name = "city")
	private WebElement cityTextfield;
	
	@FindBy(name = "state")
	private WebElement stateTextfield;
	
	@FindBy(name = "postalCode")
	private WebElement postalCodeTextfield;

	@FindBy(name = "country")
	private WebElement countryDropDownList;
	
	@FindBy(name = "email")
	private WebElement userNameTextfield;
	
	@FindBy(name = "password")
	private WebElement passwordTextfield;
	
	@FindBy(name = "confirmPassword")
	private WebElement confirmPasswordTextfield;
	
	@FindBy(name = "register")
	private WebElement submitButton;


	public void inputContactInfo(String firstName, String lastName, String phone, String email) {
		firstNameTextfield.sendKeys(firstName);
		lastNameTextfield.sendKeys(lastName);
		phoneTextfield.sendKeys(phone);
		emailTextfield.sendKeys(email);
	}
	
	public void inputMailingInfo(String address1, String address2, String city, String state, String postalCode, String country) {
		address1Textfield.sendKeys(address1);
		address2Textfield.sendKeys(address2);
		cityTextfield.sendKeys(city);
		stateTextfield.sendKeys(state);
		postalCodeTextfield.sendKeys(postalCode);
		new Select(countryDropDownList).selectByVisibleText(country);
	}
	
	public void inputUserInfo(String userName, String password) {
		userNameTextfield.sendKeys(userName);
		passwordTextfield.sendKeys(password);
		confirmPasswordTextfield.sendKeys(password);
	}
	
	public void submitRegisterForm () {
		submitButton.click();
	}
	
}
