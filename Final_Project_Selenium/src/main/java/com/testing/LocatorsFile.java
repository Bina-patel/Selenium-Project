package com.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {
	
	@FindBy(xpath = "//*[@id=\"identifierId\"]") public WebElement searchEmail;
	//@FindBy(xpath="//*[text()= \"Next\"]")  public WebElement nextButton;
	@FindBy(xpath = "//*[@id=\"identifierNext\"]") public WebElement nextButton;
	@FindBy(xpath="//div[@class =\"o6cuMc\"]") public WebElement errorMessage;
	//@FindBy(xpath="//div[@id =\"password\"]/div/div/div[1]") public WebElement searchPassword;
	@FindBy(xpath="//input[@name= \"Passwd\"]") public WebElement searchPassword;
	
	@FindBy(xpath = "//div[@id=\"passwordNext\"]") public WebElement passNextButton;
	@FindBy(xpath = "//div[@class=\"o6cuMc\"]") public WebElement blnkErrorMsg;
//	@FindBy(xpath = "//div[@jscontroller=\"yGClXb\"]/div[2]") public WebElement passErrorMsg;

	// valid email n blnk pass mate
	
	@FindBy(xpath = "//div[@jsname=\"h9d3hd\"]/div[2]") public WebElement wrngPassErrorMsg;
	
	@FindBy(xpath = "//div[@class=\"aeH\"]/div/div/div[2]/div/span/div[1]/span/span[2]") public WebElement totalMailNumber;

	@FindBy(xpath = "//div[@class=\"aeH\"]/div/div/div[2]/div/span/div[1]/span/span[1]/span[2]") public WebElement onPageMailNumber;


	//locators for selecting mail and trashing
	@FindBy(xpath = "//div[@class=\"aeH\"]/div/div/div[2]/div/span/div[1]/span/span[2]") public WebElement totalMailBeforeTrash;
	@FindBy(xpath = "//div[@class=\"Cp\"]/div/table/tbody/tr[2]/td[2]") public WebElement selectIdMail ;
	@FindBy(xpath = "//div[@class=\"G-tF\"]/div[2]/div[3]") public WebElement deleteMail ;
	@FindBy(xpath = "//div[@class=\"aeH\"]/div/div/div[2]/div/span/div[1]/span/span[2]") public WebElement totalMailAfterTrash;
	@FindBy(xpath = "//*[@id=\"gs_lc50\"]/input[1]") public WebElement searchBin;
	@FindBy(xpath = "//div[@class=\"aeH\"]/div[2]/div[2]/div/div/div/div/div/div/span") public WebElement searchSelectBox;
	@FindBy(xpath = "//div[@class=\"aeH\"]/div[2]/div[2]/div/div/div/div[5]/div[1]/div[1]") public WebElement  goToMoveButton;
	
	@FindBy(xpath = "//div[@class=\"J-M agd aYO jQjAxd aX2\"]/div/div[6]") public WebElement selectInboxOption;
	@FindBy(xpath = "//div[@class=\"nM\"]/div[2]/div/div/div[1]/div[1]/div/div[1]") public WebElement moveToInbox;
	@FindBy(xpath = "//div[@class=\"aeH\"]/div/div/div[2]/div/span/div[1]/span/span[2]") public WebElement mailAfterRecovered;
	
	//for Read and unread mail
	@FindBy(xpath = "//div[@class=\"aDP\"]/div[1]/div[2]/div/table/tbody/tr[8]/td[2]/div") public WebElement selectAnyMail;
//	@FindBy(xpath = "//div[@class=\"aDP\"]/div[1]/div[2]/div/table/tbody/tr[4]/td[2]/div") public WebElement selectAnyMailAgain;
	@FindBy(xpath = "//div[@class=\"aDP\"]/div[1]/div[2]/div/table/tbody/tr[8]/td[2]/div") public WebElement selectAnyMailAgain;
	@FindBy(xpath = "//div[@class=\"G-tF\"]/div[3]/div[2]/div") public WebElement moveRdToUnrd;
	@FindBy(xpath = "//div[@class=\"G-tF\"]/div[3]/div[1]/div") public WebElement moveUnrdToRd;


}
