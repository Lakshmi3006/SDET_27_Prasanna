package com.crm.autodesk.objrepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	@FindBy(xpath = "//img[@alt ='Create Contact...']")
	private WebElement createcontlookupImg;
	
	@FindBy(name = "search_text")
	private WebElement Searchtxtedit;
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreatecontlookupImg() {
		return createcontlookupImg;
	}

	public WebElement getSearchtxtedit() {
		return Searchtxtedit;
	}
	//business login
	public void clickonCreateContact() {
		createcontlookupImg.click();
	}
	
	
	
}
