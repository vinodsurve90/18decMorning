package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{
	
	//object Repository
	@FindBy(xpath = "//input[@id='userid']") private WebElement useridTextbox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwardTextbox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	@FindBy(xpath = "//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy(xpath = "//img[@alt='Zerodha']") private WebElement zerodLogo;
	
  public LoginPage() 
  {
	PageFactory.initElements(driver, this);
  }
  public void validateLoginPageTitle() 
  {
	driver.getTitle();
  }
  public void validateKitoLogo()
  {
	  kiteLogo.isDisplayed();
  }
  public void validateZerodaLogo()
  {
	  zerodLogo.isDisplayed();
	  
  }

	

}
