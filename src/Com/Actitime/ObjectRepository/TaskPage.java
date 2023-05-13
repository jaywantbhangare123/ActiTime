package Com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Actitime.GenericLibrary.FileLibrary;

public class TaskPage {
	FileLibrary f1=new FileLibrary();
	
	//Declaration
	@FindBy(xpath = "//div[.='Add new ']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcstmr;
	
	@FindBy(xpath =" input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custmrname;
	
	@FindBy(xpath = "input[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	
	@FindBy(xpath = "/div[.='Create Cstomer']")
	private WebElement custer;
	
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement cancelbtn;
	
	//Initializaton
	public TaskPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}	
	//utilization
	public WebElement getAddnewbtn() {
		return addnewbtn;
}
	public WebElement getNewCust() {
		return newcstmr;
	
	}
	public WebElement getCustname() {
	return custmrname;	
}
	public WebElement getCustdesp() {
		return custdesp;	
	}
	public WebElement getCuster() {
		return custer;	
	}
	public WebElement getCancelbtn() {
		return cancelbtn;	
	//}
	//public WebElement getcreatecustmr() {
		// TODO Auto-generated method stub
		//return null;
	}}
	