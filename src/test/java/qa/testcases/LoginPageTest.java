package qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.HomePage;
import qa.pages.LogInPage;

public class LoginPageTest extends TestBase {

	LogInPage LogInPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		LogInPage = new LogInPage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String title = LogInPage.validatePageTitle();
		Assert.assertEquals(title,"STORE");
	}
	
	@Test(priority=2)
	public void LogoImgTest() {
		boolean flag = LogInPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homePage = LogInPage.LogIn(prop.getProperty("username"), prop.getProperty("password"));
	}
}
