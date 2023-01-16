package com.testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ReadToUnreadFile extends LocatorsFile implements LoginDataFile {
	
	//Test Scenario -4 for read to unread and likewise
	
public WebDriver driver;
	
	public void openBrowser() throws IOException, InterruptedException {
		
		//Opening Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binap\\eclipse-workspace\\Final_Project_Selenium\\Project_Data\\drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		
		//Setup Driver Property
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		PageFactory.initElements(driver, this);	

	}
	public void closeBrowser() {		
		driver.quit();
	}
	 public void openURL() throws Exception {	
		
		driver.get(URL);	//opening any URL
		Thread.sleep(5000);
	}
    public void readMailToUnread() throws InterruptedException {
    	System.out.println("Test-8");
    	
	    searchEmail.sendKeys("testdata7046@gmail.com");
			  
	  	 nextButton.click();
	     searchPassword.sendKeys("Test@123");
	     
	     passNextButton.click();
	   
	    System.out.println("Welcome to Gmail");
		
		  Thread.sleep(5000);
		  
		  selectAnyMail.click();
		  Thread.sleep(5000);
		  
		  moveRdToUnrd.click();
		  
          Thread.sleep(8000);
      
          if(selectAnyMailAgain.isSelected())
		  selectAnyMailAgain.click();
		 
          Thread.sleep(5000);
		  moveUnrdToRd.click();

		  }
 /*   public void unreadMailToRead() throws InterruptedException {
    	
       System.out.println("Test-9");
    	
	    searchEmail.sendKeys("testdata7046@gmail.com");
			  
	  	 nextButton.click();
	     searchPassword.sendKeys("Test@123");
	     
	     passNextButton.click();
	   
	    System.out.println("Welcome to Gmail");
		
		  Thread.sleep(5000);
		  selectAnyMailAgain.click();
		  Thread.sleep(5000);
		  moveUnrdToRd.click();
		 
    	
    }
    */
}
