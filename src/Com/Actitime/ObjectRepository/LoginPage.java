package Com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	 
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;
	
	
	//initilization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilizton
	public WebElement getUntbx() {
		return untbx;
	}
	public WebElement getpwtbx() {
		return pwtbx;
	}
	public WebElement getlgbtn() {
		return lgbtn;
	}
	
	
}
