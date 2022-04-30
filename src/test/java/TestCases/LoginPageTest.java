package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage login;
	
	@BeforeMethod
	public void setup()
	{
		initalization();
		login=new LoginPage();
		
	}
	@Test
	public void validateLoginPageTitle()
	{
		login.validateLoginPageTitle();
	}
	@AfterMethod
	public void exit()
	{
		driver.quit();
	}

}
