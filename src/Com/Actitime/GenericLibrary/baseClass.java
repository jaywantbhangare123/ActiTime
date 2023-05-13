package Com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com.Actitime.ObjectRepository.LoginPage;
import Com.Actitime.ObjectRepository.homePage;

public class baseClass {
	public static WebDriver driver;
	FileLibrary f =new FileLibrary();
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connected",true);
	}
	@BeforeMethod
	public void launchbrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String URL =f.readDataFromPropertyFile("url");
		driver.get(URL);
		//driver.get(https://demo.actitime.com/);
		Reporter.log("Browser Launched",true);
	}
	@BeforeMethod
	public void login() throws IOException {
		LoginPage lp=new LoginPage(driver);
		String un=f.readDataFromPropertyFile("username");
		driver.findElement(By.id("username")).sendKeys(un);
		String pwd=f.readDataFromPropertyFile("password");
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("logged in successfully",true);
	}
	@AfterMethod
	public void logout() {
		homePage hp=new homePage(driver);
		hp.getLogoutLink();
		driver.findElement(By.id("logoutLInk")).click();
		Reporter.log("logged out successfully",true);
	}
	@AfterClass
		public void closebrowser() {
			driver.close();
			Reporter.log("Browser closed",true);
		}
		@AfterSuite
		public void databasedisconnection() {
			Reporter.log("database disconnected",true);
		}
	}
	
	


