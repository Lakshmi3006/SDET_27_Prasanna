package com.crm.autodesk.objrepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.GenericUtility.WebdriverUtility;

public class CreateOrganisationPage extends WebdriverUtility {
	

@FindBy(name = "accountname")
private WebElement orgname;

@FindBy(name = "industry")
private WebElement IndustryDropDown;

@FindBy(name = "accounttype")
private WebElement TypeDropDown;

@FindBy(xpath = "//input[@title ='Save [Alt+S]']")
private WebElement Savebtn;

public CreateOrganisationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getOrgname() {
	return orgname;
}

public WebElement getIndustryDropDown() {
	return IndustryDropDown;
}

public WebElement getTypeDropDown() {
	return TypeDropDown;
}

public WebElement getSavebtn() {
	return Savebtn;
}
	//business library
public void CreateOrg(String org ) {
	orgname.sendKeys(org);
   Savebtn.click();
}

public void CreateOrgWithInduAndType(String org , String ind , String type1) {
	orgname.sendKeys(org);
	select(IndustryDropDown , ind);
	select(TypeDropDown , type1);
	Savebtn.click();
	
}

	
	
	
	
	
	
	
	
	
}
