package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage {
public static WebElement element = null;
public static String key;
public String sampleQuestion1="What is your dream car?";
public String sampleQuestion2="What is your dream job?";
public String sampleQuestion3="What was the name of your first pet?";
public static String answer;
	/*
	public static WebElement findEnterKey(WebDriver driver) {
		element=driver.findElement(By.xpath("//button[@data-automationid='auth-authenticatorsetupview1']"));
		return element;
	}
	
	public static String copyKey(WebDriver driver) {
		
		element=findEnterKey(driver);
		key =element.getText();
		return key;
	}
	
	public static void clickContinueButton(WebDriver driver) {
		
		element=driver.findElement(By.xpath("//button[@data-automationid='auth-continuebutton']"));
		element.click();
	}
	*/
	public static WebElement findAuthenticationBox(WebDriver driver) {
		element=driver.findElement(By.xpath("//input[@data-automationid='auth-onetimepassword--input']"));
		return element;
	}
	
	public static void  fillAuthenticationBox(WebDriver driver, String key) {
		
		element=findAuthenticationBox(driver);
		element.sendKeys(key);
	}
	//auth-submitcodebutton
	
	public static WebElement findLoginButton(WebDriver driver) {
		element=driver.findElement(By.xpath("//button[@data-automationid='auth-submitcodebutton']"));
		return element;
	}
	
	public static void clickLoginbutton(WebDriver driver) {
		element=findLoginButton(driver);
		element.click();
	}
	
	
	public static WebElement findAnotherMethod(WebDriver driver) {
		element=driver.findElement(By.xpath("//button[@data-automationid='auth-othermethodbutton']"));
		return element;
	}
	
	public static void clickAnotherMethod(WebDriver driver) {
		element=findAnotherMethod(driver);
		element.click();
	}
	
	//ol[@class='xui-panel xui-margin-top-xlarge xui-contentblock']//li[2]//button[1]
	
	public static WebElement findSecurityOption(WebDriver driver) {
		element=driver.findElement(By.xpath("//button[@data-automationid='auth-authwithsecurityquestionsbutton']"));
		return element;
	}
	
	public static void clickSecurityOption(WebDriver driver) {
		element=findSecurityOption(driver);
		element.click();
	}
	//span[@class='auth-firstquestion xui-text-label xui-fieldlabel-layout']
	
	public static WebElement findFirstQuestion(WebDriver driver) {
		element=driver.findElement(By.xpath("//span[@class='auth-firstquestion xui-text-label xui-fieldlabel-layout']"));
		return element;
	}
	
	public static String getFirstQuestion(WebDriver driver) {
		String firstQuestion;
		firstQuestion=findFirstQuestion(driver).getText();
		return firstQuestion;
	}
	public static WebElement findFirstAnswerbox(WebDriver driver) {
		element=driver.findElement(By.xpath("//form//label[1]//div[1]//input[1]"));
		return element;
	}
	public static void fillFirstAnswerbox(WebDriver driver, String Answer) {
		element=findFirstAnswerbox(driver);
		element.sendKeys(Answer);
		
	}
	
	public static WebElement findSecondQuestion(WebDriver driver) {
		element=driver.findElement(By.xpath("//span[@class='auth-secondquestion xui-text-label xui-fieldlabel-layout']"));
		return element;
	}
	
	public static String getSecondQuestion(WebDriver driver) {
		String secondQuestion;
		secondQuestion=findSecondQuestion(driver).getText();
		return secondQuestion;
	}
	public static WebElement findSecondAnswerbox(WebDriver driver) {
		element=driver.findElement(By.xpath("//form//label[2]//div[1]//input[1]"));
		return element;
	}
	public static void fillSecondAnswerbox(WebDriver driver, String Answer) {
		element=findSecondAnswerbox(driver);
		element.sendKeys(Answer);
		
	}
	public static WebElement findSecurityLoginButton(WebDriver driver) {
		element=driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
	}
	
	public static void clickLoginButton(WebDriver driver) {
		
		element=findSecurityLoginButton(driver);
		element.click();

	}
	
	public static String getAnswer(WebDriver driver, String question) {
		 
		 switch(question) {
		 case "What is your dream car?":
			 	answer="Audi";
			 	break;
			 							
			 
		 					
	    case "What is your dream job?":
		     answer="Automation Engineer";
		     break;
		    						
		 
	        				
        case "What was the name of your first pet?":
        	answer="Rocky";
        	break;
        	
        default:
        	System.out.println("Wrong Questions");
        	
        	
        	
	 
		 	}
		 return answer;
		
	}

}
