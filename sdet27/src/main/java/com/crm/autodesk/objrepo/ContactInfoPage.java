package com.crm.autodesk.objrepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {

	
	@FindBy(className = "dvHeaderText")
	private WebElement contactInfo;
	
	@FindBy(id = "mouseArea_Organization Name")
	private WebElement orgcreatedInfo;
	
	public ContactInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactInfo() {
		return contactInfo;
	}
	
	public WebElement getOrgcreatedInfo() {
		return orgcreatedInfo;
	}

	//business library
	public String contInfoText() {
		return(contactInfo.getText());
	}
	public String orgInfoText() {
		return(orgcreatedInfo.getText());
	}
	
	
	
}

