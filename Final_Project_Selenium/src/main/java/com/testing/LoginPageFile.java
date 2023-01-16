package com.testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



// Test scenario -1 for gmail login and validations....
public class LoginPageFile extends LocatorsFile implements LoginDataFile{
	
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
	
   public void invalidEmail() throws InterruptedException {
	   
	  Thread.sleep(1000);
	  System.out.println("Test-1");
	 
	  searchEmail.sendKeys("abc@gmail.com");
	  
	  nextButton.click();
	 
	 //  searchEmail.sendKeys(Keys.ENTER); // driver.findElement()
    	
    	Thread.sleep(1000);
    	
    	if(searchEmail.equals("testdata7046@gmail.com")) {
    		
    		System.out.println("Correct Email");
    		}
    	else {
    		System.out.println("Sorry, You have entered Invalid Email");
    	}
    	Thread.sleep(2000);   	
    	if(errorMessage.isDisplayed())
		   System.out.println("Error Message is : "+ errorMessage.getText());
       else
		   System.out.println("Hello, you successfully enter Email address");
		
   }
   
   public void noEmailAndPhone() throws InterruptedException {
	   
	   System.out.println("Test-2");
	   
	   String textBox = searchEmail.getAttribute("value");
	   
	   Thread.sleep(2000);
	   
	   if(textBox.isEmpty());
	    
	   System.out.println("No email or phone added");
	   
	   Thread.sleep(2000);
	   nextButton.click();
	   
	   if(blnkErrorMsg.isDisplayed())
		   
		   System.out.println("The Error message is shown: "+ blnkErrorMsg.getText());
		  
	    }

   public void correctEmailPassword() throws InterruptedException {
	   
	   System.out.println("Test-3");
	   
	   searchEmail.sendKeys("testdata7046@gmail.com");
	  
	   Thread.sleep(2000);
	   searchEmail.equals(userName);
	   
	   
	   nextButton.click();
	  
	   System.out.println("Hello,you have successfully enter email");
	   
	   Thread.sleep(2000);
	   
	   searchPassword.sendKeys("Test@123");
	   
	   Thread.sleep(2000);
	     
	   passNextButton.click();
	   
	   System.out.println("Wel-come to Gmail");
   }
   
   
   public void correctEmailInvalidPass() throws InterruptedException {
	  
	   System.out.println("Test-4");
	   searchEmail.sendKeys("testdata7046@gmail.com");
	   searchEmail.equals(userName);
	   
	   nextButton.click();
	  
	   System.out.println("Hello User,you have successfully enter email");
	   
	   Thread.sleep(5000);
	   
	   searchPassword.sendKeys("Test@1");
	   passNextButton.click();
	   
	   if( searchPassword.equals(password))
		   
		   System.out.println("Welcome!! , You have entered correct password. ");
		    
		  else
			  System.out.println("you enter wrong password");
	   
	   Thread.sleep(5000);
	   
	   if(wrngPassErrorMsg.isDisplayed())
		   System.out.println("Error Message is : " + wrngPassErrorMsg.getText());
         
   }
  //extra: valid email and blank pass
}
