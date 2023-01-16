package com.testing;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile {
	
	LoginPageFile lpf = new LoginPageFile();
	InboxPageFile ip = new InboxPageFile();
	SelectMailsFile smf = new SelectMailsFile();
	ReadToUnreadFile rtf = new ReadToUnreadFile();
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		lpf.openBrowser();
		ip.openBrowser();
	    smf.openBrowser();
	    rtf.openBrowser();
		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		lpf.closeBrowser();
	}
	
	
  @Test(priority=1)	
  public void invalidEmailTest() throws Exception {
	  lpf.openURL();
	  lpf.invalidEmail();
  }
  
  @Test(priority=2)	
  public void noEmailAndPhoneTest() throws Exception {
	  
	  lpf.openURL();
	  lpf.noEmailAndPhone();
	  
  }
 
  @Test (priority=3)	
  public void correctEmailPasswordTest() throws Exception {
	  lpf.openURL();
	  lpf.correctEmailPassword();
  } 
  
  @Test (priority=4)	
  public void correctEmailInvalidPassTest() throws Exception {
	  lpf.openURL();
     lpf.correctEmailInvalidPass();
  }
  
  //Tests for mail for inbox first page
  
  @Test (priority=5)
  public void countMailFirstPageTest() throws Exception {
	 ip.openURL();
	 ip.countMailFirstPage();
  }
 
  @Test(priority=6)
  public void countTotalMailsTest() throws Exception {
	  ip.openURL();
	  ip.countTotalMails();
	  
  }
  
  @Test (priority=7)
  public void selectOneMailTest() throws Exception {
	
	  smf.openURL();
	  smf.selectOneMail();
  }
 
  @Test(priority=8)
  public void readToUnreadFileTest() throws Exception {
	  rtf.openURL();
	  rtf.readMailToUnread();
	  //both steps are combined in one.
  }
  

}
