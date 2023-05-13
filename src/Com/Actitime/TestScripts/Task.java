package Com.Actitime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.Actitime.GenericLibrary.FileLibrary;
import Com.Actitime.GenericLibrary.baseClass;
import Com.Actitime.ObjectRepository.TaskPage;
import Com.Actitime.ObjectRepository.homePage;

public class Task extends baseClass{
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
		homePage hp=new homePage(driver);
		hp.getTasktab().click();
		
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewCust().click();
		//tp.getCstmrname().sendKeys("");
		FileLibrary f=new FileLibrary();
		String createcustomer = f.readdataFromExcel("sheet1", 2, 1);
		tp.getCustname().sendKeys(createcustomer);
		String description = f.readdataFromExcel("sheet1", 2,1);
		tp.getCustdesp().sendKeys(description);
		
		tp.getCuster().click();
		String excpectedresult = createcustomer;
		String Actualresult=driver.findElement(By.xpath("(//div[.='"+createcustomer+"'])[2]")).getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(Actualresult, excpectedresult);
		s.assertAll();
	}

}
