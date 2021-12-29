package com.crm.autodesk.objrepo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.GenericUtility.WebdriverUtility;


public class CreateContactPage extends WebdriverUtility
{

	@FindBy(name = "lastname")
	private WebElement lastnameEdit;
	
	@FindBys({@FindBy(name = "account_name"), @FindBy(xpath = "//img[@src ='themes/softed/images/select.gif']")})
	private WebElement orgnamelookupicon;
	
	@FindBy(name = "search_text")
	private WebElement orgsearchtext;
	
	@FindBy(name = "search")
	private WebElement orgsearchbtn;
	
	@FindBy(xpath = "//input[@title ='Save [Alt+S]']")
	private WebElement savebtn;
	
	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastnameEdit() {
		return lastnameEdit;
	}

	public WebElement getorgnamelookupicon() {
		return orgnamelookupicon;
	}
	

	public WebElement getOrgsearchtext() {
		return orgsearchtext;
	}

	

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
	//business library
	
	public void createContact(String contact) {
		lastnameEdit.sendKeys(contact);
		savebtn.click();
	}
	
	public void  createContactWithOrg(String contact , String org , WebDriver driver) throws Throwable {
		lastnameEdit.sendKeys(contact);
		orgnamelookupicon.click();
		switchToWindow(driver,"Accounts" );
		orgsearchtext.sendKeys(org);
		orgsearchbtn.click();
		driver.findElement(By.linkText(org)).click();
		
		switchToWindow(driver , "Contacts");
		
		savebtn.click();
		
		
		
		
		
	}

	
		
	}
	
	
	
	
	
	
	


