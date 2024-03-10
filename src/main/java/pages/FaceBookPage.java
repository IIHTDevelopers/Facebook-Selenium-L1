package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage extends StartupPage {
	//please write all the locators for facebook page only 

	By loginButton = By.xpath(""); 
	By emailAddsPhoneNumberTextbox = By.xpath(""); 
	By passwordTextbox = By.xpath(""); 
	By profileIconImage = By.xpath(""); 
	By logoutButton = By.xpath(""); 
	By forgettenPasswordLink = By.xpath(""); 
	By createNewAccountLink = By.xpath(""); 
	By emailTextField = By.id(""); 
	By errorMessageWithoutCredential = By.xpath(""); 
	By errorMessageWithoutCredentialForgetPassword = By.xpath(""); 
	By withoutPasswordErrorMessage = By.xpath("");

	By createNewAccount = By.xpath(""); 
	By signUpButton = By.xpath(""); 
	By nameFieldErorMessage = By.xpath(""); 
	By firstNameTextField = By.xpath(""); 
	By surNameTextField = By.xpath(""); 
	By mobileNumberAndPassword = By.xpath(""); 
	By newPassword = By.xpath(""); 
	By selectDateFromDateDropdown = By.xpath(""); 
	By selectBirthdayMonth = By.xpath("");
	By selectBirthDayYear = By.xpath("");
	By customRadioButton = By.xpath("");
	By selectYourPronounDropdown = By.xpath("");
	By genderOptionalTextBox = By.xpath("");
	By selectFemaleRadioButton = By.xpath("");
	By selectMaleRadioButton = By.xpath("");
	By closeSignupPageImage = By.xpath("");





	public FaceBookPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this); // Initialize Page Factory
		// TODO Auto-generated constructor stub
	}


	public String validateFacebookTitleOfLoginPage() throws Exception {
		return null;
	}


	public Boolean verifyPresenceOfALlFields() throws Exception {
		
		return null;
	}

	public String validateErrorMessageWithoutProvideAnyCredentials() throws Exception {
		
		return null;
	}

	public void enterEmailIdOrPhoneNumberInLoginPage(Map<String, String> expectedData) throws Exception {
		
	}

	public String validateErrorMessageWithoutProvidePassword(Map<String, String> expectedData) throws Exception {
		return null;
	}

	public void enterPasswordInLoginPage(Map<String, String> expectedData) throws Exception {
		
	}

	public String validateErrorMessageWithoutProvideEmailOrPhoneNumber() throws Exception {
		
		return null;

	}

	public Boolean goBackToLogInPageAndValidateCreateNewAccountButtonIsPresentOrNot() throws Exception {
		
		return null;
	}

	public String validateNavigateToTheSignUpPage() throws Exception {
		
		return null;
	}

	public Boolean verifyPresenceOfAllFieldsPresentInTheSignUpPage() throws Exception {
		
		return null;
	}

	public  String enterDataInFirstNameFieldSignupPage( Map<String, String> expectedData) throws Exception {
		
		return null;

	}

	public  void enterDataInSignUpPage( Map<String, String> expectedData) throws Exception {
		
		
	}

	public Boolean selectDateFromDateDropdownAndVerifyDateDropdownIsPrsentOrNot() throws Exception {
		
		return null;
	}

	public Boolean selectAnyMonthFromMonthDropdownAndVerifyMonthDropdownIsPrsentOrNot() throws Exception {
				
		return null;
	}

	public Boolean selectAnyYearFromYearDropdownAndVerifyYearDropdownIsPrsentOrNot() throws Exception {
		
		return null;
	}

	public Boolean selectCustomRadioButtonAndVerifyCustomRadioButtonIsPrsentOrNot() throws Exception {
		
		
		return null;
	}

	public Boolean selectAnyOptionFromYourPronouDropdownAndVerifyYourPronouDropdownIsPrsentOrNot() throws Exception {
		
		return null;
	}

	public Boolean enterValueInGenderOptionalTextFieldAndValidateGenderOptionalTextFieldIsPresentOrNot(Map<String, String> expectedData) throws Exception {
		
		
		return null;
	}

	public Boolean selectFemaleRadioButtonAndVerifyFemaleRadioButtonIsPrsentOrNot() throws Exception {
		
		return null;
	}

	public Boolean selectMaleRadioButtonAndVerifyMaleRadioButtonIsPrsentOrNot() throws Exception {
		
		return null;
	}

	public Boolean verifyAllprsenceOfFieldAfterCloseTheSignupPage() throws Exception {
		
		return null;

	}

	public Boolean enterValidEmail_PasswordInTextFieldAndVerifyLoginButtonIsPresentOrNot(Map<String, String> expectedData) throws Exception {
		
		return null;
	}


}
