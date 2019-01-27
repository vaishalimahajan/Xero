package Tests;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import PageClasses.LoginPage;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import PageClasses.AuthenticationPage;
import PageClasses.BankAccount;
import PageClasses.DashboardPage;
//import  PageClasses.BankAccount;

//import java.util.Scanner;
//import PageClasses.ReadExcel;

public class AddBankAccount {
	private WebDriver driver;
	private String baseUrl;
	private String partialBankName = "ANZ";
	//private String bankName= "ANZ (NZ)";

	private String answer1;
	private String answer2;
	
	private String accName="Andrew Morris5";
	
	//private String accName=ReadExcel.getAccountName();
	//private String accType="Everyday (day-to-day)";
	private String accNumber="04561087656344";

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/likhesh/Documents/Selenium_Eclipse/Drivers/chromedriver");
		driver= new ChromeDriver();
	  //driver = new FirefoxDriver();
		baseUrl = "https://login.xero.com/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @Test
  public void addBankAccount_ValidInputs() throws InterruptedException, AWTException {
	  driver.get(baseUrl);
	
	  LoginPage.fillUsername(driver, "m.vaishalee@gmail.com");
	  LoginPage.fillPassword(driver, "Xerofeb2019");
	  LoginPage.clickLoginButton(driver);
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  AuthenticationPage.clickAnotherMethod(driver);
	  AuthenticationPage.clickSecurityOption(driver);
	  String firstQuestion=AuthenticationPage.getFirstQuestion(driver);
	  System.out.println(firstQuestion);
	  answer1=AuthenticationPage.getAnswer(driver, firstQuestion);
	  AuthenticationPage.fillFirstAnswerbox(driver, answer1);
	  
	  String secondQuestion=AuthenticationPage.getSecondQuestion(driver);
	  
	  System.out.println(secondQuestion);
	  answer2=AuthenticationPage.getAnswer(driver, secondQuestion);
	  
	  AuthenticationPage.fillSecondAnswerbox(driver, answer2);
	  
	  AuthenticationPage.clickLoginButton(driver);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  BankAccount.clickAccountTab(driver);
	  BankAccount.clickBankAccountTab(driver);
	  BankAccount.clickAddAccountButton(driver);
	  
	
	  
	  BankAccount.fillSearchBankBox(driver,partialBankName);
	  //boolean moreresult=BankAccount.findMoreResults(driver).isDisplayed();
	  System.out.println("More result link is avaialble");
	  System.out.println(driver.getTitle()); 
	  BankAccount.clickMoreResults(driver);
	  System.out.println(driver.getTitle()); 
	  BankAccount.clickBankName(driver);
	  /*
	  if (moreresult==true) {
		  BankAccount.clickMoreResults(driver);
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  BankAccount.clickBankName(driver, bankName);
	  //BankAccount.clickSearchbutton(driver);
	  }
	  else {
		  BankAccount.clickBankName(driver, bankName);
	  }*/
	  BankAccount.fillAccountName(driver, accName);
	  BankAccount.selectAccountType(driver);
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  BankAccount.fillAccNumber(driver, accNumber);
	  
	  BankAccount.clickContinueButton(driver);
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  BankAccount.ClickIKnowButton(driver);
	  BankAccount.clickUploadLaterButton(driver);
	  BankAccount.clickGoDashboardButton(driver);
	  /*
	  String winHandleBefore = driver.getWindowHandle();
	  BankAccount.clickDownloadFormButton(driver);
	  Thread.sleep(3000);
	  driver.switchTo().window(winHandleBefore);
	 
	  BankAccount.uploadForm(driver);*/
	  DashboardPage.clickUserName(driver);
	  DashboardPage.clickLogout(driver);
	  
  }

  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
