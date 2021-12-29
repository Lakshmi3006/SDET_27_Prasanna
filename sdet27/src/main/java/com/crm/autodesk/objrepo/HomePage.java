package com.crm.autodesk.objrepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.GenericUtility.WebdriverUtility;



public class HomePage extends WebdriverUtility {
	
		@FindBy(linkText = "Organizations")
		private WebElement orglnk;
		
		@FindBy(linkText = "Contacts")
		private WebElement contlnk;
		
		@FindBy(linkText = "Opportunities")
		private WebElement opplnk;
		
		@FindBy(linkText = "Products")
		private WebElement prdlnk;
		
		@FindBy(linkText = "Documents")
		private WebElement doclnk;
		
		@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
		private WebElement adminimag;
		
		@FindBy(linkText = "Sign Out")
		private WebElement signoutlnk;
		
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		
	}

		public WebElement getOrglnk() {
			return orglnk;
		}

		public WebElement getContlnk() {
			return contlnk;
		}

		public WebElement getOpplnk() {
			return opplnk;
		}

		public WebElement getPrdlnk() {
			return prdlnk;
		}

		public WebElement getDoclnk() {
			return doclnk;
		}

		public WebElement getAdminimag() {
			return adminimag;
		}

		public WebElement getSignoutlnk() {
			return signoutlnk;
		}
//business library
		public void clickonOrgslink() {
			orglnk.click();
}

public void clickonContactslink() {
	contlnk.click();
}
public void clickonProductslink() {
	prdlnk.click();
	
}
public void logout(WebDriver driver) {
	
	mouseOverOnElemnet(driver ,adminimag );
	signoutlnk.click();
	
}

}

