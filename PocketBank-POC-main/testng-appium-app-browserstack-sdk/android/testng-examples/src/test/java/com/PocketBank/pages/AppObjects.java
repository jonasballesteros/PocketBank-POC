package com.PocketBank.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.myBank.utility.Utils;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AppObjects extends Utils{
	public AndroidDriver driver;
	
	public AppObjects(AndroidDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	@AndroidFindBy(id="com.example.proiectmobilebanking:id/register_button")
	public WebElement registerbtn;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_firstName")
	public WebElement firstname;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_lastName")
	public WebElement lastname;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_email")
	public WebElement email;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_iban")
	public WebElement iban;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_password")
	public WebElement password;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_confirmPassword")
	public WebElement confirmpassword;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/rb_male")
	public WebElement male;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/bt_register")
	public WebElement registerbtn1;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/tv_username")
	public WebElement username;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/tv_password")
	public WebElement password1;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/login_button")
	public WebElement loginbtn;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/imgHistory")
	public WebElement transactionhistory;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/fabAdd")
	public WebElement addbtn;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_beneficiary2")
	public WebElement beneficiaryname;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_accountNumber2")
	public WebElement accountnumber;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_amount2")
	public WebElement amount;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btn_send2")
	public WebElement sendmoneybtn;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btnRaport")
	public WebElement raports;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btnRaportAmount")
	public WebElement alltransactionbyamount;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btnRaportAmount")
	public WebElement raportamount;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btnViewRaportAmount")
	public WebElement viewreport;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btnDeleteAccount")
	public WebElement deleteaccount;
	
	
	
	
	
	public void clickOnElement(WebElement ele) {
		ele.click();
	}
	
	public String getToastMessage() {
		WebElement toastElem = driver.findElement(By.xpath(".//*[contains(@text, 'Transaction Successful!')]"));
		return toastElem.getText();
	}
	
	public String getSender() {
		WebElement senderElem = driver.findElement(By.id("com.sleepingpandaaa.bankingsystem:id/name1"));
		return senderElem.getText();
	}
	
	public String getReceiver() {
		WebElement receiverElem = driver.findElement(By.id("com.sleepingpandaaa.bankingsystem:id/name2"));
		return receiverElem.getText();
	}
	
	public String moneySent() {
		WebElement moneySentElem = driver.findElement(By.id("com.sleepingpandaaa.bankingsystem:id/AccBal"));
		return moneySentElem.getText();
	}
	
	public String transferStatus() {
		WebElement transferStatusElem = driver.findElement(By.id("com.sleepingpandaaa.bankingsystem:id/transaction_status"));
		return transferStatusElem.getText();
	}
	
	public String getSenderName() {
		WebElement senderNameElem = driver.findElement(By.xpath(".//*[contains(@text, 'Customer Name: Nikita')]"));
		return senderNameElem.getText();
	}
	
	public String getReceiverName() {
		WebElement receiverNameElem = driver.findElement(By.xpath(".//*[contains(@text, 'Customer Name: Shebon')]"));
		return receiverNameElem.getText();
	}
	
	
	public void sendkeys(String str) {
		AmountField.sendKeys(str);
	}

	



	 }



	
	

}

