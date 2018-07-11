package Locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class signUpPage {

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	@CacheLookup
	protected WebElement SignIN;

	public WebElement getSignIN() {
		return SignIN;
	}

	@FindBy(id = "email_create")
	@CacheLookup
	protected WebElement emailTextBox;

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	@FindBy(id = "SubmitCreate")
	@CacheLookup
	protected WebElement submitBtn;

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	@FindAll(@FindBy(xpath = "//input[@type = 'text' or @type='password']"))
	@CacheLookup
	protected List<WebElement> signUpTextBoxes;

	public List<WebElement> getSignUpTextBoxes() {
		return signUpTextBoxes;

	}

}
