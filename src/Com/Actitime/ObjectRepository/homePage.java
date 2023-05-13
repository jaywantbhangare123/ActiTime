package Com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
//declaration
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement taskstab;
	
	@FindBy(xpath="//div[.='reports']")
	private WebElement reportstab;
	
	@FindBy(xpath="//div[.='users']")
	private WebElement usertab;
	
	@FindBy(id= "logoutLink")
	private WebElement logoutlink;
	
	//initialization
	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getTasktab() {
		return taskstab;
	}
	public WebElement getReporttab() {
		return reportstab;
	}
	public WebElement getUserrtab() {
		return usertab;
	}
	public WebElement getLogoutLink() {
		return logoutlink;
	}
}
