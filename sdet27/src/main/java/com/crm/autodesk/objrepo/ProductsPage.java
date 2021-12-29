package com.crm.autodesk.objrepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.GenericUtility.WebdriverUtility;



public class ProductsPage extends WebdriverUtility {

	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement clickonProductimg;
	
	@FindBy(name = "search_text")
	private WebElement searchproduct;
	
	@FindBy(linkText = "Create Filter")
	private WebElement createfilterlnk;

	@FindBy(name = "viewName")
	private WebElement viewnameedit;

	@FindBy(name = "search_field")
	private WebElement searchfieldDropDown;

	@FindBy(linkText = "Edit")
	private WebElement editlnk;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getClickonProductimg() {
		return clickonProductimg;
	}

	public WebElement getSearchproduct() {
		return searchproduct;
	}
	public WebElement getCreatefilterlnk() {
		return createfilterlnk;
	}

	public WebElement getViewnameedit() {
		return viewnameedit;
	}

	public WebElement getSearchfieldDropDown() {
		return searchfieldDropDown;
	}


	public WebElement getEditlnk() {
		return editlnk;
	}
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	
	//Business library
	public void clickonCreateProduct() {
		clickonProductimg.click();
	}
	
	public void Createfilter(String viewname ) {

		createfilterlnk.click();
		viewnameedit.sendKeys(viewname);
		savebtn.click();
		searchfieldDropDown.click();

		}

		public void selectFromFilter(String viewname) {
			createfilterlnk.click();
			viewnameedit.sendKeys(viewname);
			savebtn.click();
			searchfieldDropDown.click();
			editlnk.click();
			
			
		}
		 
}

