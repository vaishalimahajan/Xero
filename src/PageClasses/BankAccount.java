package PageClasses;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BankAccount {
	static WebElement element;
	WebDriver driver;
	
	public static WebElement findAccountTab(WebDriver driver) {
		element=driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
		return element;
	}
	public static void clickAccountTab(WebDriver driver) {
		element=findAccountTab(driver);
		element.click();
	}
	public static WebElement findBankAccountTab(WebDriver driver) {
		element=driver.findElement(By.xpath("//a[contains(text(),'Bank accounts')]"));
		return element;
	}
	public static void clickBankAccountTab(WebDriver driver) {
		element=findBankAccountTab(driver);
		element.click();
	}
	
	public static WebElement findAddAccountButton(WebDriver driver) {
		element=driver.findElement(By.xpath("//span[@class='text']"));
		return element;
	}
	public static void clickAddAccountButton(WebDriver driver) {
		element=findAddAccountButton(driver);
		element.click();
	}
	
	public static WebElement findSearchBankBox(WebDriver driver) {
		element=driver.findElement(By.xpath("//input[@id='xui-searchfield-1018-inputEl']"));
		return element;
	}
	public static void fillSearchBankBox(WebDriver driver, String partialBankName) {
		element=findSearchBankBox(driver);
		element.sendKeys(partialBankName);
	}
	
	
	
	public static WebElement findMoreResults(WebDriver driver) {
		element=driver.findElement(By.xpath("//a[contains(text(),' results from other countries...')]"));
		return element;
	}
	
	public static void clickMoreResults(WebDriver driver) {
		element=findMoreResults(driver);
		System.out.println("clicked on more results");
		 element.click();
	}
	
	
	
	public static void clickBankName(WebDriver driver) {
		//element=driver.findElement(By.xpath("//ul[@id='dataview-1025']"));
		//li[contains(text(),'ANZ (NZ)')]
		//element=driver.findElement(By.xpath("//div[@class='x-container xui-panel xui-container-small x-container-default']//div[@data-automationid='searchBanksList']/ul"));
		element=driver.findElement(By.xpath("//li[contains(text(),'ANZ (NZ)')]"));
		element.click();
		
		/*
		List<WebElement> results = element.findElements(By.tagName("li"));
		int size = results.size();

		System.out.println("The size of the list is: " + size);

		for (int i = 0; i < size; i++) {
			System.out.println(results.get(i).getText());
		}

		Thread.sleep(3000);
		for (WebElement result : results) {
			if (result.getText().equals(bankName)) {
				result.click();
				System.out.println("Selected: " + result.getText());
				break;
			}
		}*/
		
		
		
	}
	public static WebElement findAccountNameBox(WebDriver driver) {
		element=driver.findElement(By.xpath("//input[contains(@id,'accountname-')]"));
		return element;
	}
	public static void fillAccountName(WebDriver driver, String accName) {
		element=findAccountNameBox(driver);
		element.sendKeys(accName);
	}
	
	public static WebElement findAccountTypeBox(WebDriver driver) {
		element=driver.findElement(By.xpath("//div[contains(@id,'accounttype-') and contains(@class,'x-form-trigger x-form-trigger-default ba-combo-trigger ba-combo-trigger-default ')]"));
		System.out.println("account type: "+element);
		return element;
	}
	public static void selectAccountType(WebDriver driver) throws InterruptedException {
		element=findAccountTypeBox(driver);
		element.click();
		//element=driver.findElement(By.xpath("//ul[@data-ref=listEl]//li[0]"));
		
		element=driver.findElement(By.cssSelector(".ba-combo-list-item:nth-child(1)"));
	
		element.click();
			
	}
	
	public static WebElement findAccNumbeBox(WebDriver driver) {
		element=driver.findElement(By.xpath("//div[@class='x-field ba-field-group-item ba-field--large x-form-item x-form-item-default x-form-type-text ba-accountnumber x-field-default x-autocontainer-form-item x-form-item-no-label']//input[contains(@id,'accountnumber')]"));
		return element;
	}
	public static void fillAccNumber(WebDriver driver, String accNumber) {
		element=findAccNumbeBox(driver);
		element.sendKeys(accNumber);
	}

	public static WebElement findContinueButton(WebDriver driver) {
		element=driver.findElement(By.xpath("//a[contains(@id,'common-button-submit-')]"));
		return element;
	}
	public static void clickContinueButton(WebDriver driver) {
		element=findContinueButton(driver);
		element.click();
	}
	//
	public static WebElement findIKnowButton(WebDriver driver) {
		//element=driver.findElement(By.xpath("//div[@id='bankaccounts-root']//button[@data-automationid='connectbank-buttonDownloadForm']"));
		//element=driver.findElement(By.xpath("//a[@href='https://bankaccounts.xero.com/!Gsx9f/connect/21aa230b-ad51-4756-949d-19028adbb0bd/upload-form']"));
		element=driver.findElement(By.cssSelector("body.xui-body.x-sandbox:nth-child(2) div:nth-child(3) div.bankaccounts section.xui-superpanel footer.xui-superpanel--footer.xui-actions.xui-actions-layout > a.xui-button.xui-button-standard.xui-button-fullwidth-layout.xui-actions--secondary:nth-child(1)"));
		return element;
	}
	public static void ClickIKnowButton(WebDriver driver) {
		element=findIKnowButton(driver);
		
		element.click();
	}
	
	public static WebElement findDownloadFormButton(WebDriver driver) {
		//element=driver.findElement(By.xpath("//div[@id='bankaccounts-root']//button[@data-automationid='connectbank-buttonDownloadForm']"));
		element=driver.findElement(By.cssSelector("body.xui-body.x-sandbox:nth-child(2) div:nth-child(3) div.bankaccounts section.xui-superpanel footer.xui-superpanel--footer.xui-actions.xui-actions-layout > button.xui-button.xui-actions--primary.xui-button-main.xui-button-fullwidth-layout:nth-child(2)"));
		return element;
	}
	public static void clickDownloadFormButton(WebDriver driver) {
		element=findDownloadFormButton(driver);
		System.out.println("Clicking on download button");
		
		element.click();
	}
	
	
	public static WebElement findUploadLaterButton(WebDriver driver) {
		//element=driver.findElement(By.xpath("//div[@id='bankaccounts-root']//button[@data-automationid='connectbank-buttonDownloadForm']"));
		//element=driver.findElement(By.xpath("//a[@href='https://bankaccounts.xero.com/!Gsx9f/connect/21aa230b-ad51-4756-949d-19028adbb0bd/upload-form-later"));
	    element=driver.findElement(By.cssSelector("body.xui-body.x-sandbox:nth-child(2) div:nth-child(3) div.bankaccounts section.xui-superpanel footer.xui-superpanel--footer.xui-actions.xui-actions-layout > a.xui-button.xui-button-standard.xui-button-fullwidth-layout.xui-actions--secondary:nth-child(1)"));
		return element;
	}
	public static void clickUploadLaterButton(WebDriver driver) {
		element=findUploadLaterButton(driver);
		
		element.click();
	}
	
	public static WebElement findGoDashboardButton(WebDriver driver) {
		//element=driver.findElement(By.xpath("//div[@id='bankaccounts-root']//button[@data-automationid='connectbank-buttonDownloadForm']"));
		//element=driver.findElement(By.xpath("//a[@href='https://go.xero.com/Dashboard/"));
		element=driver.findElement(By.cssSelector("body.xui-body.x-sandbox:nth-child(2) div:nth-child(3) div.bankaccounts section.xui-superpanel footer.xui-superpanel--footer.bankaccounts-panel--footer-single-action > a.xui-button.xui-button-main.xui-button-fullwidth-layout"));
		return element;
	}
	public static void clickGoDashboardButton(WebDriver driver) {
		element=findGoDashboardButton(driver);
		
		element.click();
	}
	
	
	public static WebElement findUploadFormButton(WebDriver driver) {
		//element=driver.findElement(By.cssSelector(".bankaccounts-uploadform--fileinput"));
		element=driver.findElement(By.cssSelector("body.xui-body.x-sandbox:nth-child(2) div:nth-child(3) div.bankaccounts section.xui-superpanel footer.xui-superpanel--footer.xui-actions.xui-actions-layout > button.xui-button.xui-actions--primary.xui-button-main.xui-button-fullwidth-layout:nth-child(2)"));
		return element;
	}

	public static void uploadForm(WebDriver driver) throws AWTException, InterruptedException {
		element=findUploadFormButton(driver);
		element.click();
		String filePath = "/Users/likhesh/Documents/Selenium_Eclipse/Xero/src/Resources/mindfulness1.jpg";
		StringSelection stringSelection= new StringSelection(filePath);
		//Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		Robot robot = new Robot();
		// Cmd + Tab
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(2000);
		// Goto Window
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_G);
		// Paste the clipboard value
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_V);
		// Hit Enter Key
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
	}
	
	


	

	
	/*
	@FindBy(xpath="//div[@id='xui-searchfield-1018-trigger-trigger']")
	static
	WebElement findSearchBank;
	
	@FindBy(xpath="//ul[@id='dataview-1025']")
	WebElement findsearchresultPanel;
	
	List<WebElement> bankList= findsearchresultPanel.findElements(By.tagName("li"));
	
	
	
	
	
	public static void fillSearchBox (WebDriver driver,String bankName) {
		searchBankBox.sendKeys(bankName);
	}
	
	public static void clickSearchbutton(WebDriver driver) {
		findSearchBank.click();
	}*/
	

}
