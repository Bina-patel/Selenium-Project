package com.testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

// Test scenario -2 for total mails and mails for page one...
public class InboxPageFile extends LocatorsFile implements LoginDataFile {
	
	
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
		Thread.sleep(2000);
		
	}

   public void countMailFirstPage() throws InterruptedException
     {
    System.out.println("Test-5");
	   
	   searchEmail.sendKeys("testdata7046@gmail.com");
	  
	  	  nextButton.click();
	  
	   System.out.println("Hello,you have successfully enter email");
	   
	   searchPassword.sendKeys("Test@123");
	     
	   passNextButton.click();
	   
	   System.out.println("Wel-come to Gmail");
		
		  Thread.sleep(5000);
		  
		 // String count = totalMailNumber.getText();
		  String onPageMail = onPageMailNumber.getText();
		  
		//  System.out.println("Total Number of mails on account is : " + count);
		  System.out.println("Total Number of mail on inbox page one: "+ onPageMail);
		  
		  
		 
	   }
   
   public void countTotalMails() throws InterruptedException {
        System.out.println("Test-6");
	   
	   searchEmail.sendKeys("testdata7046@gmail.com");
	  
	  	  nextButton.click();
	  	  
	  	Thread.sleep(2000);
	  
	   System.out.println("Hello,you have successfully enter email");
	   
	   searchPassword.sendKeys("Test@123");
	   
	   Thread.sleep(2000);
	     
	   passNextButton.click();
	   
	   System.out.println("Wel-come to Gmail");
		
		  Thread.sleep(5000);
		
		  String count = totalMailNumber.getText();
		  System.out.println("Total Number of mails on account is : " + count);
   }
}
