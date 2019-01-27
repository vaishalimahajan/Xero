package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
public static WebElement element = null;
	
	public static WebElement findUserName(WebDriver driver) {
		element=driver.findElement(By.cssSelector("body.center.xeroV2.bridge.ext-chrome.x-sandbox:nth-child(2) header.xrh-header.xrh-header-business.xrh-header-wide div.xrh-header--main:nth-child(2) ol.xrh-addons.xrh-header-background-color li.xrh-addon.xrh-addon-lastvisible:nth-child(5) button.xrh-button.xrh-addon--iconbutton.xrh-header--iconbutton.xrh-focusable--parent div.xrh-focusable--child.xrh-iconwrapper > abbr.xrh-avatar.xrh-avatar-color-8"));
		return element;
	}
	
	public static void  clickUserName(WebDriver driver) {
		element=findUserName(driver);
		element.click();
	}
	
	public static WebElement findLogout(WebDriver driver) {
		element=driver.findElement(By.cssSelector("body.center.xeroV2.bridge.ext-chrome.x-sandbox:nth-child(2) header.xrh-header.xrh-header-business.xrh-header-wide div.xrh-header--main:nth-child(2) ol.xrh-addons.xrh-header-background-color li.xrh-addon.xrh-addon-lastvisible:nth-child(5) div.xrh-dropdown-layout.xrh-addon--dropdown.xrh-dropdown-is-open.xrh-dropdown-is-opening.xrh-dropdown-positionright div.xrh-dropdown--panel div.xrh-dropdown--body ol.xrh-verticalmenu li.xrh-verticalmenuitem.xrh-verticalmenuitem-lefticon:nth-child(5) > a.xrh-verticalmenuitem--body"));
		return element;
	}
	
	public static void  clickLogout(WebDriver driver) {
		element=findLogout(driver);
		element.click();
	}
	
}
