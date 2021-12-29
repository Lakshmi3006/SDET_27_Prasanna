package com.crm.autodesk.objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInfoPage {

	@FindBy(className = "dvHeaderText")
	private WebElement orginfotest;
	
	@FindBy(id = "dtlview_Industry")
	private WebElement IndustryCretedinfo;
	 
	@FindBy(id = "dtlview_Type")
	private WebElement TypeCreatedInfo;
	
	
	public OrganisationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrginfotest() {
		return orginfotest;
	}
	

	public WebElement getIndustryCretedinfo() {
		return IndustryCretedinfo;
	}


	public WebElement getTypeCreatedInfo() {
		return TypeCreatedInfo;
	}

	//business library
	
	public String OrgInfotext() {
		return(orginfotest.getText());
	}
	
	public String IndusInfoText() {
		return (IndustryCretedinfo.getText());
	}
	
	public String TypeInfoText() {
		return (TypeCreatedInfo.getText());
	}
	
	
	
}
