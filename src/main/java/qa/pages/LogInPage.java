package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class LogInPage extends TestBase {
	
		//Page Factory: OR
	
	@FindBy(id="login2")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@id='loginusername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement confirmLoginBtn;
	
	@FindBy(xpath="//body/nav[@id='narvbarx']/a[@id='nava']/img[1]")
	WebElement logoImg;
	
		//Initializing page object/web elements
	
	public LogInPage() {
		
		PageFactory.initElements(driver, this);
	}
	
		//Get Page Title
	
	public String validatePageTitle() {
		return driver.getTitle();
		
	}
	
	public boolean validateLogo(){
		return logoImg.isDisplayed();
	}
	
	public HomePage LogIn(String uName, String pass) {
		
		loginBtn.click();
		username.sendKeys(uName);
		password.sendKeys(pass);
		confirmLoginBtn.click();
		
		return new HomePage();
	}
}
