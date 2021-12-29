package com.crm.autodesk.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.autodesk.objrepo.HomePage;
import com.crm.autodesk.objrepo.LoginPage;

public class BaseClass {

	public Datautility dLib = new Datautility();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebdriverUtility wLib = new WebdriverUtility();
	
	public WebDriver driver = null;
	public static WebDriver sdriver;
	
	
@BeforeSuite(groups = {"smokesuite","regression suite"})

public void dataBaseConnection () {
	dLib.connectToDB();
	System.out.println("========Database connection=========");
}

//@Parameters("browser")    
@BeforeClass(groups = {"smokesuite","regression suite"})

public void launchBrowser() throws Throwable {
	
	String BROWSER = fLib.getPropertyKeyValue("browser");
	String URL = fLib.getPropertyKeyValue("url");
	if(BROWSER.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		
	}else if (BROWSER.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		
	}else if (BROWSER.equalsIgnoreCase("ie")) {
		driver = new InternetExplorerDriver();
		
	}
	
	else {
		System.out.println("invalid Browser");
	}

    sdriver = driver;
	wLib.WaitForPageToLoad(driver);
	wLib.MaximizeTheWindow(driver);
	driver.get(URL);
	System.out.println("========BROWSER LAUNCHED=========");
}

@BeforeMethod(groups = {"smokesuite","regression suite"})

public void loginPage() throws Throwable {
	
	String USERNAME = fLib.getPropertyKeyValue("username");
	String PASSWORD = fLib.getPropertyKeyValue("password");
	
	LoginPage lp = new LoginPage(driver);
	lp.login(USERNAME, PASSWORD);
	System.out.println("=======Login Launched=====");
	
}
@AfterMethod(groups = {"smokesuite","regression suite"})

public void logoutPage()
{
	
	HomePage hp = new HomePage(driver);
	hp.logout(driver);
	System.out.println("=======logout driver========");
}

@AfterClass(groups = {"smokesuite","regression suite"})

public void closeBrowser() {
	
	driver.quit();
	System.out.println("=======close browser=======");
	
}

@AfterSuite(groups = {"smokesuite","regression suite"})
public void closeDataBase() {
	
	dLib.closeDB();
	System.out.println("=======close DataBase=========");
	
}
	

	
}

	
 