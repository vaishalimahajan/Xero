package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement element = null;
	
	public static WebElement findUserName(WebDriver driver) {
		element=driver.findElement(By.id("email"));
		return element;
	}
	
	public static void  fillUsername(WebDriver driver, String email) {
		element=findUserName(driver);
		element.sendKeys(email);
	}
	
	public static WebElement findPassword(WebDriver driver) {
		element=driver.findElement(By.id("password"));
		return element;
	}
	
	public static void  fillPassword(WebDriver driver, String pass) {
		element=findPassword(driver);
		element.sendKeys(pass);
	}
	public static WebElement findLoginButton(WebDriver driver) {
		element=driver.findElement(By.id("submitButton"));
		return element;
	}
	
	public static void  clickLoginButton(WebDriver driver) {
		element=findLoginButton(driver);
		element.click();
	}
	

}
