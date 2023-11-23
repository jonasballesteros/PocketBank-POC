package com.browserstack;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.PocketBank.pages.AppObjects;
import com.PocketBank.utility.BaseClass;
import com.PocketBank.utility.Utils;

public class FinalExamPOC extends BaseClass {
	
	@Test
	// PB_01 will create new account and perform adding account into the transaction history and verify if the account is created
		public void PB_01_NewAccount() throws MalformedURLException {
			
			appobjects = new appObjects(driver);
			
			appobjects.clickOnElement(appobjects.registerbtn);
			appobjects.firstname.sendKeys("jonas");
			appobjects.lastname.sendKeys("ballesteros");
			appobjects.email.sendKeys("test1@gmail.com");
			appobjects.iban.sendKeys("test");
			appobjects.password.sendKeys("test");
			appobjects.confirmpassword.sendKeys("test");
			appobjects.clickOnElement(appobjects.male);
			appobjects.clickOnElement(appobjects.registerbtn1);
			appobjects.username.sendKeys("test1@gmail.com");
			appobjects.password1.sendKeys("test");
			appobjects.clickOnElement(appobjects.loginbtn);
			
			appobjects.clickOnElement(appobjects.transactionhistory);
			appobjects.clickOnElement(appobjects.addbtn);
			appobjects.beneficiaryname.sendKeys("jonas");
			appobjects.accountnumber.sendKeys("12345");
			appobjects.amount.sendKeys("1000");
			appobjects.clickOnElement(appobjects.sendmoneybtn);
			
		}
		
	// PB_02 will view the transaction in report view by amount	
		public void PB_02_ViewRaport() throws MalformedURLException {
			
			appobjects.username.sendKeys("test1@gmail.com");
			appobjects.password1.sendKeys("test");
			appobjects.clickOnElement(appobjects.loginbtn);
			
			appobjects.clickOnElement(appobjects.transactionhistory);
			appobjects.clickOnElement(appobjects.addbtn);
			appobjects.beneficiaryname.sendKeys("jonas");
			appobjects.accountnumber.sendKeys("12345");
			appobjects.amount.sendKeys("1000");
			appobjects.clickOnElement(appobjects.sendmoneybtn);
			
			appobjects.navigateBack();
			
			appobjects.clickOnElement(appobjects.raports);		
			appobjects.clickOnElement(appobjects.alltransactionbyamount);
			appobjects.raportamount.sendKeys("5000");
			appobjects.clickOnElement(appobjects.viewreport);
			
		}
	// PB_04 will perform deletion of account and validate invalid username and password	
		public void PB_04_DeleteAccount() throws MalformedURLException {
			
			appobjects.username.sendKeys("test1@gmail.com");
			appobjects.password1.sendKeys("test");
			appobjects.clickOnElement(appobjects.loginbtn);
			appobjects.clickOnElement(appobjects.deleteaccount);
    }	
     
    
    
}
    
    
    
    
 
    
    
    
    
    
    




