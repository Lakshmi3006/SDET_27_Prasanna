package com.crm.autodesk.objrepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name= "user_name")
	private WebElement usernameedit;
	
	@FindBy(name = "user_password")
	private WebElement passwordedit;
	
	@FindBy(id = "submitButton")
	private WebElement loginlnk;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameedit() {
		return usernameedit;
	}

	public WebElement getPasswordedit() {
		return passwordedit;
	}

	public WebElement getLoginlnk() {
		return loginlnk;
	}
	
//Business Library
	public void login(String username , String password) {
		usernameedit.sendKeys(username);
		passwordedit.sendKeys(password);
		loginlnk.click();
	}
	
	}
	

