package qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.HomePage;
import qa.pages.LaptopsPage;
import qa.pages.LogInPage;

public class LaptopsPageTest extends TestBase{
	
	LogInPage LogInPage;
	HomePage HomePage;
	LaptopsPage LaptopsPage;
	
	LaptopsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {

		initialization();
		LogInPage = new LogInPage();
		HomePage = new HomePage();
		HomePage = LogInPage.LogIn(prop.getProperty("username"), prop.getProperty("password"));
		LaptopsPage = new LaptopsPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void validateLaptopsLinkTest() {
		
		LaptopsPage.SonyVaioi5Page();
				
	}
	
	

}
