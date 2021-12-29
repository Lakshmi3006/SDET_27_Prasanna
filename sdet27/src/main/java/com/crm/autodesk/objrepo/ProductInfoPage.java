package com.crm.autodesk.objrepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {

	@FindBy(className = "lvtHeaderText")
	private WebElement produtinfo;
	
	public ProductInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProdutinfo() {
		return produtinfo;
	}
	
	//Business Library
	public String prodInfoText() {
		return(produtinfo.getText());
	}
	
	
	
	
}

