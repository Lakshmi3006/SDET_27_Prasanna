package com.crm.autodesk.objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	@FindBy(xpath =("//img[@title= 'Create Organization...']"))
	private WebElement createorglookupimg;
	
	
	@FindBy(name = "search_text")
	private WebElement searchtextedit;
	
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateorglookupimg() {
		return createorglookupimg;
	}

	public WebElement getSearchtextedit() {
		return searchtextedit;
	}
	
	//business
	public void clickonCreateOrg() {
		createorglookupimg.click();
		
	}
	
	
	
	
	
	
}

