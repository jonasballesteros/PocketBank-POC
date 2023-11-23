package com.PocketBank.utility;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;
import org.testng.Reporter;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.myBank.pages.AppObjects;
import com.myBank.utility.Utils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class BaseClass {
	protected AndroidDriver driver;
	protected AppObjects appObjects;
	protected Utils utils;
	

	
	
	public static String userName = System.getenv("BROWSERSTACK_USERNAME"); 
	public static String accessKey = System.getenv("BROWSERSTACK_ACCESSKEY"); 
	public static String buildName_PocketBank = System.getenv("BROWSERSTACK_BUILD_NAME"); 
	public static String app_PocketBank = System.getenv("BROWSERSTACK_APP_ID_PocketBank"); 
	
  
	
    public static String URL = "http://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
		
    @BeforeMethod(alwaysRun = true)
    public void setUp() throws IOException {
    	 
    	
    	MutableCapabilities capabilities = new UiAutomator2Options();
    	
    	HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
    	browserstackOptions.put("appiumVersion", "2.0.1");
    	capabilities.setCapability("bstack:options", browserstackOptions);
    	
		//jenkins config
		capabilities.setCapability("deviceName", "Samsung Galaxy S21");
		capabilities.setCapability("os_Version", "12.0");
		capabilities.setCapability("Project","PocketBank"); 
		capabilities.setCapability("build", buildName_PocketBank); 
		capabilities.setCapability("name", buildName_PocketBank);
		capabilities.setCapability("app", app_PocketBank); 

        driver = new AndroidDriver(new URL(URL), capabilities);
      	
        appObjects = new AppObjects(driver);
        utils = new Utils(driver);
    }
    
	
    
	
	@AfterMethod(alwaysRun = true)
    public void tearDown() {
    	System.out.print(" ");
    	driver.closeApp();
    	
    }
}