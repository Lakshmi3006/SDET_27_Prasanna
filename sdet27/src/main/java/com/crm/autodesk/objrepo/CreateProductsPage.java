package com.crm.autodesk.objrepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.GenericUtility.WebdriverUtility;



public class CreateProductsPage extends WebdriverUtility {

@FindBy(name = "productname")
private WebElement prodnameEdit;

@FindBy(name = "productcategory")
private WebElement prodcatoDropDown;

@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement savebtn;


public CreateProductsPage(WebDriver driver) {
PageFactory.initElements(driver, this);	
}

public WebElement getProdnameEdit() {
	return prodnameEdit;
}

public WebElement getProdcatoDropDown() {
	return prodcatoDropDown;
}


public WebElement getSavebtn() {
	return savebtn;
}
//Business Library
public void createProduct(String pro , String procat) {
	prodnameEdit.sendKeys(pro);
	select(prodcatoDropDown ,procat );
	savebtn.click();
}

}


























