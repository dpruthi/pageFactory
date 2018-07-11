package testCase;

import org.openqa.selenium.support.PageFactory;

import com.driver.driver;

import Locator.signUpPage;

public class testCase extends driver {
	
	signUpPage signUp = PageFactory.initElements(driver, signUpPage.class);
	
	public static void main(String[]args){
		
		testCase test =new testCase();
		test.registrationScrit();
		
	}

	public void registrationScrit() {
		
		signUp.getSignIN().click();
		signUp.getEmailTextBox().sendKeys("mnbvc@yopmail.com");
		signUp.getSubmitBtn().click();
		signUp.getSignUpTextBoxes().get(4).sendKeys("fvsfb");
	}
}
