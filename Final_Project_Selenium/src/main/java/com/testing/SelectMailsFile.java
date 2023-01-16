package com.testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectMailsFile extends LocatorsFile implements LoginDataFile{
	
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
		Thread.sleep(4000);
	}

	public void selectOneMail() throws InterruptedException {
		
		System.out.println("Test-7");
	    searchEmail.sendKeys("testdata7046@gmail.com");
			  
	  	 nextButton.click();
	   searchPassword.sendKeys("Test@123");
	     
	   passNextButton.click();
	   
	   System.out.println("Welcome to Gmail");
		
		  Thread.sleep(7000);
		  
        String count1 = totalMailBeforeTrash.getText();
		  System.out.println("Before Trashing one mail, the total number of mail is: "+ count1); 
		  
		  Thread.sleep(5000);
		 
		selectIdMail.click();
	 	Thread.sleep(7000);
	 
	
	    deleteMail.click();
		  
	    Thread.sleep(7000);
		  
         String count2 = totalMailAfterTrash.getText();
	    System.out.println("After Trashing one mail, the total number of mail is: "+ count2); 
	    
	    Thread.sleep(5000);
	  
	   
	    //WebElement SearchBin= driver.findElement(By.xpath("//*[@id=\"gs_lc50\"]/input[1]"));
	
	    searchBin.click();
	    Thread.sleep(5000);
		searchBin.sendKeys("in:trash");
		searchBin.sendKeys(Keys.ENTER);
	    
		Thread.sleep(7000);
	   
	    searchSelectBox.click();
	
	      Thread.sleep(7000);
	    
	   goToMoveButton.click();
	   
	    Thread.sleep(7000);
	  
	    selectInboxOption.click();
	    
	    Thread.sleep(5000);
	    
	    moveToInbox.click();
	    
	    Thread.sleep(5000);
	    
	    String count3 = mailAfterRecovered.getText();
		System.out.println("The total mails after recovering back in Inbox:"+ count3);
		  
	}
	

}
