package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class LaptopsPage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Laptops')]")
	WebElement LaptopsLinkBtn;
	
	@FindBy(xpath=".//*[contains(text(),\"Sony vaio i5\")]")
	WebElement SonyVaioi5LinkBtn;
	
	@FindBy(xpath="//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement SonyVaioi5Img;
	
	
	public LaptopsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogo(){
		return SonyVaioi5Img.isDisplayed();
	}
	
	public SonyVaioi5Page SonyVaioi5Page() {
		
		LaptopsLinkBtn.click();
		
		return new SonyVaioi5Page();
		
	}

}
